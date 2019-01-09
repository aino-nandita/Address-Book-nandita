package main.java.com.addressbook;

import java.util.HashMap;

public class AddressCrudConsoleUtil {
	HashMap< String , Address > hm = new HashMap <>();
	
	public void create(String name) {
		hm.put(name, new Address());
	}
	
	public void read(String name) {
		hm.get(name);
	}
	
	public void update(String name) {
		hm.replace(name, new Address());
	}
	
	public void delete(String name) {
		hm.remove(name, new Address());
	}
}
