package application;

import java.io.IOException;
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
	@FXML TextField inTime;		//�����ð�
	@FXML TextField outTime;	//�����ð�
	@FXML Button back;		//�ڷΰ��� ��ư
	@FXML Button payment;	//������ư
	//int price;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Data data = (Data) CarData.hashMap.get(CarData.s);	//������ ��������   get(�ڸ���ȣ=static String s)
		
		inTime.setText(String.valueOf(data.inTime.getHour())+"��"+
					String.valueOf(data.inTime.getMinute())+"��");
	
		outTime.setText(String.valueOf(LocalTime.now().getHour())+"��"+
					String.valueOf(LocalTime.now().getMinute())+"��" );
	
		back.setOnAction(e->backRoot(e));		//�ڷΰ���
		
		if(data.inTime!=null) {
			LocalTime curTime = LocalTime.now();
			LocalTime inTime = data.inTime;
			
			Duration duration = Duration.between(inTime, curTime);
			Long duringTime =duration.toMinutes();
			CarData.price = (int) (duringTime*500);		//1�д� 500�� ���
			data.outTime=curTime;
			data.price = CarData.price;
			
		}
		
		payment.setOnAction(e-> {
			if(data.carNumber != null) {
				data.inorout = false;
			}
			Parent select2 = null;
			try {
				select2 = FXMLLoader.load(getClass().getResource("Payment.fxml"));
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) back.getScene().getWindow();
			primaryStage.setScene(scene);
		});
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

}
