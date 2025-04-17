package Lesson42ClassWork;

public class WatchingYoutube extends Thread{
	public void run() {
		for (int i = 1; i <= 8; i++) {
			System.out.println("Nurhan wathcing videos on youtube" + 1);
			// отправляет поток в спячку
			try {
				Thread.sleep(800);
				// ошибка потока
			} catch (InterruptedException e) {
			}
		}
	}
}
