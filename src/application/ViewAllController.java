package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import logerSingleton.Logger;

public class ViewAllController implements Initializable {

    @FXML
    private AnchorPane leftPane;

    @FXML
    private Button back;
  
    @FXML
    private TableView<String[]> tableToChange;

    @FXML
    private TableColumn<String[], String> ID;
    
    @FXML
    private TableColumn<String[], String> firstName;

    @FXML
    private TableColumn<String[], String> lastName;

    @FXML
    private TableColumn<String[], String> Email;

    @FXML
    private TableColumn<String[], String> phoneNum;

    @FXML
    private TableColumn<String[], String> insurances;

    @FXML
    private TableColumn<String[], String> customerType;
    
    @FXML
    private TableColumn<String[], String> price;
    
    @FXML
    void clickedBack(ActionEvent event) {
    	try {
			Pane newScreen = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
			HammerControler.root.add(newScreen, 0, 0);
		} catch (IOException e) {
			System.out.println("Couldn't load!");
			e.printStackTrace();
		}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		ID.setCellValueFactory(new PropertyValueFactory<String[],String>("ID"));
		firstName.setCellValueFactory(new PropertyValueFactory<String[],String>("firstName"));
		lastName.setCellValueFactory(new PropertyValueFactory<String[],String>("lastName"));
		Email.setCellValueFactory(new PropertyValueFactory<String[],String>("email"));
		phoneNum.setCellValueFactory(new PropertyValueFactory<String[],String>("phoneNum"));
		insurances.setCellValueFactory(new PropertyValueFactory<String[],String>("insurances"));
		customerType.setCellValueFactory(new PropertyValueFactory<String[],String>("customerType"));
		price.setCellValueFactory(new PropertyValueFactory<String[],String>("price"));
		
    	Logger logger = Logger.getInstance();

		//read csv and make String[] for each row in arrayList<String[]>
		ArrayList<String[]> csvData = new ArrayList<String[]>();
		try {
			csvData = logger.readCSV("\\customers.csv");
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String[] rowData : csvData) {
			tableToChange.getItems().add(rowData);
		}
		
	}
    
}
