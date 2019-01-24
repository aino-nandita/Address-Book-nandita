package hibernatetest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hibernate.AddressSlim;
import hibernate.HBAddressStoreImpl;

public class HBAddressStoreImplTest {
	
	@Test
	public void createTest() {
		HBAddressStoreImpl hbimpl=new HBAddressStoreImpl();
		AddressSlim slim=new AddressSlim();
		slim.setId(1);
		slim.setName("abcd");
		slim.setStreet("kp");
		slim.setCity("pune");
		slim.setCountry("india");
		slim.setZip(44444);
		
		int id=hbimpl.create(slim);
		assertTrue(slim.getId()==id);
	}
	
	@Test
	public void readTest() {
		HBAddressStoreImpl hbimpl=new HBAddressStoreImpl();
		AddressSlim slim=new AddressSlim();
		
		slim.setId(2);
		slim.setName("reading");
		slim.setStreet("lane");
		slim.setCity("pune");
		slim.setCountry("india");
		slim.setZip(110010);
		
		int id=hbimpl.create(slim);
		
		AddressSlim address1=hbimpl.read(id);
		
		assertTrue(slim.getId()==id);
		assertTrue(slim.getName().equals(address1.getName()));
		
	}
	
	@Test
	public void updateTest() {
		HBAddressStoreImpl hbimpl=new HBAddressStoreImpl();
		AddressSlim slim=new AddressSlim();
		
		slim.setId(111);
		slim.setName("updating");
		slim.setStreet("lane");
		slim.setCity("pune");
		slim.setCountry("india");
		slim.setZip(110010);
		
		int id=hbimpl.create(slim);
		
		slim.setName("surbhi");
		slim.setStreet("kp");
		slim.setCity("pune");
		slim.setCountry("india");
		slim.setZip(110010);
		
		hbimpl.update(slim);
		
		AddressSlim address1=hbimpl.read(id);
		
		assertTrue(slim.getId()==id);
		assertTrue(slim.getName().equals(address1.getName()));
	}
	
	@Test
	public void deleteTest() {
		HBAddressStoreImpl hbimpl=new HBAddressStoreImpl();
		AddressSlim slim=new AddressSlim();
		
		slim.setId(1);
		slim.setName("delete");
		slim.setStreet("surbhi's");
		slim.setCity("address");
		slim.setCountry("india");
		slim.setZip(110010);
		
		int id=(Integer)hbimpl.create(slim);

		hbimpl.delete(id);
		
		AddressSlim add=hbimpl.read(id);
		assertTrue(add==null);
		
		//hbaddress.delete(id);
	}
}
