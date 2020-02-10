package com.vinay.Calculator_Operations;

import com.vinay.Calculator_Operations.Services.*;

public class App {

	private CalculatorService calculatorService;

	public App(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	double performCalculation(int number1, int number2, char operator) {

		double result = 0.0;

		switch (operator) {

		case '+':
			result = calculatorService.addNumbers(number1, number2);
			break;
		case '-':
			result = calculatorService.subtractNumbers(number1, number2);
			break;
		case '*':
			result = calculatorService.multiplyNumbers(number1, number2);
			break;
		case '/':
			result = calculatorService.divideNumbers(number1, number2);
			break;
		default:
			System.out.println("Wrong Operator");
			return -1;
		}

		return result;
	}
}