package Lesson14Homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		// Second work:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write your first name please:");
        String name = scanner.nextLine();
        Welcoming(name);
	}
	
	
	public static void Welcoming(String name) {
		System.out.println("Hello, " + name + "!");
	}


}