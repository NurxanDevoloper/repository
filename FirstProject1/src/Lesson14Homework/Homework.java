package Lesson14Homework;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// First Homework:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите три числа:");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();

		int maxNumber = MaxNumber(number1, number2, number3);
		System.out.println("Наибольшее число: " + maxNumber);
	}

	public static int MaxNumber(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}
}
