package Lesson34Homework;

public class Main {
	public static void main(String[] args) {
//		UserNotFoundException userNotFoundException = new UserNotFoundException(null);
		UserService userService = new UserService();
		
		try {
			userService.findUser(" user123");
		} catch (UserNotFoundException e) {
			System.out.println("Error" + e.getMessage());
		}
	}
}
