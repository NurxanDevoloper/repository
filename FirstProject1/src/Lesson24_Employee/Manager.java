package Lesson24_Employee;

public class Manager extends Employee{
	int teamSize;
	
	Manager(String name, String position, int teamSize) {
		super(name, position);
		this.teamSize = teamSize;
	}
	
	
	@Override
	void displayAboutInfo() {
		super.displayAboutInfo();
		System.out.println("Team size: " + teamSize);
	}
}