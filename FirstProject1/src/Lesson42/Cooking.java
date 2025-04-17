package Lesson42;

import java.util.Iterator;

public class Cooking extends Thread{
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Мелейке готовит еду " + 1);
			// отправляет поток в спячку
			try {
				Thread.sleep(800);
				// ошибка потока
			} catch (InterruptedException e) {
			}
		}
	}
}
