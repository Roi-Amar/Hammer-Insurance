package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextArea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import logic.NewCustomerWithInsurence;

public class NewCustomer2Controller implements Initializable{
	
	private static NewCustomerWithInsurence newCustomer;

    @FXML
    private AnchorPane leftPane;

    @FXML
    private Button back;

    @FXML
    private Text changePrice;

    @FXML
    private JFXTextArea insuranceChoose;

    @FXML
    private AnchorPane rightPane;

    @FXML
    private Button finish;

    @FXML
    private JFXTextArea customerDetails;

    @FXML
    void clickBack(ActionEvent event) {

    }

    @FXML
    void clickFinish(ActionEvent event) {

    }
    
    public static void setNewCustomer(NewCustomerWithInsurence customer) {
    	newCustomer = customer;
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		customerDetails.setText(newCustomer.toString());
		changePrice.setText(String.format("%,.2f", newCustomer.getTotalPrice()));
		insuranceChoose.setText(newCustomer.printAllInsurences());
	}

}
