package hibernate;

public interface SlimAddressStore {
	
	public int create(AddressSlim slimaddress);
	
	public AddressSlim read(int id);
	
	public void update(AddressSlim slimaddress);
	
	public int delete(int id);
	
	public AddressSlim convertSlimtoPojo(AddressSlim slimaddress);
}
