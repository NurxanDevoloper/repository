package Lesson24Homework;

public class Dog extends Animal {
    // Override - это аннотация в java, которая указывает, что метод переопределяет метод суперкласса.  
	@Override
	void makeSound() {
		System.out.println("Собака лает.");
	}
}
