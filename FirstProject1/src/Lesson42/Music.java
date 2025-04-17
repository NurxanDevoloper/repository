package Lesson42;

public class Music implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 5 ; i++) {
			System.out.println("Мелейке слушает музыку " + i);
			try {
				Thread.sleep(1000);
				// ошибка потока
			} catch (InterruptedException e) {
			}
		}
	}
}
