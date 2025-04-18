package Lesson44Homework;

public class Store {
	boolean product = false;

	// производитель
	synchronized void put() throws InterruptedException {
		if (product == true) wait(); 
		product = true;
		System.out.println("Произведен 1 товар");
		 // уведомляем потребителя
		notify();
	}
	//потребитель
	synchronized void get() throws InterruptedException {
		if (!product) wait(); 
		product = false;
		System.err.println("Товар потреблен");
		// уведомляем производителя
		notify();
	}
	
}