package com.spderman3333.calculator;

public class Calculator {
	private double number1;
	private double number2;
	private double result;
	private Operation operation;

	public Calculator() {
	}

	public Calculator(double number1, double number2, String operation) {
		this.number1 = number1;
		this.number2 = number2;
		this.operation = convertStringToEnum(operation);
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public void setOperation(String operation) {
		this.operation = convertStringToEnum(operation);
	}

	public double getResult() {
		return result;
	}

	public Operation getOperation() {
		return operation;
	}

	public double calculate() {
		switch ( operation ) {
			case ADDITION:
				result = number1 + number2;
				return result;
			case SUBTRACTION:
				result = number1 - number2;
				return result;
			case MULTIPLICATION:
				result = number1 * number2;
				return result;
			case DIVISION:
				result = number1 / number2;
				return result;
			case MODULUS:
				result = number1 % number2;
				return result;
			default:
				// Literally can't happen.
				return Double.MAX_VALUE;
		}
	}

	private Operation convertStringToEnum(String fromDropDown) {
		switch ( fromDropDown ) {
			case "Addition":
				return Operation.ADDITION;
			case "Subtraction":
				return Operation.SUBTRACTION;
			case "Multiplication":
				return Operation.MULTIPLICATION;
			case "Division":
				return Operation.DIVISION;
			case "Modulus":
				return Operation.MODULUS;
			default:
				throw new RuntimeException("Error converting string to enum.");
		}
	}

	private enum Operation {
		ADDITION,
		SUBTRACTION,
		MULTIPLICATION,
		DIVISION,
		MODULUS
	}


}
