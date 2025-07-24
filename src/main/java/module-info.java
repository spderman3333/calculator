module com.spderman3333.calculator {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.spderman3333.calculator to javafx.fxml;
	exports com.spderman3333.calculator;
}