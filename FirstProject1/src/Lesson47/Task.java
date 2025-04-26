package Lesson47;

public class Task {
	
	private static int counter = 0;
	
	private int id;
	private String title;
	private String description;
	private boolean isCompleted;
	
	public Task(String title, String description) {
	    this.id = counter++;
		this.title = title;
		this.description = description;
		this.isCompleted = false;
	}
	
	public int getId() {
		return id;
	}
	
	public void markAsCompleted() {
		this.isCompleted = true;
	}
	
	public boolean isCompleted() {
		return isCompleted;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", description=" + description + ", isCompleted=" + isCompleted
				+ "]";
	}
}
