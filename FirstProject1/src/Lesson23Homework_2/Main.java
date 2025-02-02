package Lesson23Homework_2;

public class Main {

	public static void main(String[] args) {
	    Runner runner = new Runner();
        runner.setName("Arif");
        runner.setDistance(5.0);

        Swimmer swimmer = new Swimmer();
        swimmer.setName("Yusif");
        swimmer.setSwimTime(30.0);

        // Вызываю все методы
        runner.train();
        runner.run();

        swimmer.train();
        swimmer.swim();
	}

}
