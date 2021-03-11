package com.careerit.cj.cbook;

import java.util.List;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		ContactService service = new ContactServiceInmemoryImpl();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.Add 2. Search 3. Get by Id 4. List 5. Update Mobile 6. Delete 7. Exit");
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();

			if (ch == 1) {
				System.out.println("Enter the username :");
				String name = sc.next();
				System.out.println("Enter the mobile :");
				String mobile = sc.next();
				Contact contact = new Contact(name, mobile);
				Contact savedContact = service.addContact(contact);
				System.out.println("Contact is added with id :" + savedContact.getCid());
			} else if (ch == 4) {
				List<Contact> list = service.getContacts();
				if(list.isEmpty()) {
					System.out.println("There no contacts added yet, please add contacts");
				}else {
					System.out.println("Contact Details:");
					paintContacts(list);
				}
				
			} else if (ch == 2) {
				System.out.println("Enter the name or mobile number to search :");
				String str = sc.next();
				List<Contact> list = service.search(str);
				if(list.isEmpty()) {
					System.out.println("Search result is empty for given :"+str);
				}else {
					System.out.println("Search Result for : "+str);
					paintContacts(list);
				}
			}
			System.out.println("Do you want to continue (1) to exit (0) ");
			int choice = sc.nextInt();
			if (choice == 0) {
				System.out.println("See you ..... ");
				sc.close();
				System.exit(0);
			}
		}
	}

	private static void paintContacts(List<Contact> contacts) {

		System.out.println("----------------------------------------------");
		for (Contact contact : contacts) {
			System.out.println(contact.getCid() + "\t" + contact.getName() + "\t" + contact.getMobile());

		}
		System.out.println("----------------------------------------------");

	}
}
