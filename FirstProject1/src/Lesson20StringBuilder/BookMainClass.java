package Lesson20StringBuilder;

public class BookMainClass {
	public static void main(String[] args) {

		// Создаю массив для открытия классов
		Book[] books = new Book[3];

		books[0] = new Book("Мастер и Маргарита", "Михаил Булгаков");
		books[1] = new Book("Война и мир", "Лев Толстой");
		books[2] = new Book("Преступление и наказание", "Фёдор Достоевский");

		for (Book book : books) {
			System.out.println(book.getBookInfo());
		}
	}
}
