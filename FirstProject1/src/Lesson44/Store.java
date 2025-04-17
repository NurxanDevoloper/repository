package Lesson44;

public class Store {
	int product = 0;
	
	// сделает продукт равным 1
	// производитель
	synchronized void put() throws InterruptedException {
		if (product==1) wait();
		product=1;
		System.out.println("произведен 1 товар");
		notify();
	}
	
	// потребитель
	synchronized void get()  throws InterruptedException{
		if (product == 0 ) wait();
		System.out.println("товар потреблен");
		notify();
	}
}
