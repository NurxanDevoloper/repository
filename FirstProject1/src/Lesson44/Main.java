package Lesson44;

public class Main {

	public static void main(String[] args) {
		Store store = new Store();
		Thread producer = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
			    try {
					store.put();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
		Thread consumer = new Thread(() ->{
			for (int i = 0; i < 3; i++) {
				try {
					store.get();
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
		});

	}

}
