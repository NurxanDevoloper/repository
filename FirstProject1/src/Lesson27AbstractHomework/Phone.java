package Lesson27AbstractHomework;

// extends Device - наследую методы turnOn(), turnOff() с помощью ключегого слова extends
public class Phone extends Device{
	@Override
	void turnOn() {
		System.out.println("Телефон включается,");
	}
	
	@Override
	void turnOff() {
		System.out.println("Телефон выключается;");
	}
}