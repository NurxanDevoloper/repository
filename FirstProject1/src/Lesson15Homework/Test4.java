package Lesson15Homework;

import java.util.Random;

public class Test4 {
	public static void main(String[] args) {
		Random random = new Random();
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int randomNumber = random.nextInt(100);
			System.out.println(randomNumber);
			sum += randomNumber;
		}

	}
}
