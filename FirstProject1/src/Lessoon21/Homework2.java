package Lessoon21;

public class Homework2 {
	// #2

	private String brand;
	private int speed;

	public Homework2(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	public void accelerate(int increment) {
		speed += increment;
		System.out.println("Скорость увеличена на " + increment + ". Новая скорость: " + speed);
	}

	public void displayInfo() {
		System.out.println("Марка: " + brand + ", Скорость: " + speed);
	}

	public static void main(String[] args) {
		Homework2 car = new Homework2("Mercedes", 260);

		car.displayInfo();
		
		car.accelerate(50);
		
		car.displayInfo();
	}
}
