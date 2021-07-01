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

public class PutController implements Initializable{
	@FXML private Button putInfo;
	@FXML private Button backroot;
	//***********put in control****************
	
	
	//밑에 두 버튼은 주입이 안되는 상태, 즉 null인 상태
	//fxml에 있는 버튼은 주입이 되고 fxml에 없는 버튼은 null인 상태
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 
		
		backroot.setOnAction(e->backRoot(e));
		putInfo.setOnAction(e->PutInOk(e));
		
	
	
	
		
		
		
	}
	
	public void PutOk(ActionEvent event) {
		try {
			Parent select2 =FXMLLoader.load(getClass().getResource("root.fxml"));
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) putInfo.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//************put in co
		public void PutInOk(ActionEvent event) {
			try {
				Parent select2 =FXMLLoader.load(getClass().getResource("root.fxml"));
				Scene scene = new Scene(select2);
				Stage primaryStage =(Stage) putInfo.getScene().getWindow();
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
	//*******putin
//	public void backRoot1(ActionEvent event) {
//		try {
//			Parent select2 =FXMLLoader.load(getClass().getResource("root.fxml"));
//			Scene scene = new Scene(select2);
//			Stage primaryStage =(Stage) backroot.getScene().getWindow();
//			primaryStage.setScene(scene);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	
}
