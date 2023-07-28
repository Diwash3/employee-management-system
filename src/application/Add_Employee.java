package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Add_Employee extends Application {
    static Stage stg4;
    TextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;

    @Override
    public void start(Stage stage4) throws Exception {
        this.stg4 = stage4;
        stage4.setTitle("Add New Employee Details");
        StackPane rootnode4 = new StackPane();
        Scene myscene4 = new Scene(rootnode4, 940, 600);
        HBox hbox1 = new HBox();
        HBox hbox2 = new HBox();
        HBox hbox3 = new HBox();
        HBox hbox4 = new HBox();
        HBox hbox5 = new HBox();
        HBox hbox6 = new HBox();
        HBox hbox7 = new HBox();
        hbox7.setSpacing(200);
        VBox vbox1 = new VBox();
        vbox1.setSpacing(40);
        Image img4 = new Image("https://img.freepik.com/free-photo/hr-representatives-positively-greeting-female-job-candidate_1163-4702.jpg?t=st=1658767022~exp=1658767622~hmac=aad2582b2d3e523ce05cce3351ab17680654f71fc6f581c779c862ba4ee72e3d&w=996");
        BackgroundImage backgroundimage2 = new BackgroundImage(img4,
                BackgroundRepeat.REPEAT,

                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        // create Background
        Background background2 = new Background(backgroundimage2);
        rootnode4.setBackground(background2);
        stage4.setScene(myscene4);
        Label l1 = new Label("New Employee Details");
        vbox1.setMargin(l1, new Insets(30, 0, 20, 320));
        l1.setFont(Font.font("serif", FontWeight.BOLD, 30));

        Label l2 = new Label("Name");
        hbox1.setMargin(l2, new Insets(0, 0, 0, 50));
        l2.setFont(Font.font("Time New Roman", FontWeight.BOLD, 20));

        t1 = new TextField();
        t1.setPrefColumnCount(13);
        hbox1.setMargin(t1, new Insets(0, 0, 0, 100));
        Label l3 = new Label("Father's Name");
        hbox1.setMargin(l3, new Insets(0, 0, 0, 230));
        l3.setFont(Font.font("Time New Roman", FontWeight.BOLD, 20));
        t2 = new TextField();
        t2.setPrefColumnCount(13);
        hbox1.setMargin(t2, new Insets(0, 0, 0, 30));

        Label l4 = new Label("Age");
        hbox2.setMargin(l4, new Insets(0, 0, 0, 50));
        l4.setFont(Font.font("Time New Roman", FontWeight.BOLD, 20));
        t3 = new TextField();
        t3.setPrefColumnCount(13);
        hbox2.setMargin(t3, new Insets(0, 0, 0, 120));

        Label l5 = new Label("DOB");
        hbox2.setMargin(l5, new Insets(0, 0, 0, 230));
        l5.setFont(Font.font("Time New Roman", FontWeight.BOLD, 20));
        t4 = new TextField();
        t4.setPrefColumnCount(13);
        hbox2.setMargin(t4, new Insets(0, 0, 0, 120));

        Label l6 = new Label("Address");
        hbox2.setMargin(l6, new Insets(0, 0, 0, 50));
        l6.setFont(Font.font("Time New Roman", FontWeight.BOLD, 20));
        t5 = new TextField();
        t5.setPrefColumnCount(13);
        hbox2.setMargin(t5, new Insets(0, 0, 0, 80));
        Label l7 = new Label("Mobile No");
        hbox2.setMargin(l7, new Insets(0, 0, 0, 230));
        l7.setFont(Font.font("Time New Roman", FontWeight.BOLD, 20));
        t6 = new TextField();
        t6.setPrefColumnCount(13);
        hbox2.setMargin(t6, new Insets(0, 0, 0, 70));
        Label l8 = new Label("Email ID");
        hbox3.setMargin(l8, new Insets(0, 0, 0, 50));
        l8.setFont(Font.font("Time New Roman", FontWeight.BOLD, 20));
        t7 = new TextField();
        t7.setPrefColumnCount(13);
        hbox3.setMargin(t7, new Insets(0, 0, 0, 80));
        Label l9 = new Label("Education");
        hbox3.setMargin(l9, new Insets(0, 0, 0, 230));
        l9.setFont(Font.font("Time New Roman", FontWeight.BOLD, 20));
        t8 = new TextField();
        t8.setPrefColumnCount(13);
        hbox3.setMargin(t8, new Insets(0, 0, 0, 70));
        Label l10 = new Label("Job Post");
        hbox4.setMargin(l10, new Insets(0, 0, 0, 50));
        l10.setFont(Font.font("Time New Roman", FontWeight.BOLD, 20));
        t9 = new TextField();
        t9.setPrefColumnCount(13);
        hbox4.setMargin(t9, new Insets(0, 0, 0, 80));
        Label l11 = new Label("Aadhar No");
        hbox4.setMargin(l11, new Insets(0, 0, 0, 230));
        l11.setFont(Font.font("Time New Roman", FontWeight.BOLD, 20));
        t10 = new TextField();
        t10.setPrefColumnCount(13);
        hbox4.setMargin(t10, new Insets(0, 0, 0, 60));
        Label l12 = new Label("Employee ID");
        l12.setFont(Font.font("Time New Roman", FontWeight.BOLD, 20));
        hbox5.setMargin(l12, new Insets(0, 0, 0, 50));
        t11 = new TextField();
        t11.setPrefColumnCount(13);
        hbox5.setMargin(t11, new Insets(0, 0, 0, 40));
        Button submit = new Button("Submit");
        hbox7.setMargin(submit, new Insets(0, 0, 0, 300));
        submit.setStyle("-fx-background-color: #000000;-fx-text-fill:#FFFFFF ");
        submit.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                String name = t1.getText();
                String fname = t2.getText();
                String age = t3.getText();
                String date = t4.getText();
                String address = t5.getText();
                String phone = t6.getText();
                String email = t7.getText();
                String education = t8.getText();
                String designation = t9.getText();
                String addhar = t10.getText();
                String empId = t11.getText();
                try {
                    Mysqlconn con = new Mysqlconn();
                    String q = "insert into employee values('" + name + "','" + fname + "','" + age + "','" + date + "','"
                            + address + "','" + phone + "','" + email + "','" + education + "','" + designation + "','" + addhar + "','"
                            + empId + "')";

                    con.s.executeUpdate(q);
                    Alert errorAlert = new Alert(AlertType.INFORMATION);
                    errorAlert.setHeaderText("Data added succesfully!!");
                    errorAlert.setContentText("Thank you!!");
                    errorAlert.showAndWait();
                    Add_Employee.stg4.close();
                    Details.stg3.show();
                } catch (Exception e) {
                    System.out.println("Error!!");
                }
            }
        });
        Button cancel = new Button("Cancel");
        cancel.setStyle("-fx-background-color: #000000;-fx-text-fill:#FFFFFF ");
        cancel.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                Add_Employee.stg4.close();
                Details.stg3.show();
            }
        });
        hbox1.getChildren().addAll(l2, t1, l3, t2);
        hbox2.getChildren().addAll(l4, t3, l5, t4);
        hbox3.getChildren().addAll(l6, t5, l7, t6);
        hbox4.getChildren().addAll(l8, t7, l9, t8);
        hbox5.getChildren().addAll(l10, t9, l11, t10);
        hbox6.getChildren().addAll(l12, t11);
        hbox7.getChildren().addAll(submit, cancel);
        vbox1.getChildren().addAll(l1, hbox1, hbox2, hbox3, hbox4, hbox5, hbox6, hbox7);
        rootnode4.getChildren().addAll(vbox1);
        stage4.show();
    }
}
