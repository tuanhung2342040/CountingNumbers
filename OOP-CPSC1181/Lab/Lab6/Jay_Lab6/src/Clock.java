import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.time.LocalDateTime;

public class Clock extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        root.setPrefSize(500, 500);
        // Draw the circle of the Clock
        int cx = 250;
        int cy = 250;
        int cRadius = 225;
        Arc a = new Arc(cx, cy, cRadius, cRadius, 0, 360);
        a.setStroke(Color.GREY);
        a.setStrokeWidth(5);
        a.setFill(Color.WHITE);
        root.getChildren().add(a);

        // Draw 0,5,.. 55 minutes P(px, py)
        for(int i = 0; i < 60; i++){
            if(i % 5 != 0){
                drawDot(i, cRadius, cx, cy, Color.BLACK, root);
            }
        }
        int length = 30;
        for(int i = 0; i < 60; i+=5) {
            drawMinutes(i, length, cRadius, cx, cy, root);
        }
        LocalDateTime now = LocalDateTime.now();
        int hours = now.getHour()%12;
        int minutes = now.getMinute();
        int seconds = now.getSecond();
        drawFromCenter("hours", hours, minutes, 6, cRadius-90, cx, cy, root);
        drawFromCenter("minutes", minutes, minutes, 4, cRadius-70, cx, cy, root);
        drawFromCenter("seconds", seconds, minutes,2, cRadius-30, cx, cy, root);

        //
        Arc center = new Arc(cx, cy, 3.5, 3.5, 0, 360);
        center.setFill(Color.RED);
        root.getChildren().add(center);
        int x = 250;
        int y = 100;
        drawText(x, y, "CPSC1181", root);
//        drawText(250, 80, "12", root);
//        drawText(250, 430, "6", root);
//        drawText(430, 255, "3", root);
//        drawText(70, 255, "9", root);



        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Clock");
        primaryStage.show();

    }
    public static void drawText(int x, int y, String message, Pane root){
        Font font = Font.font("Arial", FontWeight.BOLD ,18);
        Text tmp= new Text(message); // create a temporary text
        tmp.setFont(font);
        Bounds bound = tmp.getBoundsInLocal();
        Rectangle box = new Rectangle(bound.getMinX(), bound.getMinY(), bound.getWidth(),
                bound.getHeight());
        Shape intersection = Shape.intersect(tmp, box);
        Bounds boundingBox = intersection.getBoundsInLocal();
        double width = boundingBox.getWidth();
        // returns width of the bounding box
        //double height = boundingBox.getHeight();
        // returns height of the bounding box
        // Now your text will be center aligned
        tmp = new Text(x-width/2, y, message);
        tmp.setFont(font);
        tmp.setFill(Color.BROWN);
        root.getChildren().add(tmp);
    }
    public static void drawMinutes(int minute, int length, int radius, int cx, int cy, Pane root){
        double angle = (minute-15)*2*Math.PI/60;
        double px = cx + (radius-10)*Math.cos(angle);
        double py = cy + (radius-10)*Math.sin(angle);
        double endX = cx + (radius-length-5 )*Math.cos(angle);
        double endY = cy + (radius-length)*Math.sin(angle);
        Line minutes = new Line(px, py, endX, endY);
        if(minute == 0 || minute == 15 || minute == 30 || minute == 45){
            minutes.setStrokeWidth(5);
        }
        else {
            minutes.setStrokeWidth(2);
        }
        root.getChildren().add(minutes);
    }
    public static void drawFromCenter(String hand, double value, int minutes, int width,  int radius, int cx, int cy, Pane root){
        double angle;
        if(hand.equals("hours")){
            angle = (value - 3 + (double)minutes/60)*Math.PI/6; // PI/6 = 30
        }
        else {
            angle = (value - 15)*2*Math.PI/60; // 2Pi/60 = PI/30=6
        }
        double endX = cx + radius*Math.cos(angle);
        double endY = cy + radius*Math.sin(angle);

        Line line = new Line(cx, cy, endX, endY);
        if(hand.equals("seconds")){
            line.setStroke(Color.RED);
        }
        else {
            line.setStroke(Color.BLACK);
        }
        line.setStrokeWidth(width);
        root.getChildren().add(line);
    }

    public static void drawDot(int value, int radius, int cx, int cy, Paint color, Pane root){
        double angle = (value - 15)*2*Math.PI/60;
        double px = cx + (radius-10)*Math.cos(angle);
        double py = cy + (radius-10)*Math.sin(angle);
        Arc a = new Arc(px, py, 2, 2, 0, 360);
        a.setStroke(color);
        root.getChildren().add(a);
    }

    //public void drawCircle();
    public static void main(String[] args) {
        launch(args);
    }

}
