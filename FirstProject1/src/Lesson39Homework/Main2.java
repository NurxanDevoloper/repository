package Lesson39Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

	public static void main(String[] args) {
		// 2)
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(3);
		numbers.add(5);
		numbers.add(8);
		numbers.add(12);
		numbers.add(7);

		System.out.println(numbers);
		
		// Stream API
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);
	}

}
