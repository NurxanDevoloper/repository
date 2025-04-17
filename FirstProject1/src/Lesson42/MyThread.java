package Lesson42;
//Многопоточность — позволяет выполнять несколько задач параллельно.

// чтобы создать поток надо наследовать от Thread
// наследует от класса
public class MyThread extends Thread{
	// run - чтобы он работал
	public void run() {
		System.out.println("MY THREAD");
	}
	// метод join - позволяет одному потоку ждать завершения другого потока
}
