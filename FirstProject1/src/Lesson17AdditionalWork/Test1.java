package Lesson17AdditionalWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*100) + 1;
		}
		
		System.out.println("Massiv:" + numbers);
		
		Arrays.sort(numbers);
		System.out.println("Sorted Massiv");
		
		int min = numbers[0];
		int max = numbers[0];
		for (int number : numbers) {
			if (number < min) min = number; 
			if (number < max) max = number;
		}
		
		System.out.println("Max number");
		System.out.println("Min number");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write numbers for reach something");
		int number1 = scanner.nextInt();
		int number2IN = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == number1) {
				number2IN = i;
				break;
			}
		}
		if (number2IN != -1) {
			System.out.println("Number was find");
		} else {
			System.out.println("Number didn't find");
		}
		
		boolean SomeNumbers = true;
		for (int i = 0; i < numbers.length / 2; i++) {
//			if (numbers[i] != numbers) {
//				
//			}
		}
		
	}

}
