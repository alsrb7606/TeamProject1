package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ManagerController implements Initializable{
	@FXML private TableView<CarManagerData> tableView;
	@FXML private Button backmain;
	@FXML private TableColumn<CarManagerData, String> tc1;
	@FXML private TableColumn<CarManagerData, String> tc2;
	@FXML private TableColumn<CarManagerData, String> tc3;
	@FXML private TableColumn<CarManagerData, String> tc4;
	@FXML private TableColumn<CarManagerData, String> tc5;
	
	
	static ObservableList carmanagerList= FXCollections.observableArrayList();
//			new CarManagerData(new SimpleStringProperty(" 테스트"), new SimpleStringProperty(" 테스트"), new SimpleStringProperty(" 테스트"),
//					new SimpleStringProperty(" 테스트"), new SimpleStringProperty(" 테스트"))
//			
//			);;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		backmain.setOnAction(e-> {
			Parent select2 = null;
			try {
				select2 = FXMLLoader.load(getClass().getResource("Main.fxml"));
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
			Scene scene = new Scene(select2);
			Stage primaryStage =(Stage) backmain.getScene().getWindow();
			primaryStage.setScene(scene);
		});
		
		//carmanagerList.add(resources);	리스트에 데이터 추가
		
		tc1.setCellValueFactory(cellData -> cellData.getValue().OutDateProperty());
		tc2.setCellValueFactory(cellData -> cellData.getValue().CarnumProperty());
		tc3.setCellValueFactory(cellData -> cellData.getValue().intimeProperty());
		tc4.setCellValueFactory(cellData -> cellData.getValue().OuttimeProperty());
		tc5.setCellValueFactory(cellData -> cellData.getValue().PriceProperty());
		tableView.setItems(carmanagerList);
		
	}

}
