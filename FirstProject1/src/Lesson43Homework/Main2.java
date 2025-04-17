package Lesson43Homework;

public class Main2 {

	public static void main(String[] args) {
		Thread vacum = new Thread(() ->
		System.out.println("Пылесошу..."));
		Thread washWindows = new Thread(() ->
		System.out.println("Мою окна..."));
		Thread takeOutTrash = new Thread(() -> 
		System.out.println("Выкидываю мусор..."));

		vacum.setPriority(Thread.MIN_PRIORITY);
		takeOutTrash.setPriority(Thread.MAX_PRIORITY);

		vacum.start();
		washWindows.start();
		takeOutTrash.start();

	}

}
