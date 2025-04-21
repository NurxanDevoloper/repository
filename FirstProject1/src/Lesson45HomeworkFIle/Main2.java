package Lesson45HomeworkFIle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\User\\Desktop\\table.txt");
			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println("Умноженные числа: " + i * j);
					fileWriter.write("");
				}
			}
			fileWriter.close();
            System.out.println("Таблица умножения записана в файл!");
		} catch (IOException e) {
            System.out.println("Произошла ошибка при записи таблицы: " + e.getMessage());
		}

	}

}
