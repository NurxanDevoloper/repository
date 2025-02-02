package Lesson14Homework;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
         System.out.println("Введите строку:");
         String input = scanner.nextLine();

         int length = getStringLength(input);

         System.out.println("Длина введённой строки: " + length);

    }

    public static int getStringLength(String l) {
        return l.length();
    }
}
