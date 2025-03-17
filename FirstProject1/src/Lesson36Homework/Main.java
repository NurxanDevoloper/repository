package Lesson36Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	// List - дубликаты допускаются , и сохраняется порядок
	// Если порядок важен то использую List(), а если не важен то использую SET, если
	// нужна уникальность то List(), если нет то SET()
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> names = new ArrayList<String>();
		System.out.println("Введите имя:");
		String name = scanner.nextLine();
		names.add(name);

		System.out.println("Введите следующее имя:");
		name = scanner.nextLine();
		names.add(name);

		System.out.println("Введите имя для поиска:");
		String searchName = scanner.nextLine();

		if (names.contains(searchName)) {
			System.out.println("Имя найдено.");
		} else {
			System.out.println("Имя не найдено");
		}
		
		scanner.close();
	}

}
