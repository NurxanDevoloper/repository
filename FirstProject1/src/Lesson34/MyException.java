package Lesson34;

public class MyException extends Exception{
	// Создаю свою собственную ошибке
	public MyException(String message) {
		// Вызывает конструктор
		super(message);
	}
}
