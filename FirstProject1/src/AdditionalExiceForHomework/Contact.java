package AdditionalExiceForHomework;

public class Contact {
	String firstName;
	String lastName;
	private String email;
	private String number;

	public Contact(String firstName, String lastName, String email, String number) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.number = number;
	}

	@Override
	public String toString() {
		return "PhoneDirectoryClass [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", number=" + number + "]";
	}
}