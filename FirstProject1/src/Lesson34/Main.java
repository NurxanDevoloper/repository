package Lesson34;

public class Main {

	public static void main(String[] args) {
//		try {
//			riskyMethod();
//		} catch (Exception e) {
//			System.out.println("1");
//		}

		try {
			throw new MyException("My Exception!");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	// throws - обрабатывает информацию
	public static void riskyMethod() throws NullPointerException{
//		int result = 10/0;
		try {
			String s = null;
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

}
