package com.spderman3333.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/*
     CIST-004A1-54249 Summer 2025
     HW 15 Week 6 Problem 1 "Calculator"
     Description: Displays a GUI based calculator
     Input: None.
     Output: 3 randomly drawn cards.
     Student: Stefan Dikov
     Known bugs: None.
     Date: 7/22/2025
*/


public class CalculatorController {

	Calculator calculator;

	@FXML
	public TextField number1;
	@FXML
	public TextField number2;
	@FXML
	public TextField result;

	@FXML
	public ChoiceBox operationSelect;

	@FXML
	public Label errorLabel;

	private boolean number1Valid;
	private boolean number2Valid;
	private boolean operationSelected;

	public void initialize() {
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	@FXML
	protected void onFirstNumberEntry() {
		if ( number1.getText().matches("^\\d+$|^\\d+\\.\\d+$") ) {
			number1Valid = true;
			calculator.setNumber1(Double.parseDouble(number1.getText()));
		} else {
			number1Valid = false;
		}
	}

	@FXML
	protected void onSecondNumberEntry() {
		if ( number2.getText().matches("^\\d+$|^\\d+\\.\\d+$") ) {
			number2Valid = true;
			calculator.setNumber2(Double.parseDouble(number2.getText()));
		} else {
			number2Valid = false;
		}
	}

	@FXML
	protected void handleOperationSelect() {
		operationSelected = true;
		calculator.setOperation((String) operationSelect.getValue());
	}

	@FXML
	protected void calculate() {
		if ( number1Valid && number2Valid && operationSelected ) {
			result.setText(Double.toString(calculator.calculate()));
			errorLabel.setText("I have been enlightened by the ancients. The answer to the " + calculator.getOperation() +" problem is: " + calculator.getResult());

			Stage stage = (Stage) errorLabel.getScene().getWindow();
			stage.setTitle("Calculator...?");
		} else if (!number1Valid) {
			errorLabel.setText("Number one must be a double, remember to hit enter after typing!");
		} else if (!number2Valid) {
			errorLabel.setText("Number two must be a double, remember to hit enter after typing!");
		} else if (!operationSelected) {
			errorLabel.setText("Remember to select an operation from below!");
		}
	}
}