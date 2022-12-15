import java.util.Timer;
import java.util.TimerTask;

public class BucketThreadTester {

    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Timer timer = new Timer();

        TimerTask producer = new Producer(bucket);
        TimerTask consumer = new Consumer(bucket);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
//        thread1.start();
//        thread2.start();

        Timer timer2 = new Timer();

        timer.schedule(consumer, 10, 1000);
        timer2.schedule(producer, 10, 1000);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
        timer.cancel();
        timer2.cancel();


        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {

        }
        thread1.interrupt();
        thread2.interrupt();


    }
}