import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.ArrayList;


public class Q2 extends Application {
	private Pane displayPane;
	private ArrayList<Ellipse> circles;
	
 
	@Override
	public void start(Stage primaryStage) {
		
		displayPane = new Pane();
		displayPane.setPrefSize(400,400);
		Rectangle background = new Rectangle(0,0,400,400);
		background.setFill(Color.rgb(230,230,230)); 
		displayPane.getChildren().add(background);
		Button animate = new Button("Animate");
		
		BorderPane root = new BorderPane();
		root.setLeft(animate);
		root.setCenter(displayPane);


		circles = new ArrayList<Ellipse>();
		displayPane.setOnMouseClicked(new CreateAction());
		animate.setOnAction(new AnimateAction());
		
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("Q2");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private class CreateAction implements EventHandler<MouseEvent>{
		@Override
		public void handle(MouseEvent e){
			Ellipse c = new Ellipse(e.getX(), e.getY(), 10,10);
			c.setStroke(Color.BLUE);
			c.setFill(Color.BLUE);
			displayPane.getChildren().add(c);
			circles.add(c);
			
			if(circles.size()<=1)
				return;

			Line l = new Line(c.getCenterX(), c.getCenterY(), circles.get(circles.size()-2).getCenterX(),circles.get(circles.size()-2).getCenterY()-2);
			l.setStroke(Color.BLUE);
			displayPane.getChildren().add(l);
		}
	}
	
	private class AnimateAction implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent e){
			 SequentialTransition seq = new SequentialTransition();
			for(Ellipse c: circles){
        		ScaleTransition scale= new ScaleTransition();
        		scale.setDuration(Duration.millis(1000)); 
        		scale.setByX(2);
        		scale.setByY(2);
        		scale.setCycleCount(2);   
        		scale.setAutoReverse(true);
        		scale.setNode(c); 
        		seq.getChildren().add(scale);
			}
        	seq.play();
		}
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
