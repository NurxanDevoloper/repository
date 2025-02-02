package Lesson17;

import java.lang.Thread.Builder.OfVirtual;


public class Lesson17Massiv {
	public static void main(String[] args) {

//		String string = "Meleyke";
//		String string2 = "meleyke";
//		System.out.println(string.equalsIgnoreCase(string2));
		
		
		
		int[] numbers= new int[5];
		numbers[0]=10;
		numbers[1]=5;
		numbers[2]=15;
		numbers[3]=12;
		numbers[4]=14;

//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}

		
		for (int i : numbers) {
			System.out.println(i);
		}
	}
}