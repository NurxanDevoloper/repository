package Lesson45File;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("example.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
