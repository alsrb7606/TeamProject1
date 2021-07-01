package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SelectController implements Initializable{
	@FXML private Button putIn;
	@FXML private Button putOut;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		putIn.setOnAction(e->PutInCar(e));
		putOut.setOnAction(e->PutOutCar(e));
	}

	public void PutInCar(ActionEvent event) {
		try {
			Parent putin =FXMLLoader.load(getClass().getResource("PutIn.fxml"));
			Scene scene = new Scene(putin);
			Stage primaryStage =(Stage) putIn.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void PutOutCar(ActionEvent event) {
		try {
			Parent putout =FXMLLoader.load(getClass().getResource("PutOut.fxml"));
			Scene scene = new Scene(putout);
			Stage primaryStage =(Stage) putOut.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
