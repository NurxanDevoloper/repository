package Lesson25Homework_2;

public class Car {
	private String brand;
	private String model;
	private int year;
	
	
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setBrand(String brand) {
        this.brand = brand;
    }
	
	public void setModel(String model) {
        this.model = model;
    }
	
	public void setYear(int year) {
        this.year = year;
    }
	
	public void displayCarInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
	}

}
