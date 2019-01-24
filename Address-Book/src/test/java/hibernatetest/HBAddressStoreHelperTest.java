package hibernatetest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hibernate.AddressSlim;
import hibernate.HBAddressStoreHelper;
import main.java.com.addressbook.Address;

public class HBAddressStoreHelperTest {
	
	@Test
	public void SlimToPojoTest() {
		HBAddressStoreHelper hbhelper=new HBAddressStoreHelper();
		AddressSlim slimaddress=new AddressSlim();
		
		slimaddress.setId(11);
		slimaddress.setName("vinay");
		slimaddress.setStreet("nasik");
		slimaddress.setCity("pune");
		slimaddress.setCountry("india");
		
		Address add=hbhelper.convertSlimToPojo(slimaddress);
		
		assertTrue(slimaddress.getName().equals(add.getName()));
		
	}
	
	@Test
	public void pojoToSlimTest() {
		HBAddressStoreHelper hbhelper=new HBAddressStoreHelper();
		Address address=new Address();
		
		address.setId(101);
		address.setName("nandita");
		address.setStreet("kp");
		address.setCity("pune");
		address.setCountry("india");
		
		AddressSlim slimadd=hbhelper.convertPojoToSlim(address);
		
		assertTrue(address.getName().equals(slimadd.getName()));
		
	}
}
