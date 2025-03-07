package AdditionalLessonException;

public class RegistrationService {
	 public void UsersForRegistration(int age) throws AgeRestrictionException {
	        if (age < 18) {
	            throw new AgeRestrictionException("Ошибка в регистрации: возраст должен быть не менее 18 лет.");
	        }
	        System.out.println("Регистрация успешна!");
	    }
}
