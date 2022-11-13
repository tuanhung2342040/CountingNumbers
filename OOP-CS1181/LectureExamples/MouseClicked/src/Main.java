import javafx.application.Application;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;

public class Main extends Application {
    private Pane root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new Pane();
        root.setPrefSize(500, 500);
        root.setOnMouseClicked(new CircleClickEventHandler());
        Scene scene = new Scene(root);
        primaryStage.setTitle("A");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private class CircleClickEventHandler implements EventHandler<MouseEvent>{

        @Override
        public void handle(MouseEvent e) {
            root.getChildren().add(new Arc(e.getX(), e.getY(), 10, 10, 0, 360));
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}