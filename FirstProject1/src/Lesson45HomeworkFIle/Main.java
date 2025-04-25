package Lesson45HomeworkFIle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Введите ваше имя:");
//		String name = scanner.nextLine();

//		try {
//			FileWriter file = new FileWriter("C:\\Users\\User\\Desktop\\user.txt");
//			file.write(name);
//			file.close();
//			System.out.println("Имя сохранено в файл!");
//		} catch (IOException e) {
//			System.out.println("Произошла ошибка при записи имени: " + e.getMessage());
//		}

		try {
			FileWriter tableWriter = new FileWriter("C:\\Users\\User\\Desktop\\table.txt");
			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 3; j++) {
					String line = i + " x " + j + " = " + (i * j);
					tableWriter.write(line + "\n");
				}
				tableWriter.write("\n");
			}
			tableWriter.close();
			System.out.println("Таблица умножения записана в файл!");
		} catch (IOException e) {
			System.err.println("Произошла ошибка при записи таблицы: " + e.getMessage());
		}

	}

}
