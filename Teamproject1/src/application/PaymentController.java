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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PaymentController implements Initializable{
	@FXML private Button check;		//�ڷΰ��� ��ư
	@FXML private TextField result;		//������� �ؽ�Ʈ�ʵ�
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Data data = (Data) CarData.hashMap.get(CarData.s);
		result.setText("�� �����ݾ�: " +CarData.price+"�� ���� �Ϸ�Ǿ����ϴ�. �����մϴ�.");
		check.setOnAction(e->backRoot(e));
	}
	
	public void backRoot(ActionEvent event) {
		try {
			//�ʱ�ȭ
			Data data = (Data) CarData.hashMap.get(CarData.s);
			data.carNumber="�������";
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
