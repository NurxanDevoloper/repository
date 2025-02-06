package Excise;

public class Car {
	private String brand;
	private String model;
	private int year;
	
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public void displayCarInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}
	
}
