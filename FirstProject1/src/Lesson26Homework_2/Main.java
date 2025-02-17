package Lesson26Homework_2;

import Lesson26Homework.Book;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("Nurhan", 13, "Baku");
		Person person2 = new Person("Ibrahim", 16, "US");
		// toString() - возвращает строковое обозначение объекта.
		System.out.println(person1.toString());
		// Equals - сравнивает два объекта.
		System.out.println(person1.equals(person1));
		System.out.println(person2.equals(person1));
		// HashCode - возвращает хеш-код объекта
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		// getClass - возвращает класс
	}
}
