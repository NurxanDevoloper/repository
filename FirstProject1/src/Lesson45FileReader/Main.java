package Lesson45FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\User\\Desktop\\user.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileReader fileReader = new FileReader("C:\\Users\\User\\Desktop\\user.txt");
		int symbol;
		// сначала он читает в виде цифр напри(1,5,7,10) 
		// сохраняет его под переменной integer и выводит его на экран:
		while ((symbol = fileReader.read()) != -1) {
			// по одному он читает каждый символ и выводит его на екран:
			System.out.println((char) symbol);
		}
	}

}
