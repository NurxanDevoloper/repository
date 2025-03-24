package Lesson38Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//key=integer
//value=string
public class MainPhoneDirectory {

	public static void main(String[] args) {
		// 1)
		Map<String, String> phoneBook = new HashMap<String, String>();
		// put - для добавления в (Map)
		// add - для добавления в (List)
		phoneBook.put("Nurhan", "+994 50 975 95 85");
		phoneBook.put("Umud", "+994 10 727 78 47");
		phoneBook.put("Sabir", "+994 51 300 09 01");

		System.out.println("Телефонный справочник.");

		for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
			System.out.println("Имя: " + entry.getKey() + ", Телефон: " + entry.getValue());
		}

		// 2)
		Map<Integer, String> numbersWords = new HashMap<Integer, String>();
		numbersWords.put(1, "один");
		numbersWords.put(2, "два");
		numbersWords.put(3, "три");
		numbersWords.put(4, "четыре");
		numbersWords.put(5, "пять");

		for (Map.Entry<Integer, String> entry : numbersWords.entrySet()) {
			System.out.println("Число: " + entry.getKey() + ", Слово: " + entry.getValue());
		}

		// 3)

		List<String> names = new ArrayList<String>(phoneBook.keySet());

		Collections.sort(names);
		System.out.println("Отсортированные имена: " + names);

		Collections.shuffle(names);
		System.out.println("Перемешанные имена: " + names);

		String maxName = Collections.max(names);
		String minName = Collections.min(names);
		System.out.println("Максимальное имя: " + maxName);
		System.out.println("Минимальное имя: " + minName);

		List<Integer> numbers = new ArrayList<>(numbersWords.keySet());

		// Сортировка списка чисел
		Collections.sort(numbers);
		System.out.println("Отсортированные числа: " + numbers);

		// Перемешивание списка чисел
		Collections.shuffle(numbers);
		System.out.println("Перемешанные числа: " + numbers);

		int maxNumber = Collections.max(numbers);
		int minNumber = Collections.min(numbers);
		System.out.println("Максимальное число: " + maxNumber);
		System.out.println("Минимальное число: " + minNumber);
	}

}
