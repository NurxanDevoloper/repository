package Lesson34Homework;

public class UserService{
	public void findUser(String username) throws UserNotFoundException{
		if (!"admin".equals(username)) {
			throw new UserNotFoundException("Пользователь не найден: "  + username);
		}
	}
}