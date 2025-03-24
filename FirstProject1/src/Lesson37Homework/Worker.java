package Lesson37Homework;

import java.util.Comparator;

public class Worker implements Comparator<Worker> {
	String name;
	int age;

	public Worker(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(Worker o1, Worker o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}
