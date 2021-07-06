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

public class rootController implements Initializable {
	// 자리 현황판 동작 정리
	@FXML protected Button btnspace1, btnspace2, btnspace3, btnspace4, btnspace5, btnspace6, btnspace7, btnspace8, btnspace9, btnspace10 ,btnspace11 ,btnspace12;
	@FXML protected Button backmain;
//	Button[] buttonArray = {btnspace1, btnspace2, btnspace3, btnspace4, btnspace5, btnspace6, btnspace7, btnspace8, btnspace9, btnspace10 ,btnspace11 ,btnspace12};  
//	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
//		for(int i=1; i<=12; i++) {
//			CarData.hashMap2.put(buttonArray[i-1], Integer.toString(i));
//		}	
		Data data = (Data) CarData.hashMap.get("1");
		
		if((data.inorout == true)) {
			btnspace1.setStyle("-fx-background-color: #ff7f00");
		} else if ((data.inorout == false)) {
			btnspace1.setStyle("-fx-background-color: #00ff00");
		}
		
		data = (Data) CarData.hashMap.get("2");
		if((data.inorout == true)) {
			btnspace2.setStyle("-fx-background-color: #ff7f00");
		} else if ((data.inorout == false)) {
			btnspace2.setStyle("-fx-background-color: #00ff00");
		}
		
		data = (Data) CarData.hashMap.get("3");
		if((data.inorout == true)) {
			btnspace3.setStyle("-fx-background-color: #ff7f00");
		} else if ((data.inorout == false)) {
			btnspace3.setStyle("-fx-background-color: #00ff00");
		}
		
		data = (Data) CarData.hashMap.get("4");
		if((data.inorout == true)) {
			btnspace4.setStyle("-fx-background-color: #ff7f00");
		} else if ((data.inorout == false)) {
			btnspace4.setStyle("-fx-background-color: #00ff00");
		}
		
		data = (Data) CarData.hashMap.get("5");
		if((data.inorout == true)) {
			btnspace5.setStyle("-fx-background-color: #ff7f00");
		} else if ((data.inorout == false)) {
			btnspace5.setStyle("-fx-background-color: #00ff00");
		}
		
		data = (Data) CarData.hashMap.get("6");
		if((data.inorout == true)) {
			btnspace6.setStyle("-fx-background-color: #ff7f00");
		} else if ((data.inorout == false)) {
			btnspace6.setStyle("-fx-background-color: #00ff00");
		}
		
		data = (Data) CarData.hashMap.get("7");
		if((data.inorout == true)) {
			btnspace7.setStyle("-fx-background-color: #ff7f00");
		} else if ((data.inorout == false)) {
			btnspace7.setStyle("-fx-background-color: #00ff00");
		}
		
		data = (Data) CarData.hashMap.get("8");
		if((data.inorout == true)) {
			btnspace8.setStyle("-fx-background-color: #ff7f00");
		} else if ((data.inorout == false)) {
			btnspace8.setStyle("-fx-background-color: #00ff00");
		}
		
		data = (Data) CarData.hashMap.get("9");
		if((data.inorout == true)) {
			btnspace9.setStyle("-fx-background-color: #ff7f00");
		} else if ((data.inorout == false)) {
			btnspace9.setStyle("-fx-background-color: #00ff00");
		}
		
		data = (Data) CarData.hashMap.get("10");
		if((data.inorout == true)) {
			btnspace10.setStyle("-fx-background-color: #ff7f00");
		} else if ((data.inorout == false)) {
			btnspace10.setStyle("-fx-background-color: #00ff00");
		}
		
		data = (Data) CarData.hashMap.get("11");
		if((data.inorout == true)) {
			btnspace11.setStyle("-fx-background-color: #ff7f00");
		} else if ((data.inorout == false)) {
			btnspace11.setStyle("-fx-background-color: #00ff00");
		}
		
		data = (Data) CarData.hashMap.get("12");
		if((data.inorout == true)) {
			btnspace12.setStyle("-fx-background-color: #ff7f00");
		} else if ((data.inorout == false)) {
			btnspace12.setStyle("-fx-background-color: #00ff00");
		}
		data =null;
		//test************
		btnspace1.setOnAction(e->selectArea1(e));
		btnspace2.setOnAction(e->selectArea2(e));
		btnspace3.setOnAction(e->selectArea3(e));
		btnspace4.setOnAction(e->selectArea4(e));
		btnspace5.setOnAction(e->selectArea5(e));
		btnspace6.setOnAction(e->selectArea6(e));
		btnspace7.setOnAction(e->selectArea7(e));
		btnspace8.setOnAction(e->selectArea8(e));
		btnspace9.setOnAction(e->selectArea9(e));
		btnspace10.setOnAction(e->selectArea10(e));
		btnspace11.setOnAction(e->selectArea11(e));
		btnspace12.setOnAction(e->selectArea12(e));
	
		//test************
		backmain.setOnAction(e->backMain(e));
	}
	
	public void selectArea1(ActionEvent event) {
		try {
			CarData.s ="1";
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//test***************
	
	
	public void selectArea2(ActionEvent event) {
		try {
			CarData.s ="2";
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectArea3(ActionEvent event) {
		try {
			CarData.s ="3";
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectArea4(ActionEvent event) {
		try {
			CarData.s ="4";
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectArea5(ActionEvent event) {
		try {
			CarData.s ="5";
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectArea6(ActionEvent event) {
		try {
			CarData.s ="6";
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectArea7(ActionEvent event) {
		try {
			CarData.s ="7";
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectArea8(ActionEvent event) {
		try {
			CarData.s ="8";
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectArea9(ActionEvent event) {
		try {
			CarData.s ="9";
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectArea10(ActionEvent event) {
		try {
			CarData.s ="10";
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectArea11(ActionEvent event) {
		try {
			CarData.s ="11";
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectArea12(ActionEvent event) {
		try {
			CarData.s ="12";
			Parent select1 =FXMLLoader.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(select1);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//*************test
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