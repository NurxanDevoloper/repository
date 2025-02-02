package Lesson11;

public class Lesson11Class {
	// поля
	String name;
	int age;

	public Lesson11Class(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void work() {
		System.out.println(name+  " is working");
	}
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
}
