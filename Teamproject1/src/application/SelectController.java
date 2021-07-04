package application;

import java.net.URL;
import java.time.Duration;
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

public class SelectController implements Initializable{
	@FXML private Button putIn;
	@FXML private Button putOut;
	@FXML private TextField LocationNum;	
	@FXML private TextField CarNum;
	@FXML private TextField CarTime;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		putIn.setOnAction(e->PutInCar(e));
		putOut.setOnAction(e->PutOutCar(e));
		
		
		Data data= (Data) CarData.hashMap.get(CarData.s);
		if(data.inTime!=null) {
		LocalTime curTime = LocalTime.now();
		LocalTime inTime = data.inTime;
		Duration duration = Duration.between(inTime, curTime);
		String duringTime =String.valueOf(duration.toMinutes());
		CarTime.setText(duringTime+"Ка");
		}
		LocationNum.setText(data.locationNumber.toString());
		CarNum.setText(data.carNumber);
		
		
	}

	public void PutInCar(ActionEvent event) {
		try {
			Parent putin =FXMLLoader.load(getClass().getResource("Put.fxml"));
			Scene scene = new Scene(putin);
			Stage primaryStage =(Stage) putIn.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void PutOutCar(ActionEvent event) {
		try {
			Parent putout =FXMLLoader.load(getClass().getResource("Put.fxml"));
			Scene scene = new Scene(putout);
			Stage primaryStage =(Stage) putOut.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
