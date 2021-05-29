package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class ViewAllController {

    @FXML
    private AnchorPane leftPane;

    @FXML
    private Button back;

    @FXML
    private TableView<?> tableToChange;
    
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


}
