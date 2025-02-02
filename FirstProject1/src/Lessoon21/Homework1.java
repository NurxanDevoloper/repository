package Lessoon21;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// #1
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();


		if (num1 > 0 || num2 > 0) {
			System.out.println("Одно из чисел хотябы положительное");
		} else {
			System.out.println("Числа не являются положительными");
		}
	}

}
