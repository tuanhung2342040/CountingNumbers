import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Lab8A extends Application {

    private Group gr;
    private Pane root;
    private Line line;
    private double x1 = 0;
    private double y1 = 0;
    private double x2 = 0;
    private double y2 = 0;
    private Circle circle;
    private double radius = 0;
    @Override
    public void start(Stage primaryStage) {

        root = new Pane();
        gr = new Group();
        initLine();

        root.setOnMouseClicked(new MouseClickedHandler());
        root.setOnMouseMoved(new MouseMovedHandler());

        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("CPSC1181-Lab8");
        primaryStage.show();
    }

    /**
     * Creates a line and adds it to the group.
     */
    private void initLine(){
        line = new Line();
        line.setStroke(Color.RED);
        gr.getChildren().add(line);
        root.getChildren().add(gr);
    }

    private void setLine(double x, double y){
        line.setStartX(x);
        line.setStartY(y);
        line.setEndX(x);
        line.setEndY(y);
    }

    private void setCircle(double x, double y){
        circle.setCenterX(x);
        circle.setCenterY(y);
        circle.setStroke(Color.RED);
        circle.setFill(Color.TRANSPARENT);
    }

    /**
     * This creates an event to create a circle and line with initial location.
     */
    private class MouseClickedHandler implements EventHandler<MouseEvent>{
        @Override
        public void handle(MouseEvent e) {
            //System.out.println("ClickedHandler is called");
            if(circle == null){
                circle = new Circle();
                x1 = e.getX();
                y1 = e.getY();

                setLine(x1, y1);
                setCircle(x1, y1);

                root.getChildren().add(circle);
                gr.setVisible(true);
            }
            else {
                circle.setStroke(Color.BLUE);
                circle = null;
                gr.setVisible(false);
            }
        }
    }

    /**
     * This creates an event to set the end point for the Line and the radius for the Circle
     * when the mouse is moved
     */
    private class MouseMovedHandler implements EventHandler<MouseEvent>{
        @Override
        public void handle(MouseEvent e) {
            //System.out.println("Move is called");
            if(circle != null){
                x2 = e.getX();
                y2 = e.getY();
                line.setEndX(x2);
                line.setEndY(y2);
                radius = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
                circle.setRadius(radius);
            }

        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
