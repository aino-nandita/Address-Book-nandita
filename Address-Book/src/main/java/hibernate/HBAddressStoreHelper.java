package hibernate;

import main.java.com.addressbook.Address;

public class HBAddressStoreHelper {
	HBAddressDao hbdao=new HBAddressDao();
	
	
	public void saveAddress(AddressSlim slimaddress) {
		HBAddressStoreHelper hbhelper=new HBAddressStoreHelper();
		Address add=hbhelper.convertSlimToPojo(slimaddress);
		hbdao.create(add);
	}
	
	public AddressSlim readAddress(int id) {
		HBAddressStoreHelper hbhelper=new HBAddressStoreHelper();
		Address address=hbdao.read(id);
		AddressSlim slimaddress=hbhelper.convertPojoToSlim(address);
		return slimaddress;
	}
	
	public void updateAddress(AddressSlim slimaddress) {
		HBAddressStoreHelper hbhelper=new HBAddressStoreHelper();
		Address add=hbhelper.convertSlimToPojo(slimaddress);
		hbdao.update(add);
	}
	
	public int deleteAddress(int id) {
		return hbdao.delete(id);
	}
	
	public Address convertSlimToPojo(AddressSlim slim) {
		Address pojo=new Address();
		pojo.setId(slim.getId());
		pojo.setName(slim.getName());
		pojo.setStreet(slim.getStreet());
		pojo.setCity(slim.getCity());
		pojo.setCountry(slim.getCountry());
		pojo.setZip(slim.getZip());
		return pojo;
	}
	
	public AddressSlim convertPojoToSlim(Address address) {
		AddressSlim slim=new AddressSlim();
		slim.setId(address.getId());
		slim.setName(address.getName());
		slim.setStreet(address.getStreet());
		slim.setCity(address.getCity());
		slim.setCountry(address.getCountry());
		slim.setZip(address.getZip());
		return slim;
	}
}
