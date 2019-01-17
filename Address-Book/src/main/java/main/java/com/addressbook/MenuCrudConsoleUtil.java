package main.java.com.addressbook;

import java.util.Scanner;

public class MenuCrudConsoleUtil {
	
	Scanner s=new Scanner(System.in);
	
	public Menu createMenu() {
		System.out.println("Enter some name you want to give to your Address Menu:");
		String menu_name=s.next();
		Menu m=new Menu(menu_name);
		m.setMenuName(menu_name);
		return m;
	}
	
	public void createMenuItem(Menu m) {
		String mi_name=null;
		System.out.println("Enter your menu contents:");
		mi_name=s.next();
		
		while(!(mi_name.equals("false"))) {
			MenuItem mi=new MenuItem(mi_name);
			mi.setItemName(mi_name);
			m.addMenuItem(mi);
			mi_name=s.next();
		}
	}
}
