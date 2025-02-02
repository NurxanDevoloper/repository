package Lesson14Homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		int number1 = 5;
		int square = squareNumber(number1);
		System.out.println("Квадрат числа: " + number1 + " равна " + square);
		
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int number = scanner.nextInt();
//        int square = squareNumber(number);
//        System.out.println("Квадрат числа" + " равен: " + square);
	}


	  
	   public static int squareNumber(int num) {
	        return num * num;
	    }
}
