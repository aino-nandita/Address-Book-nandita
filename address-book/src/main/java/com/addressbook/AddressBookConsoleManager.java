package main.java.com.addressbook;

import java.util.Scanner;
public class AddressBookConsoleManager {
	
	public static void main(String args[]) {
		
		AddressCrudConsoleUtil acutil=new AddressCrudConsoleUtil();
		MenuCrudConsoleUtil mcutil=new MenuCrudConsoleUtil();
		Address address=null;
		
		Menu menu=mcutil.createMenu();
		mcutil.createMenuItem(menu);
		
		Scanner s=new Scanner(System.in);
		while(true) {
			menu.display();
			int choice=s.nextInt();
		
			switch(choice) {

				case 1: address=acutil.createAddress();
						break;
					
				case 2: System.out.println("Enter the name to display the details:");
						String name=s.next();
						acutil.read(name, address);
						break;
			
				case 3:	System.out.println("Enter entry name you want to update");
						String update_name=s.next();
						acutil.update(update_name);
						break;
			
				case 4: System.out.println("Enter the entry name you want to delete");
						String delete_name=s.next();
						acutil.delete(delete_name);
						break;
			
				case 5: System.exit(0);
						break;
			}	
		} 
	}
}
