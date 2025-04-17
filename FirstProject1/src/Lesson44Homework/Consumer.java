package Lesson44Homework;

public class Consumer implements Runnable{
	private Store store;
	
	public Consumer(Store store) {
		this.store = store;
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				store.get();
				Thread.sleep(700);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
