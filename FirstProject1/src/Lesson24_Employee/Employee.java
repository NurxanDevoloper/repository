package Lesson24_Employee;

public class Employee {
	private String name;
	private String position;
	
	Employee(String name, String position) { 
		this.name = name;
		this.position = position;
	}
	
	void displayAboutInfo() {
        System.out.println("Имя: " + name + ", Должность: " + position);
	}
}
