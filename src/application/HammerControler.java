package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HammerControler {
	private Stage stage;
	
	public void start(Stage primaryStage) throws Exception {
		//Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
		Parent root = FXMLLoader.load(getClass().getResource("newCustomer1.fxml"));
		//Parent root = FXMLLoader.load(getClass().getResource("newCustomer2.fxml"));
		//Parent root = FXMLLoader.load(getClass().getResource("ViewAll.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Hammer");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}

}
