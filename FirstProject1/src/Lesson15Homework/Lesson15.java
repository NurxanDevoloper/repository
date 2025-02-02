package Lesson15Homework;

import java.util.Scanner;

public class Lesson15 {

	public static int Math(int number1, int number2, int number3) {
		return (number1 + number2 + number3 / 3);
	}

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Write 3 numbers:");
		
        int number1 = scanner.nextInt();
        
        int number2 = scanner.nextInt();

        int number3 = scanner.nextInt();
        
        
        int average = Lesson15.Math(number1, number2, number3);

        System.out.println("Среднее значение: " + average);
        
        scanner.close();
	}

}
