package application;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainControl implements Initializable{

	@FXML private Button Check;
	@FXML private Label Clock;
	@FXML private Button btn2;
  
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		clock();
		Check.setOnAction(e -> checkParking(e));
    btn2.setOnAction(e-> checkManager(e));		//관리자 창으로 이동

	}
		
	public void checkParking(ActionEvent event) {		//주차현황 버튼 처리 메소드
		try {
			
			Parent now = FXMLLoader.load(getClass().getResource("root.fxml"));
			Scene scene = new Scene(now);
			Stage primaryStage =(Stage) Check.getScene().getWindow();
			primaryStage.setTitle("주차관리시스템");
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void clock() {
		Thread clock = new Thread() {
			@Override
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("현재시각 : HH:mm:ss", Locale.KOREA);
				while(true) {
					String strDate = sdf.format(new Date());
					Platform.runLater(() -> {
						Clock.setText(strDate);
						Clock.setFont(new Font(24));
					});
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) { }
				}
			};
		};
		clock.setDaemon(true);
		clock.start();
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
