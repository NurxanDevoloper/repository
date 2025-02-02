package Lesson6;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("введите первое число");
		int num1 = scanner.nextInt();
		System.out.println("введите второй число");
		int num2 = scanner.nextInt();
		System.out.println("введите оператор ");
		String operator = scanner.next();

		switch (operator) {
		case "+":
			System.out.println("num1+num2" + " " + (num1 + num2));
			break;
		case "-":
			System.out.println("num1-num2" + " " + (num1 - num2));
			break;
		case "*":
			System.out.println("num1*num2" + " " + (num1 * num2));
			break;
		case "/":
			System.out.println("num1/num2" + " " + (num1 / num2));
			break;
		default:
			System.out.println("некоректный оператор");
			break;
		}
	}

}
