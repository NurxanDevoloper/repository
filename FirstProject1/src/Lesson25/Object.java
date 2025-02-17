package Lesson25;

public class Object {
	// toString -   
	// Конструктор - для инцилизации 

	String name;
	int age;

	@Override
	public String toString() {
		return "Object [name=" + name + ", age=" + age + "]";
	}

	public Object(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void sayHello() {
		System.out.println();
	}
	
	public void sayHello(int a) {
		System.out.println();
	}

}
