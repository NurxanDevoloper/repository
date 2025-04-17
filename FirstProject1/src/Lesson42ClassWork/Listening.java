package Lesson42ClassWork;

public class Listening implements Runnable {

	public Listening(Listening listening) {
		// TODO Auto-generated constructor stub
	}









	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Nurhan слушает музыку " + i);
			try {
				Thread.sleep(600);
				// ошибка потока
			} catch (InterruptedException e) {
			}
		}
	}

	
	
	
	
	
	
	
	
	public void start() {
		// TODO Auto-generated method stub

	}
}
