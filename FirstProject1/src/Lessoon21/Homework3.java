package Lessoon21;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Write something");
		String stroka = scanner.nextLine();
		// Переворачивает строку
		StringBuilder sBuilder = new StringBuilder(stroka);
		sBuilder.reverse();

//		for (int i = 0; i < sBuilder.length(); i++) {
//			if (sBuilder.charAt(i) == "") {
//				sBuilder.setCharAt(i, "_");
//			}
//		}

		System.out.println(sBuilder);

	}
}
