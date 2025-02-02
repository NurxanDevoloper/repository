package Lesson23Homework;

public class Main {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		Laptop myLaptop = new Laptop();

		myPhone.set("Lenovo");
		myLaptop.set("Acer");
		
		myPhone.turnOn();
		myLaptop.turnOn();

	}
}
