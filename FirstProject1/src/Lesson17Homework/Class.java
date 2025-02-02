package Lesson17Homework;

public class Class {

	public static void main(String[] args) {
		// First Homework:
		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 5;
		numbers[2] = 15;
		numbers[3] = 12;
		numbers[4] = 14;

		// Цикл:
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// Second Homework:
		int[] numbers2 = { 5, 10, 15, 20, 25, 30, 35 };
		int sum = 0;
		for (int number : numbers2) {
			sum += number;
		}

		System.out.println("Сумма " + sum);

		// Third Homework::
		int[] numbers3 = { 34, 15, 73, 4, 50, 13 };

		int min = numbers[0];
		int max = numbers[0];

		// Цикл for each:
		for (int number : numbers3) {
			if (number < min) {
				min = number;
			}
			if (number > max) {
				max = number;
			}
		}

		System.out.println("Min number: " + min);
		System.out.println("Max number: " + max);

		// Additional Work:
		String[] fruits = new String[5];
		fruits[0] = "Apple";
		fruits[1] = "Banana";
		fruits[2] = "Cherry";
		fruits[3] = "Orange";
		fruits[4] = "Raspberry";

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}

}
