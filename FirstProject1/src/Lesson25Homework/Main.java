package Lesson25Homework;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("Nurhan");
		Person person3 = new Person("Felix", 27);
		
		person1.displayInfo();
		person2.displayInfo();
		person3.displayInfo();
	}
}
