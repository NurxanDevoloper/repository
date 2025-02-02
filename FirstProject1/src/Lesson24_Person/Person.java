package Lesson24_Person;

import java.util.jar.Attributes.Name;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	void introduce() {
		System.out.println("Меня зовут " + name);
	}
}
