package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.com.addressbook.Address;
import main.java.com.addressbook.MySQLAddressStore;

public class MySQLStoreTest {
	public static MySQLAddressStore sql;
	public Address address;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sql=new MySQLAddressStore();
		
	}

	@Test
	public void testCreate() {
		address=new Address();
			address.id=1;
			address.name="nandita";
			address.street="lane";
			address.city="pune";
			address.country="india";
			address.zip=110010;
			
			int id=sql.create(address.name, address);
			assertTrue(id==1);
	}
	
	@Test
	public void testRead() {
		Address address=new Address();
		
		address.id=1;
		address.name="nandita";
		address.street="lane";
		address.city="pune";
		address.country="india";
		address.zip=110010;
		
		//sql.create(address.name, address);
		
		Address add1=new Address();
		add1=sql.read(address.name);
		
		assertTrue(address.name.equals(add1.name));
		assertTrue(address.street.equals(add1.street));
		assertTrue(address.city.equals(add1.city));
		assertTrue(address.country.equals(add1.country));
		assertTrue(address.zip==add1.zip);
	}
	
	@Test
	public void testUpdate() {
		Address address=new Address();
		
		address.id=1;
		address.name="nandita";
		address.street="lane";
		address.city="pune";
		address.country="india";
		address.zip=110010;
		
		sql.create(address.name, address);
		address.id=101;
		address.name="nandita";
		address.street="wallstreet";
		address.city="bangalore";
		address.country="india";
		address.zip=411000;
		
		
		sql.update(address.name, address);
		
		
		
		assertTrue(address.name.equals("nandita"));
		assertTrue(address.street.equals("wallstreet"));
		assertTrue(address.city.equals("bangalore"));
		assertTrue(address.country.equals("india"));
		assertTrue(address.zip==411000);
	}

	@Test
	public void testDelete() {
		Address address=new Address();
		
		address.id=101;
		address.name="sur";
		address.street="lane";
		address.city="pune";
		address.country="india";
		address.zip=110010;
		
		sql.create(address.name, address);
		int id=sql.delete(address.name);
		
		//assertNull(address.name.equals("rajat"));
		assertTrue(id==1); //1 as in true
	}
	
	/*@After
	public void after() {
		sql=null;
	}*/
}
