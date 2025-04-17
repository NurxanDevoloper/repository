package Lesson42Homework;

public class Podcast extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Мелейке слушает подкаст. " + 1);
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
			}
		}
	}
}
