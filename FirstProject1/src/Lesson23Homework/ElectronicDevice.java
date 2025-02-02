package Lesson23Homework;

public class ElectronicDevice {
	private String brand;

	public ElectronicDevice set(String brand) {
		this.brand = brand;
		return this;
	}

	public void turnOn() {
		System.out.println("Устройство " + brand + " включено.");
	}
}