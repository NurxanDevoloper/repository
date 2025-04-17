package Lesson42;

public class Main {

	public static void main(String[] args) {
//		MyThread thread = new MyThread();
		// чтобы запустить поток 
//		thread.start();
		
//		Thread thread2 = new Thread(new MyRunnable());
//		thread2.start();
		
		// thread
//		Cooking cooking = new Cooking();
//		cooking.start();
		// runnable
//		Thread music = new Thread(new Music());
//		music.start();
		
		
		// метод join - позволяет одному потоку ждать завершения другого потока
//		Thread breakfast = new Thread(()-> {
//			System.out.println("cooking breaakfast");
//			try {
//				Thread.sleep(3000);
//			} catch (Exception e) {
//			}
//			System.out.println("Breakfast ready");
//		});
		
//		Thread dishes = new Thread(()-> {
//			try {
//				breakfast.join();
//			} catch (Exception e) {
//			}
//			System.out.println("my dish");
//		});
		
//		breakfast.start();
//		dishes.start();
		
		// по defalut :5
		Thread premiumPreority = new Thread(()-> {
			System.out.println("поток с низким приоритетам");
		});
		Thread lowPrioiruty = new Thread(()-> {
			System.out.println("поток с низким приоритеам");
		});
		premiumPreority.setPriority(Thread.MAX_PRIORITY);
		lowPrioiruty.setPriority(Thread.MIN_PRIORITY);
		
		premiumPreority.start();
		lowPrioiruty.start();
}
}