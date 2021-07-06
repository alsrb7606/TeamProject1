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
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class PaymentMethodController implements Initializable{
	@FXML private Button check;		
	@FXML private Button check1;	
	@FXML private Button check2;	
	@FXML private Button check3;     //결제 4가지 수단
	@FXML private TextField result;     //결제결과 텍스트필드
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Data data = (Data) CarData.hashMap.get(CarData.s);
		check.setOnAction(e->payment(e));
		check1.setOnAction(e->payment1(e));
		check2.setOnAction(e->payment2(e));
		check3.setOnAction(e->payment3(e));
	}
		
	public void payment(ActionEvent event) {
		try {
			Parent select2 =FXMLLoader.load(getClass().getResource("Payment.fxml"));
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) check.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void payment1(ActionEvent event) {
		try {
			Parent select2 =FXMLLoader.load(getClass().getResource("Payment.fxml"));
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) check1.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void payment2(ActionEvent event) {
		try {
			Parent select2 =FXMLLoader.load(getClass().getResource("Payment.fxml"));
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) check2.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void payment3(ActionEvent event) {
		try {
			Parent select2 =FXMLLoader.load(getClass().getResource("Payment.fxml"));
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) check3.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}