package hibernatetest;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hibernate.HBAddressDao;
import main.java.com.addressbook.Address;

public class HBAddressDaoTest {
	
	@Test
	public void createTest() {
		HBAddressDao hbdao=new HBAddressDao();
		Address address=new Address();
		
		address.setId(4);
		address.setName("nandita");
		address.setStreet("lane");
		address.setCity("pune");
		address.setCountry("india");
		address.setZip(110010);
		
		int id=(Integer)hbdao.create(address);
		assertTrue(address.getId()==id);
	}
	
	@Test
	public void readTest() {
		HBAddressDao hbdao=new HBAddressDao();
		Address address=new Address();
		
		address.setId(1);
		address.setName("nandita");
		address.setStreet("lane");
		address.setCity("pune");
		address.setCountry("india");
		address.setZip(110010);
		
		int id=hbdao.create(address);
		
		Address address1=hbdao.read(id);
		
		assertTrue(address.getId()==id);
		assertTrue(address.getName().equals(address1.getName()));
		
	}
	
	@Test
	public void updateTest() {
		HBAddressDao hbdao=new HBAddressDao();
		Address address=new Address();
		
		address.setId(111);
		address.setName("rajat");
		address.setStreet("lane");
		address.setCity("pune");
		address.setCountry("india");
		address.setZip(110010);
		
		int id=hbdao.create(address);
		
		address.setName("surbhi");
		address.setStreet("kp");
		address.setCity("pune");
		address.setCountry("india");
		address.setZip(110010);
		
		hbdao.update(address);
		
		Address address1=hbdao.read(id);
		
		assertTrue(address.getId()==id);
		assertTrue(address.getName().equals(address1.getName()));
	}
	
	@Test
	public void deleteTest() {
		HBAddressDao hbdao=new HBAddressDao();
		Address address=new Address();
		
		address.setId(1);
		address.setName("delete");
		address.setStreet("surbhi's");
		address.setCity("address");
		address.setCountry("india");
		address.setZip(110010);
		
		int id=(Integer)hbdao.create(address);

		hbdao.delete(id);
		
		Address add=hbdao.read(id);
		assertTrue(add==null);
		
		//hbaddress.delete(id);
	}
	
}
