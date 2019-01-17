package main.java.com.addressbook;

import java.util.HashMap;

public class MapAddressStore implements AddressStore {

	public HashMap<String,Address> hashmapobj = new HashMap <String,Address>();
	
	public int create(String name, Address address) {
		hashmapobj.put(name,address);
		return 0;
	}
	
	public Address read(String name) {
		// TODO Auto-generated method stub
		return hashmapobj.get(name);
	}

	public void update(String name, Address address) {
		// TODO Auto-generated method stub
		hashmapobj.replace(name, address);
	}

	public int  delete(String name) {
		// TODO Auto-generated method stub
		hashmapobj.remove(name);
		return 0;
	}
}
