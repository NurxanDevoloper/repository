package Lesson25Homework;

public class Person {
	private String name;
	private int age;

	public Person() {
		this.name = "Unnown";
		this.age = 0;
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}
