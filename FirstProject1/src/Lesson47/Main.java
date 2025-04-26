package Lesson47;

public class Main {

	public static void main(String[] args) {
		TaskManager manager = new TaskManager();
		
		Task task1 = new Task("JAVA", "Создать объект");
		Task task2 = new Task("FRONTEND", "Создать Сайт");
		Task task3 = new Task("JAVA", "Создать калькулятор");
		System.out.println("OLD LIST:");
		
		manager.addTask(task1);
		manager.addTask(task2);
		manager.addTask(task3);

		manager.AllTasks();
		
		manager.removeTask(2);
		System.out.println("new LIST:");
		manager.AllTasks();

		manager.markAsCompleted(0);
		System.out.println("New list -2");
		manager.AllTasks();
	}

}
