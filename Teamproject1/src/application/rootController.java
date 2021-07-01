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
	// 자리 현황판 동작 정리
	@FXML private Button btnspace;
	@FXML private Button backmain;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnspace.setOnAction(e->selectArea(e));
		backmain.setOnAction(e->backMain(e));
	}
	
	public void selectArea(ActionEvent event) {
		try {
			Tdata tdata=(Tdata)TestData.hashMap.get("apple");
			
			System.out.println(tdata.word);	//test
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) btnspace.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void backMain(ActionEvent event) {
		try {
			Parent select1 =FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}	}
}