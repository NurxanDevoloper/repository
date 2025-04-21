package Lesson45File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\User\\Desktop\\example.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("Файл успешно создан");
			} else {
				System.out.println("Файл уже существует");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// чтобы записывать файл
		try {
			FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\example.txt");
			writer.write("hello world");
			writer.write("Hello Emil");
			writer.close();
			System.out.println("данные записаны");
		} catch (IOException e) {
			System.out.println("данные не записаны");
			e.printStackTrace();
		}

	}

}
