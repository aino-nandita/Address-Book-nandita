package main.java.com.addressbook;

public interface AddressStore {
	

	public int create(Address address);
	
	public Address read(int id);
	
	public void update(Address address);
	
	public int delete(int id);

}
