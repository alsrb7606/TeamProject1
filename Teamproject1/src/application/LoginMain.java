package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginMain extends Application{

	public static void main(String[] args) {
		
		//Cardata 객체 생성.
		Data[] dataArray = {new Data("1"), new Data("2"), new Data("3"), new Data("4"), new Data("5"), new Data("6"), new Data("7"), new Data("8"), 
				new Data("9"), new Data("10"), new Data("11"), new Data("12"), };
		//해쉬맵에다 각 자리에 Data객체 저장.
		for(int i=1; i<=12; i++) {	
		CarData.hashMap.put(Integer.toString(i), dataArray[i-1]);
		}

		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("주차관리시스템");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
