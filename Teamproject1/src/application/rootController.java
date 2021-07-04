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
	// �ڸ� ��Ȳ�� ���� ����
	@FXML private Button btnspace1, btnspace2, btnspace3, btnspace4, btnspace5, btnspace6, btnspace7, btnspace8, btnspace9, btnspace10 ,btnspace11 ,btnspace12 ;
	@FXML private Button backmain;
	Button[] buttonArray = {btnspace1, btnspace2, btnspace3, btnspace4, btnspace5, btnspace6, btnspace7, btnspace8, btnspace9, btnspace10 ,btnspace11 ,btnspace12};  
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		for(int i=1; i<=12; i++) {
			CarData.hashMap2.put(buttonArray[i-1], Integer.toString(i));
		}
		
		
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