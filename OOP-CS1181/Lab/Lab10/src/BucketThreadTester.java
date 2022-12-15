import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

public class BucketThreadTester {

    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Producer producer = new Producer(bucket);
        Thread t1 = new Thread(producer);
        Consumer consumer = new Consumer(bucket);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();

        class TimerListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.interrupt();
                t2.interrupt();
            }
        }
//        Timer timer = new Timer(10000, new TimerListener());
//        timer.start();


    }


}
