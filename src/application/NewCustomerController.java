package application;

import java.util.ArrayList;

import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.text.Text;
import logic.NewCustomerWithInsurence;

public class NewCustomerController {

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
    
    private NewCustomerWithInsurence customer = new NewCustomerWithInsurence();

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
    	changeBtnClass(car);
    	if (isCLicked(car)) {
    		customer.removeInsurance("car");
    	}
    	else customer.addInsurance("car");
    }

    @FXML
    void addHealthInsurance(ActionEvent event) {
    	changeBtnClass(health);
    	if (isCLicked(health)) {
    		customer.removeInsurance("health");
    	}
    	else customer.addInsurance("health");
    }

    @FXML
    void addHouseInsurance(ActionEvent event) {
    	changeBtnClass(house);
    	if (isCLicked(house)) {
    		customer.removeInsurance("house");
    	}
    	else customer.addInsurance("house");

    }

    @FXML
    void addITWInsurance(ActionEvent event) {
    	changeBtnClass(incapacity);
    	if (isCLicked(incapacity)) {
    		customer.removeInsurance("incapacity");
    	}
    	else customer.addInsurance("incapacity");
    }

    @FXML
    void addLifeInsurance(ActionEvent event) {
    	changeBtnClass(life);
    	if (isCLicked(life)) {
    		customer.removeInsurance("life");
    	}
    	else customer.addInsurance("life");
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
    		// create the customer object
    	}
    }

    private void manageErrorInField(String string) {
		// TODO Auto-generated method stub
		// in popup or other way?
	}

	@FXML
    void makeCustomerCorporate(ActionEvent event) {
    	changeBtnClass(corporate);
    	customer.decorateCustomer("corporate");
    }

    @FXML
    void makeCustomerVIP(ActionEvent event) {
    	changeBtnClass(vip);
    	customer.decorateCustomer("VIP");
    }

}
