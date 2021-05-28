package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HammerControler {
	private Stage stage;
	
	public void start(Stage primaryStage) throws Exception {
		//Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
		Parent root = FXMLLoader.load(getClass().getResource("NewCustomer1.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add("application/NewCustomer.css");
		primaryStage.setTitle("Hammer");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}

}
