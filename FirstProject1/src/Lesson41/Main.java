package Lesson41;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
//		Integer num = 12;
//		String str = "hello";
//		String date = "2024.04.04";

		// old version показывает оба и дату и время и словами
//		Date date2 = new Date();
//		System.out.println(date);

		// возвращает текущую дату
//		LocalDate date = LocalDate.now();
//		System.out.println(date);

		// of() возвращает конкретную дату, свою дату
//		LocalDate specificDate = LocalDate.of(2023, 03, 17);
//		System.out.println(specificDate);
//		System.out.println(specificDate.plusDays(2));
//		System.out.println(specificDate.plusMonths(4));

		// возвращает текущее время
//		LocalTime specificDate = LocalTime.now();
//		System.out.println(specificDate);

		// время которое мы сами задали
//		LocalTime specificTime = LocalTime.of(20, 42); 
//		System.out.println(specificTime);

//		LocalTime time = LocalTime.of(15, 30, 20, 213010293); 
//		System.out.println(time);

		// одновременно и время и дату выводит
//		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println(dateTime);

		LocalDateTime specificDateTime = LocalDateTime.of(2020,06,25,14,00); 
		System.out.println(specificDateTime);
		System.out.println(specificDateTime.minusHours(1));

//		LocalDateTime specificDateTime2 = LocalDateTime.of(specificDate, specificTime);
//		System.out.println(specificDateTime2);
		
//		ZonedDateTime zonedDateTime = ZonedDateTime.now();
//		System.out.println(zonedDateTime);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(2024,4,2,14,30, 0, 0, ZoneId.of("A/Moscov"));
		System.out.println(zonedDateTime);
		
		LocalDate date = LocalDate.of(2025, 2, 31);	
	}

}
