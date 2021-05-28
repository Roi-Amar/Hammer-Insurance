package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextArea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import logerSingleton.Logger;
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
    	Logger logger = Logger.getInstance();
    	
    	try {

			logger.writeCSV("\\customers.csv", newCustomer.getFullCustomerDetails());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			popUp("There was an error saving:\n" + e.toString());
		}
    	popUp("New customer saved!");
    	startNextScreen();
    }
    
    private void startNextScreen() {
    	try {

			Pane newScreen = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
			HammerControler.root.add(newScreen, 0, 0);

		} catch (IOException e) {
			System.out.println("Couldn't load!");
			e.printStackTrace();
		}

		
	}

    
    // create a popup with a message
   	public void popUp(String txt) {
   		final Stage dialog = new Stage();
   		VBox dialogVbox = new VBox(20);
   		Label lbl = new Label(txt);
   		lbl.setPadding(new Insets(5));
   		lbl.setAlignment(Pos.CENTER);
   		lbl.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
   		dialogVbox.getChildren().add(lbl);
   		Scene dialogScene = new Scene(dialogVbox, lbl.getMinWidth(), lbl.getMinHeight());
   		dialog.setScene(dialogScene);
   		dialog.show();
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
