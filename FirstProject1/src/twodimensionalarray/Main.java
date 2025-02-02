package twodimensionalarray;

public class Main {
	public static void main(String[] args) {
		String[][] daysOfWeek = { { "1", "Понедельник" }, { "2", "Вторник" }, { "3", "Среда" }, { "4", "Четверг" },
				{ "5", "Пятница" }, { "6", "Суббота" }, { "7", "Воскресенье" } };

		System.out.println("Номер дня недели || Название дня недели");
		System.out.println("-------------------------------------");
		for (String[] day : daysOfWeek) {
			System.out.println(day[0] + "               | " + day[1]);
		}
	}
}
