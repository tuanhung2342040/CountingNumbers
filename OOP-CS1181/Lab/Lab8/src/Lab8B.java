import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.Random;


public class Lab8B extends Application {
		private TextField numOfCircles;
		private TextField duration;
		private Button start;
		private Pane display;
		private Random r;
		private CircleFX cirlce;
		private final int WIDTH=800;
		private final int HEIGHT=600;
		

	@Override
	public void start(Stage primaryStage) {
		r = new Random();
		display = new Pane();

		display.setPrefWidth(WIDTH);
		display.setPrefHeight(HEIGHT);
		Rectangle clip = new Rectangle(0,0,WIDTH,HEIGHT);
		display.setClip(clip);

		VBox leftMenu = createLeftMenu();

		BorderPane root = new BorderPane();

		root.setCenter(display);
		root.setLeft(leftMenu);

		start.setOnAction(new startHandler());

		Scene scene = new Scene(root);
		primaryStage.setTitle("CPSC1181 Lab8B");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * Returns the left menu
	 * @return left menu
	 */
	private VBox createLeftMenu(){
		
		numOfCircles = new TextField("10");
		numOfCircles.setPrefColumnCount(2);
		duration = new TextField("500");
		duration.setPrefColumnCount(3);

		GridPane gridPane= new GridPane();

		gridPane.add(new Text("Number of Circles: "),0,1);
		gridPane.add(numOfCircles,1,1);

		gridPane.add(new Text("Duration(ms) : "),0,2);
		gridPane.add(duration,1,2);
		gridPane.setPadding(new Insets(25,25,5,10));
		gridPane.setHgap(10); 
		gridPane.setVgap(10);
	
		start = new Button("   Start    ");
		
		VBox leftMenu = new VBox(30,gridPane,start);
		leftMenu.setAlignment(Pos.TOP_CENTER);
		return leftMenu;

	}

	/**
	 * This returns a random integer number (50, 750)
	 * @return a random integer number (50, 750)
	 */
	private int randomNum(){
		return r.nextInt(750)+50;
	}

	/**
	 * This returns a random integer number(20, 80)
	 * @return a random integer number (20, 80)
	 */
	private int randomRadius(){
		return r.nextInt(60) + 20;
	}

	/**
	 * Returns a random color
	 * @return random color
	 */
	private Paint randomColor(){
		return Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256));
	}

	/**
	 * This creates a new CircleFx and adds it to the display pane.
	 */
	private void addCircle(){
		cirlce = new CircleFX(randomNum(), randomNum(), randomRadius());
		// add the new circle to  the display Pane
		display.getChildren().add(cirlce.getNode());
	}

	/**
	 * Sets the scaleTransition for the created circle
	 * @return scaleTransition for the created circle
	 */
	private ScaleTransition setScaleTransition(){
		ScaleTransition scale = new ScaleTransition();
		scale.setFromX(1);
		scale.setFromY(1);
		scale.setToX(0.001);
		scale.setToY(0.001);
		scale.setAutoReverse(true);
		scale.setDuration(Duration.millis(Double.valueOf(duration.getText())));
		scale.setCycleCount(3);
		scale.setNode(cirlce.getNode());
		return scale;
	}

	/**
	 * Sets the scaleTransition of each created circle to the sequentialTransition.
	 */
	private void setSeqTransition(){
		SequentialTransition sequential = new SequentialTransition();
		for(int i = 0; i < Integer.valueOf(numOfCircles.getText()); i++){
			// Creates an scaleTransition for each Node
			// Then adds it to the sequential
			addCircle();
			sequential.getChildren().add(setScaleTransition());
		}
		sequential.play();
	}

	/**
	 * This creates an event to scale circles when the start button is clicked.
	 */
	private class startHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event) {
			//Creates circles based on the input of the user.
			setSeqTransition();
		}
	}

	private class CircleFX {
		private double x;
		private double y;
		private double radius;
		private Circle cir;

		/**
		 * This constructs a Circle with x, y, radius, a random color.
		 * @param x x-coordinate of the circle
		 * @param y y-coordinate of the circle
		 * @param radius radius of the circle
		 */
		public CircleFX(double x, double y, double radius){
			this.x = x;
			this.y = y;
			this.radius = radius;
			cir = new Circle(x, y, radius);
			setFill(randomColor());
		}

		/**
		 * This sets the circle to be the p color
		 * @param p the color will be used
		 */
		private void setFill(Paint p){
			cir.setFill(p);
		}

		/**
		 * This returns the circle Node
		 * @return the circle Node
		 */
		private Node getNode(){
			return cir;
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

