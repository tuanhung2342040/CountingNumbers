import java.util.TimerTask;

public class Consumer extends TimerTask implements Runnable{

    private Bucket bucket;
    public Consumer(Bucket bucket){
        this.bucket = bucket;
    }

    @Override
    public void run() {
        while(!Thread.interrupted()){
            try {
                int[] data = bucket.median();
                System.out.println("median : " + data[0] + ", size : " + data[1]);
                //5
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!!");
            }
        }
    }
}
