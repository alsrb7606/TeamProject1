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
	@FXML private Button btn2;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction(e -> checkParking(e));		//���������� �̵�
		btn2.setOnAction(e-> checkManager(e));		//������ â���� �̵�
	}
		
	public void checkParking(ActionEvent event) {		//������Ȳ ��ư ó�� �޼ҵ�
		try {
			
			Parent now = FXMLLoader.load(getClass().getResource("root.fxml"));
			Scene scene = new Scene(now);
			Stage primaryStage =(Stage) btn1.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkManager(ActionEvent event) {
		Parent now = null;
		try {
			now = FXMLLoader.load(getClass().getResource("Manager.fxml"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Scene scene = new Scene(now);
		Stage primaryStage =(Stage) btn1.getScene().getWindow();
		primaryStage.setScene(scene);
		
		
	}
}
