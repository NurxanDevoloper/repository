package Lesson42Homework;

public class Eating extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Мелейке завтракает. " + 1);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
			}
		}
	}
}
