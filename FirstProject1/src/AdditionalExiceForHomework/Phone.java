package AdditionalExiceForHomework;

import java.util.ArrayList;

public class Phone {
	private ArrayList<Contact> contacts = new ArrayList<Contact>();

	public void addContact(String firstName, String lastName, String phoneNumber, String email) {
		contacts.add(new Contact(firstName, lastName, phoneNumber, email));
		System.out.println("*Contact was successfully added");
	}
	
	public void deleteContact(String firstName, String lastName) {
        contacts.removeIf(contact -> contact.firstName.equalsIgnoreCase(firstName) && contact.lastName.equalsIgnoreCase(lastName));
        System.out.println("**Contact was successfully deleted!**");
    }
	
	
	 public void searchContact(String name) {
	        boolean found = false;
	        for (Contact contact : contacts) {
	            if (contact.firstName.equalsIgnoreCase(name) || contact.lastName.equalsIgnoreCase(name)) {
	                System.out.println(contact);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No contact found with name: " + name);
	        }
	    }
	 
	 public void displayAllContacts() {
		 // проверяет пустой ли array потом выводит список всех контактов.
	        if (contacts.isEmpty()) {
	            System.out.println("PhoneClass is empty.");
	        } else {
	            for (Contact contact : contacts) {
	                System.out.println(contact);
	            }
	        }
	    }
	 
	 
	}