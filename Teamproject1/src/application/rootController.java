package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class rootController implements Initializable {
	@FXML private Button btnspace;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnspace.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) { 
				if(event.getClickCount() > 1) {
					try {
						Parent select =FXMLLoader.load(getClass().getResource("Info.fxml"));
						Scene scene = new Scene(select);
						Stage primaryStage =(Stage) btnspace.getScene().getWindow();
						primaryStage.setScene(scene);
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					try {
						Parent select =FXMLLoader.load(getClass().getResource("Select.fxml"));
						Scene scene = new Scene(select);
						Stage primaryStage =(Stage) btnspace.getScene().getWindow();
						primaryStage.setScene(scene);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
	}
	
	public void btnEvent(MouseEvent event) throws IOException {
		Parent select =FXMLLoader.load(getClass().getResource("Info.fxml"));
		Scene scene = new Scene(select);
		Stage primaryStage =(Stage) btnspace.getScene().getWindow();
		primaryStage.setScene(scene);
	}
}