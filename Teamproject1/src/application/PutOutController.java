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

public class PutOutController implements Initializable{
	@FXML TextField inTime;		//입차시간
	@FXML TextField outTime;	//출차시간
	@FXML Button back;		//뒤로가기 버튼
	@FXML Button payment;	//결제버튼
	//int price;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Data data = (Data) CarData.hashMap.get(CarData.s);	//데이터 가져오기   get(자리번호: static String s)
		
		inTime.setText(String.valueOf(data.inTime.getHour())+"시"+
					String.valueOf(data.inTime.getMinute())+"분");
	
		outTime.setText(String.valueOf(LocalTime.now().getHour())+"시"+
					String.valueOf(LocalTime.now().getMinute())+"분" );
	
		back.setOnAction(e->backRoot(e));		//뒤로가기
		
		payment.setOnAction(e->calc(e));
		
		if(data.inTime!=null) {
			LocalTime curTime = LocalTime.now();
			LocalTime inTime = data.inTime;
			
			Duration duration = Duration.between(inTime, curTime);
			Long duringTime =duration.toMinutes();
			CarData.price = (int) (duringTime*500);		//1분당 500원 계산
			data.outTime=curTime;
			data.price = CarData.price;
		}
		
	}
		

	
	public void backRoot(ActionEvent event) {
		try {
			Parent select2 =FXMLLoader.load(getClass().getResource("root.fxml"));
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) back.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void calc(ActionEvent event) {
		try {
			Data data = (Data) CarData.hashMap.get(CarData.s);
			if(data.carNumber != null) {
				data.inorout = false;
			}
			Parent select2 =FXMLLoader.load(getClass().getResource("PaymentMethod.fxml"));
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) payment.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
