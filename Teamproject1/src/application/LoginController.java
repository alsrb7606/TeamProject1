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
        System.out.println("호출시 자동 실행");
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
            System.out.println("성공");
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("로그인 성공!!");
            alert.show();
            Parent root1=FXMLLoader.load(getClass().getResource("Main.fxml"));	//새로운 창 띄우기 위함.
            Scene scene = new Scene(root1);
            Stage stage1 = (Stage) loginButton.getScene().getWindow();	//로그인 버튼이 있는 장면의 window를 가져와서 Stage로 캐스팅
            stage1.close();
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } else if (textFieldID.getText().isEmpty() || textFieldPw.getText().isEmpty() ) { 
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("아이디 혹은 비밀번호를 입력하지 않았습니다!!");
            alert.show();
            textFieldID.clear();
            textFieldPw.clear();
            textFieldID.requestFocus();
        } else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("로그인 실패!! 아이디 혹은 비밀번호가 맞지 않습니다!!");
            alert.show();
            textFieldID.clear();
            textFieldPw.clear();
            textFieldID.requestFocus();
        }
    }
}