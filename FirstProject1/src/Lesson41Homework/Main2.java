package Lesson41Homework;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main2 {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time.plusMinutes(45));
	}
}
