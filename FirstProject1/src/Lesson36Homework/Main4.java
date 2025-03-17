package Lesson36Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Item> items = new ArrayList<>();

		System.out.println("Введите количество элементов:");
		int count = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < count; i++) {
			System.out.println("Введите элемент:");
			String itemName = scanner.nextLine();
			items.add(new Item(itemName));
		}

		System.out.println("Введите элемент для поиска:");
		String searchItemName = scanner.nextLine();
		Item searchItem = new Item(searchItemName);

		if (items.contains(searchItem)) {
			System.out.println("Элемент найден: " + searchItem);
		} else {
			System.out.println("Элемент не найден");
		}

		scanner.close();
	}

}
