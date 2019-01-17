package main.java.com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu{
	public ArrayList<MenuItem> menuitemlist=new ArrayList<MenuItem>();
	
	Scanner s=new Scanner(System.in);
	
	int id;
	String name;
	
	public Menu(String menu_name) {
		// TODO Auto-generated constructor stub
		this.name=menu_name;
	}

	public Menu() {
		// TODO Auto-generated constructor stub
		return;
	}

	public void addMenuItem(MenuItem mi) {
		menuitemlist.add(mi);
	}
	
	public int getMenuId() {
		return id;
	}

	public void setMenuId(int id) {
		this.id = id;
	}

	public String getMenuName() {
		return name;
	}

	public void setMenuName(String name) {
		this.name = name;
	}
	
	public void display() 
	{		int count=1;
			System.out.println("Enter your choice: ");
			for(MenuItem miobj: menuitemlist) {
				System.out.println(count + ":"+ miobj.name);
				count++;
			}
	}
}
