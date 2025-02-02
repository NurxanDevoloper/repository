package CalculatorPackage;

import java.util.Scanner;

public class CalculatorClass {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		if (b == 0) {
			System.out.println("На ноль делить нельзя!");
		}
		return a / b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorClass calculator = new CalculatorClass();

		System.out.println("Напишите первое число");
		int number1 = scanner.nextInt();

		System.out.println("Напиши второе число!");
		int number2 = scanner.nextInt();

		System.out.println("Выберите операцию: add, subtract, multiply, divide");
		String operation = scanner.next();

		int result;

	       if (operation.equals("add")) {
	            result = calculator.add(number1, number2);
	            System.out.println("Результат: " + result);
	        } else if (operation.equals("subtract")) {
	            result = calculator.subtract(number1, number2);
	            System.out.println("Результат: " + result);
	        } else if (operation.equals("multiply")) {
	            result = calculator.multiply(number1, number2);
	            System.out.println("Результат: " + result);
	        } else if (operation.equals("divide")) {
	            result = calculator.divide(number1, number2);
	            if (!Double.isNaN(result)) {
	                System.out.println("Результат: " + result);
	            }
	        } else {
	             System.out.println("Неверная операция. Попробуйте снова.");
	        }

  	}
}
