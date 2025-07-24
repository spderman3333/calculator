package com.spderman3333.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/*
     CIST-004A1-54249 Summer 2025
     HW 15 Week 6 Problem 1 "Calculator"
     Description: Displays a GUI based calculator
     Input: 2 doubles, and a selection of the operation from a dropdown menu.
     Output: The solution to your problem
     Student: Stefan Dikov
     Known bugs: None.
     Date: 7/24/2025
*/

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