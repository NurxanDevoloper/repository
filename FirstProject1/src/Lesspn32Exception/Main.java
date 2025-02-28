package Lesspn32Exception;

import java.time.Year;

import Lesson18.Public;

public class Main {
	public static void main(String[] args) {
		// ArithmeticException - Ошибка в математических операциях (деление на ноль)
//		int a = 10;
//		int b = 0;
//		System.out.println(a / b);
//		System.out.println("Hello");

		// NullPointerException - Обращение к null-объекту
//		String s = null;
//		System.out.println(s.length());

		// ArrayIndexOutOfBoundsException - Выход за границы массива
//		int[] numbers = {1,2,3,4};
//		System.out.println(numbers[10]);

		// StringIndexOutOfBoundsException - Выход за границу String
//		String s2 = "Emil";
//		System.out.println(s2.charAt(4));

//		String s3 = "4";
		// используется для преобразования строки (String) в целое число (int)
//		int number = Integer.parseInt(s3);
//		number++;
//		System.out.println(number);

		// NumbeFormatException
//		String s3 = "Umud";

//		int number = Integer.parseInt(s3);
//		System.out.println(number);

		// ArithmeticException
//		try {
//			System.out.println(10/0);
//		} catch (ArithmeticException e) {
//			System.out.println("You can't divide by zero!");
//		}

		// NullPointerException

//		try {
//			String s = null;
//			System.out.println(s.length());
//		} catch (NullPointerException e) {
//			System.out.println("Ошибка обращение к null - объекту");
//		}

		// ArrayIndexOutOfBoundsEception

//		try {
//			int[] numbers = {1,2,3,4};
//			System.out.println(numbers[10]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Ошибка выход за пределы массива");
//		}

		// NumberFormatException -Ошибка преобразования строки в число

//		try {
//			String s4 = "Umud";
//			
//			int number1 = Integer.parseInt(s4);
//			System.out.println(number1);
//		} catch (NullPointerException e) {
//			System.err.println("Ошибка: пеобразование строки в число");
//		}

//		System.out.println("1");

//		try {
//			int result = 10/0;
//		} catch (NullPointerException e) {
		// показывает иерархию ошибке, более конкретно показывает
//			e.getLocalizedMessage();
		// Почти точно также, но немного не конкретно.
//			e.printStackTrace();
//		}
//		System.out.println("1");

//		finally - выполняется всегда даже после catch()
		// Работает даже несмотря на ошибку try,catch
//		try {
//			int result = 10/1;
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			System.out.println("bloc catch");
//		} finally {
//			System.out.println("bloc finally");
//		}

		// кок только он увидит одну ошибку то вторую скорее всего не будет показывать.

		// Multi-catch
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println(0 / numbers[2]);
			String string = null;
			System.out.println(string.charAt(0));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("1");
		} catch (ArithmeticException e) {
			System.out.println("2");
			System.out.println("3");
		} catch (NullPointerException e) {
			System.out.println("4");
		}

//		System.out.println("4");

		// nested try-catch
//		try {
//			try {
//				int number = 10 / 0;
//			} catch (Exception e) {
//				System.out.println("Внутренний catch сработал");
//			}
//			int[] arr = new int[10];
//			arr[20] = 5;
//		} catch (Exception e) {
//			System.out.println("внешний catch работал");
		
		checkAge(14);
		}

		public static void checkAge(int a) {
			if (a < 18) {
				// Ошибка для возраста меньше 18
				throw new IllegalArgumentException("Возраст должен быть больше 18");
			}
			System.out.println("Доступ разрешен");
	}//
}
