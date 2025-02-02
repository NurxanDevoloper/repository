package Lesson22Homework;

public class Student {
	private String name;
	private int age;
	private double gpa;
	
	// Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() { 
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {  
        this.age = age;
    }
    
    public double getGpa() { 
        return gpa;
    }
    
    public void UpdateGpa(double newGpa) {  
    	if (newGpa > 0.0 && newGpa < 4.0) {
			this.gpa = newGpa;
			System.out.println("Средний балл" + newGpa);
		} else {
			System.out.println("Ошибка: средний балл должен быть в диапазоне от 0.0 до 4.0");
		}
    }
}