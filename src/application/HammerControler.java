package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HammerControler {
	public static GridPane root = new GridPane();
	
	public void start(Stage primaryStage) throws Exception {
		Pane mainScreen = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
		//Pane mainScreen = FXMLLoader.load(getClass().getResource("NewCustomer1.fxml"));
		root.add(mainScreen, 0, 0);
		Scene scene = new Scene(root);
		
		scene.getStylesheets().add("application/NewCustomer.css");
		primaryStage.setTitle("Hammer");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}

}
