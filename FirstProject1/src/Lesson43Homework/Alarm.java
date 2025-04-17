package Lesson43Homework;

public class Alarm extends Thread {
//	public static void main(String[] args) {
//		Alarm alarm = new Alarm();
//		alarm.start();
//	}
//	public void run() {
//		while (true) {
//			System.out.println("Будильник звенит!");
//			try {
//				Thread.sleep(2000); 
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
	public void run() {
		try {
			System.out.println("поток начал спать");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// InterruptedException - прерывает поток
			System.out.println("поток был прерван");
		}
	}
}