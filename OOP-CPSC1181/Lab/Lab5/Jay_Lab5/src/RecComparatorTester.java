import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RecComparatorTester {
    public static void main(String[] args) {
        //3.4 Testing the rectangle comparator
        //Comparator<Rectangle> comp = new RectangleComparator();
        //3.5 Inner class
        Comparator<Rectangle> comp = new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle r1, Rectangle r2) {
                if((r1.getHeight()*r1.getWidth()) > (r2.getHeight()*r2.getWidth())){
                    return 1;
                }
                else if((r1.getHeight()*r1.getWidth()) < (r2.getHeight()*r2.getWidth())){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        };
        ArrayList<Rectangle> rect = new ArrayList<>();
        Rectangle rect1 = new Rectangle(5, 10, 20, 30);
        Rectangle rect2 = new Rectangle(10, 20, 30, 15);
        Rectangle rect3 = new Rectangle(20, 30, 45, 10);
        rect.add(rect1);
        rect.add(rect2);
        rect.add(rect3);

        Collections.sort(rect, comp);
        for(Rectangle r : rect){
            System.out.println(r);
        }


    }
}
