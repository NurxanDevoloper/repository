package AdditionalExiceForHomework;

import java.util.Scanner;

public class PhoneBookAPPmain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phone phone = new Phone();
		
		 while (true) {
	            System.out.println("\nPhoneBook Menu:");
	            System.out.println("1. Add Contact");
	            System.out.println("2. Delete Contact");
	            System.out.println("3. Search Contact");
	            System.out.println("4. Show All Contacts");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine();  //
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter First Name: ");
	                    String firstName = scanner.nextLine();
	                    System.out.print("Enter Last Name: ");
	                    String lastName = scanner.nextLine();
	                    System.out.print("Enter Phone Number: ");
	                    String phoneNumber = scanner.nextLine();
	                    System.out.print("Enter Email: ");
	                    String email = scanner.nextLine();
	                    phone.addContact(firstName, lastName, phoneNumber, email);
	                    break;

	                case 2:
	                    System.out.print("Enter First Name to delete: ");
	                    String delFirstName = scanner.nextLine();
	                    System.out.print("Enter Last Name to delete: ");
	                    String delLastName = scanner.nextLine();
	                    phone.deleteContact(delFirstName, delLastName);
	                    break;

	                case 3:
	                    System.out.print("Enter Name to search: ");
	                    String searchName = scanner.nextLine();
	                    phone.searchContact(searchName);
	                    break;

	                case 4:
	                    phone.displayAllContacts();
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid //! Please try again.***()");
	            }
	        }
	    }
	}
