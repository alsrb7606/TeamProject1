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
//입차출차 선택화면 컨트롤
public class SelectController implements Initializable{
	@FXML private Button putIn;
	@FXML private Button putOut;
	@FXML private TextField LocationNum;	
	@FXML private TextField CarNum;
	@FXML private TextField CarTime;
	@FXML private Button backRoot;	//뒤로가기버튼
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		backRoot.setOnAction(e->backRoot(e));
		
		Data data= (Data) CarData.hashMap.get(CarData.s);
		CarTime.setText("");
		if(data.inTime!=null) {
		LocalTime curTime = LocalTime.now();
		LocalTime inTime = data.inTime;
		Duration duration = Duration.between(inTime, curTime);
		String duringTime =String.valueOf(duration.toMinutes());
		CarTime.setText(duringTime+"분");
		}
		LocationNum.setText(data.locationNumber.toString());
		CarNum.setText(data.carNumber);
		
		putIn.setOnAction(e->PutInCar(e));		//입차시간이 없을 경우 자리에 차가 없는 것으로 가정하고 출차 못하게 막음.
		if(data.inTime==null) {
			putOut.setOnAction(e->{System.out.println("출차할 차가 없습니다.");});
		} else {
			putOut.setOnAction(e->PutOutCar(e));
		}
		
		
		
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
			
			Parent putout =FXMLLoader.load(getClass().getResource("PutOut.fxml"));
			Scene scene = new Scene(putout);
			Stage primaryStage =(Stage) putOut.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void backRoot(ActionEvent event) {
		try {
			Parent select2 =FXMLLoader.load(getClass().getResource("root.fxml"));
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) backRoot.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
