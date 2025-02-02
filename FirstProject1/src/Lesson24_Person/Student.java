package Lesson24_Person;

public class Student extends Person{
	Student(String name) {
		// super используется для вызова конструктора или метода суперкласса.
		// вызываем конструктор
        super(name);
    }
    
    @Override 
    // Override - это аннотация в java, которая указывает, что метод переопределяет метод суперкласса.  
    void introduce() {
    	// вызываем метод
        super.introduce();
        System.out.println("Я студент.");
    }
}
