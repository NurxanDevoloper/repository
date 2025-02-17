package Lesson26Homework;

public class Main {

	public static void main(String[] args) {

		Book book1 = new Book("Лейли и Меджнун", "Низами Гянджеви", 12);
		Book book2 = new Book("Книга Деде Горгуд", "", 15);
		// toString() - возвращает строковое обозначение объекта.
		System.out.println(book1.toString());
		// Equals - сравнивает два объекта.
		System.out.println(book1.equals(book2));
		System.out.println(book2.equals(book1));
		// HashCode - возвращает хеш-код объекта
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
	}

}
