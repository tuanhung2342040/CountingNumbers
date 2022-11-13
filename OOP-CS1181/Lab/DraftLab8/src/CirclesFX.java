import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class CirclesFX extends Application {

    // Circle Object
    private Circle circle;

    // Line Object
    private Line line;

    // Make Root Instance Level So That It Can
// Be Accessed In Event Handlers
    private Pane root;

    @Override
    public void start(Stage primaryStage) {
        root = new Pane();

        root.setOnMousePressed(new MousePressEventHandler());
        root.setOnMouseMoved(new MouseMoveEventHandler());

// Setup Scene
        Scene scene = new Scene(root, 640, 480);
        primaryStage.setTitle("Circles");
        primaryStage.setScene(scene);
        primaryStage.show();

// Create A Red Line, Make It Invisible By Default
// Add It To Scene
        line = new Line();
        line.setVisible(false);
        line.setStroke(Color.RED);

        root.getChildren().add(line);
    }

    // Mouse Pressed Event
    private class MousePressEventHandler implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {

// Check If The User Is Already Draw A Circle
// If Not, Create A New Circle
            if (circle == null) {

                circle = new Circle();

// Set Center X, Y At Mouse Location
                circle.setCenterX(e.getX());
                circle.setCenterY(e.getY());

// Set Fill And Color
                circle.setFill(Color.TRANSPARENT);
                circle.setStroke(Color.RED);

// Set Line Position
                line.setStartX(e.getX());
                line.setStartY(e.getY());
                line.setEndX(e.getX());
                line.setEndY(e.getY());

// Make The Line Visible
                line.setVisible(true);

                root.getChildren().add(circle);

            } else {
// User Was Already Drawing The Circle
// Change It's Color To Blue
                circle.setStroke(Color.BLUE);

// Set Circle To Null
                circle = null;

// Make Line Invisible
                line.setVisible(false);
            }
        }
    }

    // Mouse Move Event
    private class MouseMoveEventHandler implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
// Check If The User Is Drawing A Circle
            if (circle != null) {

// Compute A Vector, Poiting From Center Of Circle To Current Mouse Position
                double xPos = circle.getCenterX() - e.getX();
                double yPos = circle.getCenterY() - e.getY();

// Set Circle Radius Equal To Magnitude Of The Above Vector
                circle.setRadius(Math.sqrt(xPos * xPos + yPos * yPos));

// Set Line End Position
                line.setEndX(e.getX());
                line.setEndY(e.getY());
            }
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}