package Lesson36Homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		   // 3)
		Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        System.out.println("Введите числа (для завершения введите -1):");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) break;
            numbers.add(num);
        }
        System.out.println("Уникальные числа: " + numbers);
	}

}
