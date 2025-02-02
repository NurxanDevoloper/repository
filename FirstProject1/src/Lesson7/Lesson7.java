package Lesson7;
import java.util.Scanner;


public class Lesson7 {

	public static void main(String[] args) {
		// логическое И &&
		// true && true=true
		// true && false=false
		// false && true=false
		// false && false=false
//		int x = 15;
//		System.out.println(x !=15 && x >= 15);

		// логическое или ||
		// true || true= true
		// true || false=true
		// false || true=true
		// false ||false=false
//		int x = 10;
//		System.out.println(x > 15 || x == 10);

		// логическое НЕ !
		// !true=false
		// !false=true
//		System.out.println(!false);

//		String name = "admin";
//		String password = "12345678";
//		System.out.println(name.equals("admin"));

//		System.out.println(password.length() > 8);

		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Введите первое число: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Введите второе число: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Введите третье число: ");
	        double num3 = scanner.nextDouble();

	        double arifmetic = (num1 + num2 + num3) / 3;
	        System.out.println("Среднее арифметическое: " + arifmetic);

	        if (num1 > 0 && num2 > 0 && num3 > 0) {
	            System.out.println("Все числа положительные.");
	        } else {
	            System.out.println("Не все числа положительные.");
	        }

	        
	        
		
		
	}

}
