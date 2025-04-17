package Lesson42;
// поток
// наследует от интерфейса
public class MyRunnable implements Runnable{
	// run - чтобы он работал
	
	@Override 
	public void run() {
		System.out.println("My Runnable");
	}
}
