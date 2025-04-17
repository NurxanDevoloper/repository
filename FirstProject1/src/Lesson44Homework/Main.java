package Lesson44Homework;

public class Main {

	public static void main(String[] args) {
		Store store = new Store();
		// with thread
		Producer producer = new Producer(store);
		// with runnable
		Thread consumer = new Thread(new Consumer(store));
		
		producer.start();
		consumer.start();
		
		
//		Thread producer = new Thread(() -> {
//			for (int i = 0; i < 3; i++) {
//			    try {
//					store.put();
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//				}
//			}
//		});
		
//		Thread consumer = new Thread(() ->{
//			for (int i = 0; i < 3; i++) {
//				try {
//					store.get();
//					Thread.sleep(1500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				}
//		});
		
	}

}
