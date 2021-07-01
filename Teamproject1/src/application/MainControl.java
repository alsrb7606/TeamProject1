package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainControl implements Initializable{
	@FXML private Button btn1;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction(e -> checkParking(e));
	}
		
	public void checkParking(ActionEvent event) {		//주차현황 버튼 처리 메소드
		try {
			Parent now = FXMLLoader.load(getClass().getResource("root.fxml"));
			Scene scene = new Scene(now);
			Stage primaryStage =(Stage) btn1.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
