package com.spderman3333.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("calculator.fxml"));
		Parent root = fxmlLoader.load();


		Calculator calculator = new Calculator();
		CalculatorController calculatorController = fxmlLoader.getController();
		calculatorController.setCalculator(calculator);

		Scene scene = new Scene(root, 640, 120);

		stage.setTitle("Calculator");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}