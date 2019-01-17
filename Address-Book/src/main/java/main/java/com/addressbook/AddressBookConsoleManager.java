package main.java.com.addressbook;

import java.util.Scanner;
public class AddressBookConsoleManager {
	
	private static Scanner scanner;

	public static void main(String args[]) throws Exception {
		AddressCrudConsoleUtil acutil=new AddressCrudConsoleUtil();
		MenuCrudConsoleUtil mcutil=new MenuCrudConsoleUtil();
		Address address=null;
		
		Menu menu=mcutil.createMenu();
		mcutil.createMenuItem(menu);
		
		scanner = new Scanner(System.in);
		while(true) {
			menu.display();
			int choice=scanner.nextInt();
		
			switch(choice) {

				case 1: 
						address=acutil.create();
						break;
					
				case 2: System.out.println("Enter the name to display the details:");
						String name=scanner.next();
						acutil.read(name);
						break;
			
				case 3:	System.out.println("Enter entry name you want to update");
						String update_name=scanner.next();
						acutil.update(update_name,address);
						break;
			
				case 4: System.out.println("Enter the entry name you want to delete");
						String delete_name=scanner.next();
						acutil.delete(delete_name);
						break;
			
				case 5: System.exit(0);
						break;
			}	
		} 
	}
}
