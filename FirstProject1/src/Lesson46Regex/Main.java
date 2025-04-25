package Lesson46Regex;

public class Main {

	public static void main(String[] args) {
//		String phoneNumber = "телефон: 055-554-6770";
//		String newPhoneNumber = phoneNumber.replaceAll("//d", "*");
//		System.out.println(newPhoneNumber);

//		String emailString = "aylin@mail.ru";
//		boolean ok = emailString.matches(emailString);

		String ApiString = "256.256.256.256\r\n" + "";
		boolean ApiBoolean = ApiString.matches(
				"(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}");
		System.out.println(ApiBoolean);
		
		String Username = "91212jefmdkmcdkmkfmv";
		boolean UsernameBoolean = Username.matches(
				"(^[a-z0-9_-]{3,15}$");
		System.out.println(UsernameBoolean);
		
		String Password = "12918298jdnvfjnvfjnvjdcdmc";
		boolean PasswordBoolean = Password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$");
		System.out.println(PasswordBoolean);
	}

}
