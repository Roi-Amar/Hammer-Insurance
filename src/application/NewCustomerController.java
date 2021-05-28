package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.text.Text;
import logic.NewCustomerWithInsurence;

public class NewCustomerController implements Initializable{

    @FXML
    private AnchorPane leftPane;

    @FXML
    private Button car;

    @FXML
    private Button house;

    @FXML
    private Button life;

    @FXML
    private Button health;

    @FXML
    private Button incapacity;

    @FXML
    private Button cancel;

    @FXML
    private Button vip;

    @FXML
    private Button corporate;

    @FXML
    private AnchorPane rightPane;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtPhone;

    @FXML
    private JFXTextField txtLastName;

    @FXML
    private JFXTextField txtFirstName;

    @FXML
    private JFXTextField txtID;

    @FXML
    private Button next;

    @FXML
    private Text changePrice;
    
    private NewCustomerWithInsurence customer;

    private void changeBtnClass(Button btn) {
    	if (isCLicked(btn)) {
    		btn.getStyleClass().removeAll("btnClicked"); 
    		btn.getStyleClass().add("btnUnclicked");
    	}
    	else {
    		btn.getStyleClass().removeAll("btnUnclicked"); 
    		btn.getStyleClass().add("btnClicked");
    	}
    }
    
    private boolean isCLicked(Button btn) {
    	if (btn.getStyleClass().contains("btnClicked")) {
    		return true;
    	}
    	return false;
    }

    @FXML
    void addCarInsurance(ActionEvent event) {
    	insurenceBtn(car, "car");

    }

    @FXML
    void addHealthInsurance(ActionEvent event) {
    	insurenceBtn(health, "health");

    }

    @FXML
    void addHouseInsurance(ActionEvent event) {
    	insurenceBtn(house, "house");


    }

    @FXML
    void addITWInsurance(ActionEvent event) {
    	insurenceBtn(incapacity, "incapacity");

    }

    @FXML
    void addLifeInsurance(ActionEvent event) {
    	insurenceBtn(life, "life");
    }

    @FXML
    void clickCancel(ActionEvent event) {

    }

    @FXML
    void clickNext(ActionEvent event) {

    	// get all text from input fields
    	String id = txtID.getText().trim();
    	String firstName = txtFirstName.getText();
    	String lastName = txtLastName.getText();
    	String phone = txtPhone.getText().trim();
    	String email = txtEmail.getText().trim();
    	
    	// check all fields are valid:
    	if (id.length() != 9) {
    		manageErrorInField("ID invalid");
    	}
    	else if (firstName.length() < 1 || lastName.length() < 1) {
    		manageErrorInField("Name is invalid");
    	}
    	else if(phone.length() < 9) {
    		manageErrorInField("Phone is invalid");
    	}
    	else if(!email.contains("@")) {
    		manageErrorInField("Email is invalid");
    	}
    	else {
    		customer.updateCostumerData(id, firstName, lastName, email, phone);
    	}
    }

    private void manageErrorInField(String string) {
		// TODO Auto-generated method stub
		// in popup or other way?
	}

	@FXML
    void makeCustomerCorporate(ActionEvent event) {
    	decoratorBtn(corporate, "corporate");
    }

    @FXML
    void makeCustomerVIP(ActionEvent event) {
    	decoratorBtn(vip, "VIP");
    }
    
    private void updatePrice() {
    	changePrice.setText(String.format("%,.2f", customer.getTotalPrice()));
    }
    
    private void decoratorBtn(Button btn, String decorationType) {
    	if (isCLicked(btn)) {
    		customer.removeDecoration(decorationType);
    	}
    	else customer.decorateCustomer(decorationType);
    	changeBtnClass(btn);
    	updatePrice();
    }
    
    private void insurenceBtn(Button btn, String insurenceType) {
    	if (isCLicked(btn)) {
    		customer.removeInsurance(insurenceType);
    	}
    	else customer.addInsurance(insurenceType);
    	changeBtnClass(btn);
    	updatePrice();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		customer = new NewCustomerWithInsurence();
		customer.setCostumerData(null, null, null, null, null);
	}

}
