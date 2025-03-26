package Lesson39Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 1)
		String[] namesString = { "Emil", "Aylin", "Nurhan" };

		List<String> nameList = new ArrayList<>(Arrays.asList(namesString));
		System.out.println(nameList);
	}

}
