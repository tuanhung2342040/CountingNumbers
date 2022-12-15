import java.util.Random;
import java.util.TimerTask;
import java.util.Timer;
public class Producer extends TimerTask implements Runnable {
    private Bucket bucket;
    public Producer(Bucket bucket){
        this.bucket = bucket;
    }
    @Override
    public void run() {
        while(!Thread.interrupted()){
            int num = generate();
            bucket.add(num);
            //System.out.println(num);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!!");
            }
        }
    }

    private int generate(){
        Random random = new Random();
        return random.nextInt( 256);
    }
}
