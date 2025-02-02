package Works;

import java.util.Scanner;

public class Class2 {
	public static void main(String[] args) {

		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Введите значение: ");
	        int n = scanner.nextInt();

	        int[] array = new int[n];
	        for (int i = 0; i < n; i++) {
	            array[i] = i + 1;
	        }

	        int max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i]; 
	            }
	        }

	        System.out.println("Максимальное число в массиве: " + max);

	}
}
