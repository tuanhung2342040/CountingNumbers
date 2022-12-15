import java.util.Random;
import java.util.TimerTask;

public class Producer extends TimerTask implements Runnable {
    private Bucket bucket;
    public Producer(Bucket bucket){
        this.bucket = bucket;
    }
    @Override
    public void run() {
        try {
            while(true){
                int num = generate();
                bucket.add(num);
                Thread.sleep(1);
            }
        }
        catch (InterruptedException e){
        }
    }

    private int generate(){
        Random random = new Random();
        return random.nextInt( 256);
    }
}
