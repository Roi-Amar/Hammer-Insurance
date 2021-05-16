module DesignPatternsFinalProject {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	exports application;
	opens application to javafx.graphics;
}
