import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import java.time.LocalDateTime;

public class Clock extends Application {
    private final static int CX = 250;
    private final static  int CY = 250;
    private final static int RADIUS = 225;
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        root.setPrefSize(500, 500);
        // Draw the circle of the Clock
        drawCircle(RADIUS, Color.GREY, Color.WHITE, root);


        // Draw 0,5,.. 55 minutes P(px, py)
        for(int i = 0; i < 60; i++){
            if(i % 5 != 0){
                drawMinuteDots(i, Color.BLACK, root);
            }
            else {
                drawMinuteLines(i, root);
            }
        }

        // Get the current time
        LocalDateTime now = LocalDateTime.now();
        int hours = now.getHour()%12;
        int minutes = now.getMinute();
        int seconds = now.getSecond();
        drawHands("hours", hours, minutes, 6, 90, root);
        drawHands("minutes", minutes, minutes, 4, 70, root);
        drawHands("seconds", seconds, minutes,2, 30, root);
        // Draw a dot from the center of the clock
        drawCircle(3.5, Color.RED, Color.RED, root);
        // Draw the text
        int x = 250;
        int y = 100;
        drawText(x, y, "CPSC1181", 18, root);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Clock");
        primaryStage.show();
    }

    public static void drawCircle(double radirus, Paint strokeColor, Paint color, Pane root){
        // Draw the circle of the Clock
        Arc a = new Arc(CX, CY, radirus, radirus, 0, 360);
        a.setStroke(strokeColor);
        a.setStrokeWidth(5);
        a.setFill(color);
        root.getChildren().add(a);
    }

    /**
     * Draw a text on the clock
     * @param x x-coordinate of the text
     * @param y y-coordinate of the text
     * @param message message of the text
     * @param root the root of the Pane
     */
    public static void drawText(double x, double y, String message, int size, Pane root){
        Font font = Font.font("Arial", FontWeight.BOLD ,size);
        Text tmp= new Text(message); // create a temporary text
        tmp.setFont(font);
        Bounds bound = tmp.getBoundsInLocal();
        Rectangle box = new Rectangle(bound.getMinX(), bound.getMinY(), bound.getWidth(),
                bound.getHeight());
        Shape intersection = Shape.intersect(tmp, box);
        Bounds boundingBox = intersection.getBoundsInLocal();
        double width = boundingBox.getWidth();
        tmp = new Text(x-width/2, y, message);
        tmp.setFont(font);
        tmp.setFill(Color.BROWN);
        root.getChildren().add(tmp);
    }

    /**
     *Draw value lines for the clock from 0, 5, 10, ..., to 55
     * @param value value of the minute
     * @param root the root of the Pane
     */
    public static void drawMinuteLines(int value, Pane root){
        int length = 30;
        double angle = (value-15)*2*Math.PI/60;
        double px = CX + (RADIUS-10)*Math.cos(angle);
        double py = CY + (RADIUS-10)*Math.sin(angle);
        double endX = CX + (RADIUS-length-5 )*Math.cos(angle);
        double endY = CY + (RADIUS-length)*Math.sin(angle);
        Line minutes = new Line(px, py, endX, endY);
        if(value == 0 || value == 15 || value == 30 || value == 45){
            minutes.setStrokeWidth(5);
        }
        else {
            minutes.setStrokeWidth(2);
        }
        root.getChildren().add(minutes);
    }

    /**
     * This draws the hand for the clock such as, hour hand, minute hand, and second hand.
     * @param hand hand of the clock
     * @param value value of the hand
     * @param minutes the minutes of the current time
     * @param width the width of the hand
     * @param gap the gap between the hand of the clock with the edge of the clock
     * @param root root of the Pane
     */
    public static void drawHands(String hand, double value, int minutes, int width, int gap, Pane root){
        double angle;
        if(hand.equals("hours")){
            angle = (value - 3 + (double)minutes/60)*Math.PI/6; // PI/6 = 30
        }
        else {
            angle = (value - 15)*2*Math.PI/60; // 2Pi/60 = PI/30=6
        }
        double endX = CX + (RADIUS-gap)*Math.cos(angle);
        double endY = CY + (RADIUS-gap)*Math.sin(angle);

        Line line = new Line(CX, CY, endX, endY);
        if(hand.equals("seconds")){
            line.setStroke(Color.RED);
        }
        else {
            line.setStroke(Color.BLACK);
        }
        line.setStrokeWidth(width);
        root.getChildren().add(line);
    }

    /**
     * Draws minute dots of the clock
     * @param value value of the minute from 1 to 60
     * @param color color of the Dot
     * @param root the root of the Pane
     */
    public static void drawMinuteDots(int value, Paint color, Pane root){
        double angle = (value - 15)*2*Math.PI/60;
        double px = CX + (RADIUS-10)*Math.cos(angle);
        double py = CY + (RADIUS-10)*Math.sin(angle);
        Arc a = new Arc(px, py, 2, 2, 0, 360);
        a.setStroke(color);
        root.getChildren().add(a);
    }

    //public void drawCircle();
    public static void main(String[] args) {
        launch(args);
    }

}
