package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PaymentController implements Initializable{
	@FXML private Button check;		//뒤로가기 버튼
	@FXML private TextField result;		//결제결과 텍스트필드
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Data data = (Data) CarData.hashMap.get(CarData.s);
		result.setText("총 결제금액: " +CarData.price+"원 결제 완료되었습니다. 감사합니다.");
		ManagerController.carmanagerList.add(new CarManagerData(new SimpleStringProperty(data.curDate.toString()), new SimpleStringProperty(data.carNumber), 
				new SimpleStringProperty(data.inTime.toString()), new SimpleStringProperty(data.outTime.toString()), new SimpleStringProperty(String.valueOf(data.price))));  		//결제완료되면 리스트에 데이터 업데이트
		check.setOnAction(e->backRoot(e));
	}
	
	public void backRoot(ActionEvent event) {
		try {
			//초기화
			Data data = (Data) CarData.hashMap.get(CarData.s);
			data.carNumber="비어있음";
			data.inTime=null;
			
			data.price=0;
			Parent select2 =FXMLLoader.load(getClass().getResource("root.fxml"));
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) check.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
