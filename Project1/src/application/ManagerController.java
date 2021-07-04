package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ManagerController implements Initializable{
	@FXML private ListView<String> listView;
    @FXML private TableView<Phone> tableView;
    @FXML private ImageView imageView;

    	@Override
    	public void initialize(URL location, ResourceBundle resources) {
       listView.setItems(FXCollections.observableArrayList(
       "No.1","No.2","No.3","No.4","No.5"));
    
       listView.getSelectionModel().selectedIndexProperty().addListener(
       new ChangeListener<Number>() {

    	@Override
       public void changed(ObservableValue<?extends Number>observable,Number oldValue, Number newValue) {
	       tableView.getSelectionModel().select(newValue.intValue());
	       tableView.scrollTo(newValue.intValue());
       }
   });

       
       ObservableList phoneList = FXCollections.observableArrayList(
       new Phone("No.1","phone01.png"),
       new Phone("No.2","phone01.png"),
       new Phone("No.3","phone01.png"),
       new Phone("No.4","phone01.png"),
       new Phone("No.5","phone01.png")
       );


//       TableColumn tcImage = tableView.getColumns().get(1);
//       tcSmartPhone.setCellValueFactory(new PropertyValueFactory("image"));
//       tcSmartPhone.setStyle("-fx-alignment: CENTER;");

  
       tableView.setItems(phoneList);
       
       tableView.getSelectionModel().selectedItemProperty().
       addListener(new ChangeListener<Phone>() {
    	   
    	@Override   
    	public void changed(ObservableValue<? extends Phone> observable,
		   Phone oldValue, Phone newValue) {
//			if(newValue!=null) {
//				imageView.setImage(new Image(
//						getClass().getResource("images/" +newValue.getImage()).toString()));
//					}
       			}
       		}
         );
      }

   
    public void handleBtnOkAction(ActionEvent e) {
	    String item = listView.getSelectionModel().getSelectedItem();
	    System.out.println("ListView 스마트폰:" + item);
	    
	    Phone phone = tableView.getSelectionModel().getSelectedItem();
	    System.out.println("TableView 스마트폰: " +phone.getSmartPhone());
	    System.out.println("TableView 이미지: " +phone.getImage());
	    }

   
    public void handleBtnCancelAction(ActionEvent e) {
    Platform.exit();

	}

}