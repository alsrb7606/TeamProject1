package application;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
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

public class PutController implements Initializable{
	@FXML private Button putInfo;
	@FXML private Button backroot;
	@FXML private TextField carNumTextField;
	@FXML private TextField locationNum;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		backroot.setOnAction(e->backRoot(e));
		putInfo.setOnAction(e->PutOk(e));
		
	}

	public void PutOk(ActionEvent event) {	
		try {
			Data data= (Data) CarData.hashMap.get(CarData.s);
			data.locationNumber= CarData.s;	//자리번호에  static 값 넣기.
			data.carNumber=carNumTextField.getText();
			data.curDate=LocalDate.now();
			data.inTime=LocalTime.now();
			if(data.carNumber != null) {
				data.inorout = true;
			}
			//data.locationNumber=locationNum.getText();
			
			CarData.hashMap.put(data.locationNumber, data);
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml"));
			Parent select2 = (Parent)loader.load();
			rootController rootcont = loader.getController();
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
