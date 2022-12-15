import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * class Bucket manages an ArrayList of integer numbers
 */
public class Bucket{
    private ArrayList<Integer> bucket;
    private Lock bucketLock;
    private Condition condition;
    /** Default constructor*/
    public Bucket(){
        bucket = new ArrayList<Integer>();
        bucketLock = new ReentrantLock();
        condition = bucketLock.newCondition();
    }
    /** add an element to the bucket
     * @param n: an integer number
     */
    public void add(int n){
        bucketLock.lock();
        try {
            if(bucket.size() < 50){
                bucket.add(n);
                condition.signalAll();
            }

        }
        finally {
            bucketLock.unlock();
        }

    }
    /** Calculates and returns the average of the elements of the bucket  and removes all of the elements from the bucket
     * @return the an array of integers. The first element of the array is the median value of the buckey, and second one is the size of the bucket.
     * post condition: the elements of the bucket are removed
     */
    public int[] median() throws InterruptedException{
        bucketLock.lock();
        try{
            while(bucket.size() < 50)
                condition.await();
            int[] data ={0,0};
            if(bucket.size()==0)
                return data;
            Collections.sort(bucket);
            int median = bucket.get(bucket.size()/2);
            data[0]=median;
            data[1]=bucket.size();
            reset();
            return data;
        }
        finally {
            bucketLock.unlock();
        }
    }
    /** Returns size of the bucket
     */
    public int getSize(){
        return bucket.size();
    }
    /** Removes all of elements from the bucket
     */
    private void reset(){
        bucketLock.lock();
        try{
            bucket.clear();
        }
        finally {
            bucketLock.unlock();
        }
    }
}