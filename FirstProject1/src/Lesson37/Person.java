package Lesson37;

import java.util.Comparator;

public class Person implements Comparator<Person> {
	String name;
	int age;
	

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + "]";
	}
	
	public int compare(Person o) {
		// по убыванию
		return Integer.compare(o.age, this.age);
		// по возрастанию
//		return this.age- o.age;
	}

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}