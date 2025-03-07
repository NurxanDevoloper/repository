package AdditionalLessonException;

public class Main {

	public static void main(String[] args) {
		int age = 19;

		RegistrationService service = new RegistrationService();
		try {
			service.UsersForRegistration(age);
		} catch (AgeRestrictionException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
