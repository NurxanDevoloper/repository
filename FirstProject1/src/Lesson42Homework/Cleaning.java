package Lesson42Homework;
//Многопоточность — позволяет выполнять несколько задач параллельно.

public class Cleaning extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Мелейке убирается в комнате. " + 1);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
			}
		}
	}
}
