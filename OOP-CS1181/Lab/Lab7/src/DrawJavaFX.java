import javafx.application.Application;
import javafx.geometry.Bounds;
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
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class DrawJavaFX extends Application {
    private Group treeGr;
    private Group smlSunGr;
    private Group rainbowGr;
    private Pane centerPane;
    private BorderPane root;
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
    private final Font f = Font.font("Arial, 15");
    private final Font font = Font.font("Arial", FontWeight.BOLD , 40);
    private final Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PURPLE, Color.PINK};

    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();

        VBox v1 = backgroundBox();
        VBox v2 = degreeBox();
        VBox v3 = textBox();
        VBox leftSide = new VBox(v1, v2, v3);

        centerPane = createPane();
        Rectangle clip = new Rectangle(0, 0, 300, 420);
        centerPane.setClip(clip);

        root.setLeft(leftSide);
        root.setCenter(centerPane);

        setDrawListener();
        setChangeTextListener();
        setRotateListener();

        Scene scene = new Scene(root);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("CPSC1181-Lab7");
        primaryStage.show();
    }

    /**
     * This sets each checkbox to the drawListener.
     */
    private void setDrawListener(){
        DrawListener dl = new DrawListener();
        smile.setOnAction(dl);
        rainBow.setOnAction(dl);
    }

    /**
     * This sets Button b and TextField tf to the ChangeTextListener.
     */
    private void setChangeTextListener(){
        ChangeTextListener cl = new ChangeTextListener();
        b.setOnAction(cl);
        tf.setOnAction(cl);
    }

    /**
     * This sets each radiusButton to the RotateListener
     */
    private void setRotateListener(){
        RotateListener rl = new RotateListener();
        r1.setOnAction(rl);
        r2.setOnAction(rl);
        r3.setOnAction(rl);
        r4.setOnAction(rl);
    }

    /**
     * This returns a VBox that contains a Text and 2 CheckBoxes.
     * @return VBox contains a Text and 2 CheckBoxes
     */
    private VBox backgroundBox(){
        Text t = new Text("Background");
        rainBow = new CheckBox("rainbox");
        smile = new CheckBox("smile");
        t.setFont(f);
        rainBow.setFont(f);
        smile.setFont(f);
        HBox h = new HBox(10, rainBow, smile);
        VBox v = new VBox(t, h);
        v.setAlignment(Pos.CENTER);
        v.setPadding(new Insets(15));
        return v;
    }

    /**
     * This returns a VBox that contains 4 radioButtons.
     * @return Vbox contains 4 radioButtons
     */
    private VBox degreeBox(){
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
        tg.selectToggle(r1);
        VBox v = new VBox(r1, r2, r3, r4);
        v.setPadding(new Insets(15));
        return v;
    }

    /**
     * This returns a VBox that contains a Text, a TextField, and a Button
     * @return VBox contains a Text, a TextField, and a Button.
     */
    private VBox textBox(){
        Text t = new Text("Caption");
        tf = new TextField();
        b = new Button("Change text");
        t.setFont(f);
        tf.setFont(f);
        b.setFont(f);
        VBox v = new VBox(t, tf, b);
        v.setAlignment(Pos.CENTER);
        v.setPadding(new Insets(15));
        return v;
    }

    /**
     * This returns a Pane the has grass, and a tree as default.
     * @return Pane has grass and a tree.
     */
    private Pane createPane(){
        Rectangle r = new Rectangle(0, 300, 300, 120);
        r.setFill(Color.GREEN);

        treeGr = new Group(new Tree(100, 320).getNodes());
        smlSunGr = new Group();
        rainbowGr = new Group();
        text = createText();

        return new Pane(r, treeGr, smlSunGr, rainbowGr, text);
    }

    /**
     * This returns an empty text with yellow and font's font and locationAt(150, 380)
     * @return empty text with yellow and font's font and locationAt(150, 380)
     */
    private Text createText(){
        text = new Text(150, 380,"");
        text.setFill(Color.YELLOW);
        text.setFont(font);
        return text;
    }

    /**
     * This sets the x and y coordinate of the text such that the text is in the center of the grass background
     * @param x x-coordinate of the text
     * @param y y-coordinate of the text
     * @param message the text
     */
    private void changeText(double x, double y, String message){
        Text tmp= new Text(message); // create a temporary text
        tmp.setFont(font);
        Bounds bound = tmp.getBoundsInLocal();
        Rectangle box = new Rectangle(bound.getMinX(), bound.getMinY(), bound.getWidth(),
                bound.getHeight());
        Shape intersection = Shape.intersect(tmp, box);
        Bounds boundingBox = intersection.getBoundsInLocal();
        //returns width of the bounding box
        double width = boundingBox.getWidth();
        text.setX(x-width/2);
        text.setY(y);
        text.setText(message);
    }

    /**
     * Creates a Tree inner class
     */
    private class Tree {
        private Group gr;
        private final int WTRUNK = 20;
        private final int HTRUNK = 100;
        private final int WLEAVES = 40;
        private final int HLEAVES = 60;

        /**
         * This constructs a Tree that has a trunk and leaves
         * @param x x-coordinate of the tree
         * @param y y-coordinate of the tree
         */
        public Tree(int x, int y) {
            gr = new Group();
            Rectangle trunk = new Rectangle(x-WTRUNK/2, y-HTRUNK, WTRUNK, HTRUNK);
            trunk.setFill(Color.SADDLEBROWN);

            Ellipse leaves = new Ellipse(x,y-HTRUNK,WLEAVES,HLEAVES);
            leaves.setFill(Color.rgb(30,120,80));

            gr.getChildren().addAll(trunk, leaves);
        }

        /**
         * This returns group contains the trunk and the leaves
         * @return group contains trunk and the leaves
         */
        public Group getNodes(){
            return gr;
        }
    }

    /**
     * Creates a Sun inner class
     */
    private class Sun {
        private Group gr;
        private int x;
        private int y;
        private int radius;

        /**
         * This constructs a Sun with center (x, y) and radius
         * @param x x-coordinate of the sun
         * @param y y-coordinate of the sun
         * @param radius radius of the sun
         */
        public Sun(int x, int y, int radius){
            gr = new Group();
            this.x = x;
            this.y = y;
            this.radius = radius;
            Arc sun = new Arc(x, y, radius, radius, 0, 360);
            sun.setFill(Color.YELLOW);
            Arc mouth = new Arc(x, y + 10, radius - 15, radius - 15, 0, -180);
            mouth.setType(ArcType.CHORD);
            gr.getChildren().addAll(sun, mouth,
                    new Arc(x - 10, y - 5, radius - 25, radius - 25, 0, 360),
                    new Arc(x + 10, y - 5, radius - 25, radius - 25, 0, 360));
        }

        /**
         * This returns the group contains the sun
         * @return group contains the sun
         */
        private Group getNodes(){
            return gr;
        }
    }

    /**
     * Creates a Rainbow inner class
     */
    private class Rainbow{
        private Group gr;
        private int x;
        private int y;
        private int radius;

        /**
         * This constructs a Rainbo with center(x, y), and radius
         * @param x x-coordinate of the rainbow
         * @param y y-coordinate of the rainbow
         * @param radius radius of the rainbow
         */
        public Rainbow(int x, int y, int radius){
            gr = new Group();
            this.x = x;
            this.y = y;
            this.radius = radius;

            for (int i = 0; i < 7; i ++) {
                int t = 5*i;
                Ellipse e = new Ellipse(x, y, radius - t+50, radius - t);
                e.setStroke(colors[i]);
                e.setStrokeWidth(5);
                e.setFill(Color.TRANSPARENT);
                gr.getChildren().add(e);
            }
        }

        /**
         * This returns the group contains the rainbow
         * @return group contains rainbow
         */
        private Group getNode(){
            return gr;
        }
    }

    /**
     * This creates a DrawListener to draw a Rainbow or/and a Sun
     */
    private class DrawListener implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            if (smile.isSelected()) {
                Sun s = new Sun(220, 50, 30);
                smlSunGr.getChildren().add(s.getNodes());
                smlSunGr.setVisible(true);
            }
            else {
                smlSunGr.setVisible(false);
            }

            if (rainBow.isSelected()) {
                Rainbow rb = new Rainbow(150, 300, 200);
                rainbowGr.getChildren().add(rb.getNode());
                rainbowGr.setVisible(true);
            }
            else {
                rainbowGr.setVisible(false);
            }
        }
    }

    /**
     * This creates a RotateLister to rotate the tree either 0, 90, 180, 270 degrees.
     */
    private class RotateListener implements  EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
           Toggle selectedRadio = tg.getSelectedToggle();
           if(selectedRadio == r1){
              treeGr.setRotate(0);
           }
           else if(selectedRadio == r2){
              treeGr.setRotate(90);
           }
           else if(selectedRadio == r3){
              treeGr.setRotate(180);
           }
           else {
               treeGr.setRotate(270);
           }
        }
    }

    /**
     * This creates a ChangeTextListener that changes the text in the grass background.
     */
    private class ChangeTextListener implements  EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            changeText(150, 380, tf.getText());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
