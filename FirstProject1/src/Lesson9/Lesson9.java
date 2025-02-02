package Lesson9;

public class Lesson9 {

	public static void main(String[] args) {

		// break
		// заверщает выполнение цикл
//		for (int i = 0; i <= 10; i++) {
//			if (i == 4) {
//				break;
//			}
//			System.out.println(i);
//		}
//
//		// continue
//		// пропускает текущую итерацию
//		for (int i = 0; i <= 10; i++) {
//			if (i == 5) {
//				continue;
//			}
//			System.out.println(i);
//		}

		int sum = 0;
		for (int i = 0; i <= 3; i++) {
//			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
	}

}
