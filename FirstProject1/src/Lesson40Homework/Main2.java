package Lesson40Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main2 {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("hello");
		strings.add("world");
		strings.add("java");

		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

		strings.forEach(printUpperCase);
	}

}
