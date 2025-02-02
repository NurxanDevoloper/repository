package Lesson20StringBuilder;

public class Book {
	// private - доступны только в пакете котором создан
	private String title;
	private String author;

	// public - доступен для всего проекта
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getBookInfo() {
		return "Название: " + title + ", Автор: " + author;
	}

}