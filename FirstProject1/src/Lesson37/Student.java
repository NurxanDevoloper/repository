package Lesson37;

import Lesson36Exicise.Person;

public class Student implements Comparable<Student>{
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		// по убыванию
		return Integer.compare(o.age, this.age);
		// по возрастанию
//		return this.age- o.age;
	}
	
}
// Person p1 = new person