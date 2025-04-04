package Lesson40Homework;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
		// принимает переменную типа T и возвра Boolean(true,flse)
        Predicate<Integer> isEven = n -> n % 2 != 0;

        if (isEven.test(number)) {
            System.out.println(number + " нечётное число.");
        } else {
            System.out.println(number + " чётное число.");
        }

	}

}
