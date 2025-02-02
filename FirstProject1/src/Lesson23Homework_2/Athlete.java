package Lesson23Homework_2;

public class Athlete {
    private String name;
    // Метод для установки имени
    public void setName(String name) {
        this.name = name;
    }

    // Создаю метод для тренировки, дальше внутри этого метода создаю условие
    public void train() {
    	// Проверяет, задано ли значение для переменной.
        if (name != null) {
            System.out.println("Спортсмен " + name + " тренируется.");
        } else {
            System.out.println("Спортсмен тренируется, но имя не указано.");
        }
    }

    public String getName() {
        return name;
    }
}
