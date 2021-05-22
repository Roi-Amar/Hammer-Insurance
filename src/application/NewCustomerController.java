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
    
    private NewCustomerWithInsurence customer;
    private ArrayList<String> insurenceTypes = new ArrayList<>();
    private ArrayList<String> decorationTypes = new ArrayList<>();


    @FXML
    void addCarInsurance(ActionEvent event) {
    	changeBtnClass(car);
        
    }
    
    private void changeBtnClass(Button btn) {
    	if (btn.getStyleClass().contains("btnClicked")) {
    		btn.getStyleClass().removeAll("btnClicked"); 
    		btn.getStyleClass().add("btnUnclicked");
    	}
    	else {
    		btn.getStyleClass().removeAll("btnUnclicked"); 
    		btn.getStyleClass().add("btnClicked");
    	}
    }

    @FXML
    void addHealthInsurance(ActionEvent event) {
    	changeBtnClass(health);
    }

    @FXML
    void addHouseInsurance(ActionEvent event) {
    	changeBtnClass(house);
    }

    @FXML
    void addITWInsurance(ActionEvent event) {
    	changeBtnClass(incapacity);
    }

    @FXML
    void addLifeInsurance(ActionEvent event) {
    	changeBtnClass(life);
    }

    @FXML
    void clickCancel(ActionEvent event) {

    }

    @FXML
    void clickNext(ActionEvent event) {

    }

    @FXML
    void makeCustomerCorporate(ActionEvent event) {
    	changeBtnClass(corporate);
    }

    @FXML
    void makeCustomerVIP(ActionEvent event) {
    	changeBtnClass(vip);
    }

}
