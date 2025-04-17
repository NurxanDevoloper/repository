package Lesson44Homework;

public class Producer extends Thread{
	private Store store;
	
	public Producer(Store store) {
		this.store = store;
	}
	
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				store.put();
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}