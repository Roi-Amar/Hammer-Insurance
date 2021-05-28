package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import logerSingleton.Logger;

public class MainWindowController implements Initializable{

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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		String jasonFileName = "\\input.json";
    	Logger logger = Logger.getInstance();
    	String[] jsonDetails = null;
    	try {
			jsonDetails = logger.readJSON(jasonFileName);
		} catch (Exception e) {
			//popUp("There was an error reading json file:" + jasonFileName + "\n" + e.toString());
			System.out.println("There was an error reading json file:" + jasonFileName + "\n" + e.toString());
			e.printStackTrace();
		}
    	loadJasonHere.setText(jsonDetails[0]+"\n"+jsonDetails[1]+"\n"+jsonDetails[2]);;
	}

}
