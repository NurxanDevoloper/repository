package Lesson41ClassWork;

public class Listening implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 3 ; i++) {
			System.out.println("Nurhan слушает музыку " + i);
			try {
				Thread.sleep(600);
				// ошибка потока
			} catch (InterruptedException e) {
			}
		}
	}
}
