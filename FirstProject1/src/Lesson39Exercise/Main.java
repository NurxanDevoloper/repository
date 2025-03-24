package Lesson39Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(10);
		
		
		List<Integer> newNumbers = numbers.stream().filter(a -> a % 5 == 1).map(s -> s * 2)
				.collect(Collectors.toList());
		System.out.println(newNumbers);
		
	}

}
