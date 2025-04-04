package Lesson41ClassWork;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		LocalDateTime specificDateTime = LocalDateTime.of(2012,01,07, 25,14,00); 
		System.out.println(specificDateTime);
		System.out.println(specificDateTime.plusMonths(1));
		System.out.println(specificDateTime.plusWeeks(2));

	}

}
