package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class rootController implements Initializable {
	// �ڸ� ��Ȳ�� ���� ����
	@FXML private Button btnspace;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnspace.setOnAction(e->selectArea(e));
	}
	
	public void selectArea(ActionEvent event) {
		try {
			Parent select =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select);
			Stage primaryStage =(Stage) btnspace.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}