package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import customerDecorator.CustomerData;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private TableView<CustomerData> tableToChange;

    @FXML
    private TableColumn<CustomerData, String> ID;
    
    @FXML
    private TableColumn<CustomerData, String> firstName;

    @FXML
    private TableColumn<CustomerData, String> lastName;

    @FXML
    private TableColumn<CustomerData, String> Email;

    @FXML
    private TableColumn<CustomerData, String> phoneNum;

    @FXML
    private TableColumn<CustomerData, String> insurances;

    @FXML
    private TableColumn<CustomerData, String> customerType;
    
    @FXML
    private TableColumn<CustomerData, String> price;
    
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

		ID.setCellValueFactory(new PropertyValueFactory<CustomerData,String>("ID"));
		firstName.setCellValueFactory(new PropertyValueFactory<CustomerData,String>("firstName"));
		lastName.setCellValueFactory(new PropertyValueFactory<CustomerData,String>("lastName"));
		Email.setCellValueFactory(new PropertyValueFactory<CustomerData,String>("email"));
		phoneNum.setCellValueFactory(new PropertyValueFactory<CustomerData,String>("phone"));
		insurances.setCellValueFactory(new PropertyValueFactory<CustomerData,String>("InsurancesAsString"));
		customerType.setCellValueFactory(new PropertyValueFactory<CustomerData,String>("typeString"));
		price.setCellValueFactory(new PropertyValueFactory<CustomerData,String>("priceString"));
		
    	Logger logger = Logger.getInstance();

		//read csv and make String[] for each row in arrayList<String[]>
		ArrayList<String[]> csvData = new ArrayList<String[]>();
		try {
			csvData = logger.readCSV("\\customers.csv");
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String[] rowData : csvData) {
			tableToChange.getItems().add(new CustomerData(rowData));
		}
		
	}
    
}
