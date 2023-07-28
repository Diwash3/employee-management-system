package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.image.*;
import javafx.geometry.*;
import javafx.scene.text.Font;

public class Frontpage extends Application {
	static Stage stg;

	public void start(Stage mystage) throws Exception {
		this.stg = mystage;
		mystage.setTitle("Human Resource Management System");
		FlowPane rootnode = new FlowPane();
		Scene myscene = new Scene(rootnode, 500, 500);
		rootnode.setStyle("-fx-background-color:#78C0F0");
		mystage.setScene(myscene);
		Label mylabel = new Label("Human Resource Management");
		mylabel.setFont(new Font("Arial", 30));
		Image image = new Image(
				"https://thumbs.dreamstime.com/z/outsourcing-human-resources-business-internet-technology-concept-126587976.jpg");
		ImageView imageview = new ImageView(image);
		imageview.setFitHeight(500);
		imageview.setFitWidth(500);
		imageview.setPreserveRatio(true);
		Button bt1 = new Button("Click here to login");
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				try {
					Stage stage2 = new Stage();
					login n = new login();
					n.start(stage2);
					Frontpage.stg.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		rootnode.setAlignment(Pos.CENTER);
		Group root = new Group(imageview);
		rootnode.getChildren().addAll(mylabel, imageview, bt1);

		mystage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
