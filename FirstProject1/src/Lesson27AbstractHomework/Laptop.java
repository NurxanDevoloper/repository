package Lesson27AbstractHomework;

public class Laptop extends Device{
	@Override
	void turnOn() {
		System.out.println("Компьютер включается,");
	}
	
	@Override
	void turnOff() {
		System.out.println("Компьютер выключается.");
	}
}
