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

public class PutOutController implements Initializable{
	@FXML private Button putOutInfo;
	@FXML private Button backroot;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		putOutInfo.setOnAction(e->PutOutOk(e));
		backroot.setOnAction(e->backRoot(e));
	}
	
	public void PutOutOk(ActionEvent event) {
		try {
			Parent select2 =FXMLLoader.load(getClass().getResource("root.fxml"));
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) putOutInfo.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void backRoot(ActionEvent event) {
		try {
			Parent select2 =FXMLLoader.load(getClass().getResource("root.fxml"));
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) backroot.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
