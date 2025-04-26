package Lesson47;

import java.util.ArrayList;

public class TaskManager {
	private ArrayList<Task> tasks = new ArrayList<Task>();
	
	public void addTask(Task task) {
		tasks.add(task);
	}
	
	public void removeTask(int id) {
		tasks.remove(id);
	}
	
	public void AllTasks() {
		for (Task task : tasks) {
			System.out.println(tasks.toString());
		}
	}
	
	// чтобы отмечать метод
	public void markAsCompleted(int id) {
		for (Task task : tasks) {
			if (task.getId()==id) {
				task.markAsCompleted();
				return;
			}
		}
	}
}