package Lesson26Homework;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private int yearOfBook;

	public Book(String title, String author, int yearOfBook) {
		this.title = title;
		this.author = author;
		this.yearOfBook = yearOfBook;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", yearOfBook=" + yearOfBook + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, title, yearOfBook);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title)
				&& yearOfBook == other.yearOfBook;
	}

	
}