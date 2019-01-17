package main.java.com.addressbook;

public class MenuItem {
	int id;
	public String name;
	
	
	public MenuItem(String mi_name) {
		this.name=mi_name;
	}
	
	public int getItemId() {
		return id;
	}
	public void setItemId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return name;
	}
	public void setItemName(String name) {
		this.name = name;
	}
}
