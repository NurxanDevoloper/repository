package Lesson9;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		for (int i = 0; i <= 5; i++) {
//			sum = sum + i;
//			System.out.println(i);
//		}
//		System.out.println(sum);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int num = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
		
	}

}
