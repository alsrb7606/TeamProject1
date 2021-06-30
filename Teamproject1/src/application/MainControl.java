package application;

import java.io.IOException;
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

public class MainControl implements Initializable{
	@FXML private Button btn1;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction(e->{
			try {
				checkParking(e);
			} catch (IOException e1) {
				
			}
		});
		
	}
	public void checkParking(ActionEvent e) throws IOException {		//주차현황 버튼 처리 메소드
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));		
		Scene scene = new Scene(root);
		
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		Stage stageEnd= (Stage) btn1.getScene().getWindow();
		stageEnd.close();
	}
}
