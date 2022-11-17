import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.text.Text;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Lab9 extends Application {

    private Label l1;
    private Label l2;
    private TextField t1;
    private TextField t2;
    private HBox h1;
    private HBox h2;
    private VBox v1;
    private Button count;
    private Pane root;
    private String startDate = "1/1/2000";
    private String endDate;

    private DataVerifier startDateVe;
    private DataVerifier endDateVe;
    private String startDay = "1";
    private String startMonth = "1";
    private String startYear = "2000";
    private String endDay;
    private String endMonth;
    private String endYear;



    @Override
    public void start(Stage primaryStage) {
        root = new Pane();
        v1 = addVBox();

        count.setOnAction(new CountHandler());

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Date Counter");
        primaryStage.show();

    }

    private void splitStartDate() throws ArrayIndexOutOfBoundsException{
        startDate = t1.getText();
        String[] dateArray =  startDate.split("/");
        startDay = dateArray[0];
        startMonth = dateArray[1];
        startYear = dateArray[2];
    }

    private void splitEndDate() throws ArrayIndexOutOfBoundsException{
        endDate = t2.getText();
        String[] dateArray =  endDate.split("/");
        endDay = dateArray[0];
        endMonth = dateArray[1];
        endYear = dateArray[2];
    }

    private String getDetailedDate() throws DateTimeException, NumberFormatException{
        LocalDate start = LocalDate.of(Integer.valueOf(startYear), Integer.valueOf(startMonth)
                , Integer.valueOf(startDay));
        LocalDate end = LocalDate.of(Integer.valueOf(endYear), Integer.valueOf(endMonth),
                Integer.valueOf(endDay));
        Period duration = Period.between(start, end);
        // use Period getDays(), getMonths(), and getYears() method for the duration. Check Java API for more info.
        long numberOfDays = ChronoUnit.DAYS.between(start, end);
        // returns number of days between two dates. Check Java API for mor info.
        int days = duration.getDays();
        int months = duration.getMonths();
        int years = duration.getYears();
        return "" + days + " days\n" + months + " months\n" + years + " years\n" +  numberOfDays + " days";
    }
    private  VBox addVBox(){
        l1 = new Label("Start Date:");
        t1 = new TextField(startDate);
        h1 = new HBox(10, l1, t1);

        l2 = new Label("End Date:");

        t2 = new TextField(getDefaultEndDate());
        h2 = new HBox(10, l2, t2);

        count = new Button("Count");

        VBox v = new VBox(h1, h2, count);
        VBox.setMargin(h1, new Insets(10));
        VBox.setMargin(h2, new Insets(10));
        v.setAlignment(Pos.CENTER);

        root.getChildren().add(v);
        return v;
    }

    private String getDefaultEndDate(){
        endDay = "" + LocalDateTime.now().getDayOfMonth();
        endMonth =  "" + LocalDateTime.now().getMonthValue();
        endYear =  "" + LocalDateTime.now().getYear();
        endDate = endDay + "/" + endMonth + "/" + endYear;
        return endDate;
    }


    private void showPopUpWindow(String text){
        Stage msg = new Stage(); // We can have as many stages as we need
        msg.initModality(Modality.APPLICATION_MODAL);
        VBox dialogVbox = new VBox(20);
        dialogVbox.getChildren().add(new Text(text));
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        msg.setScene(dialogScene);
        msg.show();
    }
    private boolean isCorrectFormat(){

        try{
            splitStartDate();
            splitEndDate();
            startDateVe = new DataVerifier(startDay, startMonth, startYear);
            endDateVe = new DataVerifier(endDay, endMonth, endYear);
            startDateVe.checkDay();
            startDateVe.checkMonth();
            startDateVe.checkyear();
            endDateVe.checkDay();
            endDateVe.checkMonth();
            endDateVe.checkyear();
        }
        catch (CPSC1181Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        catch (NumberFormatException e){
            System.out.println("Errors: You input chars instead of numbers");
            return false;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Errors: You are accessing the index that does not exist");
            return false;
        }

        return true;
    }


    private class CountHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            if(isCorrectFormat()) {
                try{
                    showPopUpWindow(getDetailedDate());
                }
                catch (NumberFormatException e){
                    System.out.println("Errors: You input chars instead of numbers");
                }
                catch (DateTimeException e){
                    System.out.println("Errors: you input either the invalid day or the invalid month" );
                }
            }
            else {
                showPopUpWindow("Errors occur. Please check the errors show below");
            }

        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

