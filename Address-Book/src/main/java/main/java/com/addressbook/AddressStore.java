package main.java.com.addressbook;

public interface AddressStore {

	public int create(String name, Address address);
	
	public Address read(String name);
	
	public void update(String name, Address address);
	
	public int delete(String name);

	/*public Address get(String name);

	public void replace(String name1, Address updateadd);

	public void remove(String name);*/

}
