import java.util.TimerTask;

public class Consumer extends TimerTask implements Runnable{

    private Bucket bucket;
    public Consumer(Bucket bucket){
        this.bucket = bucket;
    }

    @Override
    public void run() {
        try {
            while(true){
                int[] data = bucket.median();
                System.out.println("median : " + data[0] + ", size : " + data[1]);
                Thread.sleep(5);
            }
        }
        catch (InterruptedException exception){

        }
    }
}
