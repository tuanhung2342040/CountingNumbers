import java.util.Random;
import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class CircleAnimationFX extends Application {

	private ArrayList<CircleFx> list;
	private CircleFx c;
	private Pane root;
	private Random rand;
	@Override
	public void start(Stage primaryStage) {
		root = new Pane();
		list = new ArrayList<CircleFx>();
		rand = new Random();
		for(int i=0; i< 200; i++){
			addCircle();
			
		}	
		
		CircleAnimation animation = new CircleAnimation();
		animation.start();
		
		Scene scene = new Scene(root, 500, 500);
		primaryStage.setTitle("FX Bouncing Ball");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void addCircle(){

		c = new CircleFx(220+rand.nextInt(30),220+rand.nextInt(30),20);
		c.setFill(Color.TRANSPARENT);
		c.setStroke(Color.RED);
		list.add(c);
		root.getChildren().addAll(c.getAllNodes());
	}
	
	private class CircleAnimation extends AnimationTimer {
		private int interval=40;
		private long arg1=0;
		@Override
		public void handle(long arg0) {
			if((arg0-arg1)/1000000 < interval)
				return;
			//System.out.println("hello");
			arg1=arg0;
			addCircle();
			list.remove(0);
			root.getChildren().remove(0);
			int g=20;
			for(CircleFx c: list){
				c.incRadius();
				c.setStroke(Color.rgb(220,g++,30));
			}
		}
	}

	private Color randomColor() {
		Random r = new Random();
		return Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256));
	}

	private class CircleFx extends Circle{
		private Ellipse cir;
		public CircleFx(double x, double y, double r){
			super(x,y,r);
			cir = new Ellipse(x,y,r,r);
		}

		public void setFill(Paint p){
			cir.setFill(p);
		}

		public void setStroke(Paint p){
			cir.setStroke(p);
		}

		public void incRadius(){
			setRadius(getRadius()+1);
			cir.setRadiusX(getRadius());
			cir.setRadiusY(getRadius());

		}



		public Node[] getAllNodes() {
			return new Node[] {cir};
		}
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
