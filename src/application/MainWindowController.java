package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class MainWindowController {

    @FXML
    private AnchorPane leftPane;

    @FXML
    private Button btnNewCustomer;

    @FXML
    private Button btnViewAll;

    @FXML
    private AnchorPane rightPane;

    @FXML
    private Text loadJasonHere;
    

    @FXML
    void openNewCustomerPage(ActionEvent event) {
    	try {

			Pane newScreen = FXMLLoader.load(getClass().getResource("NewCustomer1.fxml"));
			HammerControler.root.add(newScreen, 0, 0);

		} catch (IOException e) {
			System.out.println("Couldn't load!");
			e.printStackTrace();
		}

    }

    @FXML
    void openViewAllPage(ActionEvent event) {
    	try {

			Pane newScreen = FXMLLoader.load(getClass().getResource("ViewAll.fxml"));
			HammerControler.root.add(newScreen, 0, 0);

		} catch (IOException e) {
			System.out.println("Couldn't load!");
			e.printStackTrace();
		}

    }

}
