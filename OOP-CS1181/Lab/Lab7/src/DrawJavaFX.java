import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class DrawJavaFX extends Application {
    private Pane centerPane;
    private BorderPane mainPane;
    private CheckBox rainBow;
    private CheckBox smile;
    private RadioButton r1;
    private RadioButton r2;
    private RadioButton r3;
    private ToggleGroup tg;
    private RadioButton r4;
    private TextField tf;
    private Button b;
    private Text text;

    private Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PURPLE, Color.PINK};

    @Override

    public void start(Stage primaryStage) {
        centerPane = new Pane();
        mainPane = new BorderPane();

        Font f = Font.font("Arial", 15);
        Text t1 = new Text("Background");
        t1.setFont(f);
        rainBow = new CheckBox("rainbox");
        rainBow.setFont(f);
        smile = new CheckBox("smile");
        smile.setFont(f);
        HBox h1 = new HBox(10, rainBow, smile);
        VBox v1 = new VBox(t1, h1);
        v1.setAlignment(Pos.CENTER);
        v1.setPadding(new Insets(15));

        r1 = new RadioButton("0 Degree");
        r2 = new RadioButton("90 Degree");
        r3 = new RadioButton("180 Degree");
        r4 = new RadioButton("270 Degree");

        r1.setFont(f);
        r2.setFont(f);
        r3.setFont(f);
        r4.setFont(f);

        tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        r4.setToggleGroup(tg);
        VBox v2 = new VBox(r1, r2, r3, r4);
        v2.setPadding(new Insets(15));

        Text t2 = new Text("Caption");
        t2.setFont(f);
        tf = new TextField();
        t2.setFont(f);
        b = new Button("Change text");
        b.setFont(f);
        VBox v3 = new VBox(t2, tf, b);
        v3.setAlignment(Pos.CENTER);
        v3.setPadding(new Insets(15, 15, 115, 15));
        VBox leftSide = new VBox(v1, v2, v3);

        Rectangle r = new Rectangle(0, 300, 300, 120);
        r.setFill(Color.GREEN);
        centerPane.getChildren().add(r);

        Tree tree = new Tree(100, 320);

        DrawListener dl = new DrawListener();
        smile.setOnAction(dl);
        rainBow.setOnAction(dl);
        ChangeTextListener cl = new ChangeTextListener();
        b.setOnAction(cl);
        tf.setOnAction(cl);

        mainPane.setLeft(leftSide);
        mainPane.setCenter(centerPane);


        Scene scene = new Scene(mainPane);
        //primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Clock");
        primaryStage.show();
    }
    private class Tree {
        private Group gr;
        private Rectangle trunk;
        private Ellipse leaves;
        private final int WTRUNK = 20;
        private final int HTRUNK = 100;
        private final int WLEAVES = 40;
        private final int HLEAVES = 60;
        public Tree(int x, int y) {
            trunk = new Rectangle(x-WTRUNK/2, y-HTRUNK, WTRUNK, HTRUNK);
            trunk.setFill(Color.SADDLEBROWN);
            leaves = new Ellipse(x,y-HTRUNK,WLEAVES,HLEAVES);
            leaves.setFill(Color.rgb(30,120,80));
            centerPane.getChildren().addAll(trunk, leaves);
          //  gr.getChildren().addAll(trunk, leaves);
        }
        public Group getNodes(){
            return gr;
        }
    }

    public class DrawListener implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            if (smile.isSelected()) {
                int x = 220;
                int y = 50;
                int radius = 30;
                Arc sun = new Arc(x, y, radius, radius, 0, 360);
                sun.setFill(Color.YELLOW);
                Arc mouth = new Arc(x, y + 10, radius - 15, radius - 15, 0, -180);
                mouth.setType(ArcType.CHORD);
                centerPane.getChildren().addAll(sun, mouth,
                        new Arc(x - 10, y - 5, radius - 25, radius - 25, 0, 360),
                        new Arc(x + 10, y - 5, radius - 25, radius - 25, 0, 360));
            }
            if (rainBow.isSelected()) {
                int x = 150;
                int y = 300;
                int radius = 200;
                for (int i = 0; i < 7; i ++) {
                    int t = 5*i;
                    Ellipse e = new Ellipse(x, y, radius - t+50, radius - t);
                    e.setStroke(colors[i]);
                    e.setStrokeWidth(5);
                    e.setFill(Color.TRANSPARENT);
                    centerPane.getChildren().add(e);
                }

            }
        }
    }
    public class ChangeTextListener implements  EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            Font f = Font.font("Arial", 65);
            text = new Text(20, 380, "");
            text.setFont(f);
            text.setText(tf.getText());
            centerPane.getChildren().add(text);
        }
    }

    public class RotateListener implements  EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            tg.getSelectedToggle();

        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
