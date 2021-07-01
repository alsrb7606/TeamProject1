package application;
 
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
 
 
public class LoginController implements Initializable{
    @FXML private Button loginButton;
    @FXML private TextField textFieldID;
    @FXML private TextField textFieldPw;
    @FXML private Label idLabel;
    @FXML private Label pwLabel;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("ȣ��� �ڵ� ����");
        loginButton.setOnAction(e -> {
			try {
				login();
			} catch (IOException e1) {
				
			}
		});
    }
    
    public void login() throws IOException  {
        MyDB db = new MyDB();
        if (db.table.containsKey(textFieldID.getText()) && db.table.get(textFieldID.getText()).equals(textFieldPw.getText())) {
            System.out.println("����");
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("�α��� ����!!");
            alert.show();
            Parent root1=FXMLLoader.load(getClass().getResource("Main.fxml"));	//���ο� â ���� ����.
            Scene scene = new Scene(root1);
            Stage stage1 = (Stage) loginButton.getScene().getWindow();	//�α��� ��ư�� �ִ� ����� window�� �����ͼ� Stage�� ĳ����
            stage1.close();
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } else if (textFieldID.getText().isEmpty() || textFieldPw.getText().isEmpty() ) { 
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("���̵� Ȥ�� ��й�ȣ�� �Է����� �ʾҽ��ϴ�!!");
            alert.show();
            textFieldID.clear();
            textFieldPw.clear();
            textFieldID.requestFocus();
        } else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("�α��� ����!! ���̵� Ȥ�� ��й�ȣ�� ���� �ʽ��ϴ�!!");
            alert.show();
            textFieldID.clear();
            textFieldPw.clear();
            textFieldID.requestFocus();
        }
    }
}