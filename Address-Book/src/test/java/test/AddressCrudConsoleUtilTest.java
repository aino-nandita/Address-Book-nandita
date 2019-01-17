package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.com.addressbook.Address;
import main.java.com.addressbook.AddressCrudConsoleUtil;

public class AddressCrudConsoleUtilTest {
	AddressCrudConsoleUtil acutil=null;
	public static Address addobj;
	
	@Before
	public void before() {
		acutil=new AddressCrudConsoleUtil();
	}
	
	/*@Test
	public void createTest(){
		addobj=acutil.create();
		assertTrue(acutil.hashmapobj.get(addobj.name).name.equals("nandita"));
		assertTrue(acutil.hashmapobj.get(addobj.name).street.equals("laneD"));
		assertTrue(acutil.hashmapobj.get(addobj.name).city.equals("pune"));
		assertTrue(acutil.hashmapobj.get(addobj.name).country.equals("india"));
		assertTrue(acutil.hashmapobj.get(addobj.name).zip==411001);
	}
	
	@Test
	public void updateTest(){
		
		Address addobj=acutil.create();
		acutil.update(addobj.name);
		
		assertTrue(acutil.hashmapobj.get(addobj.name).name.equals("nandita"));
		assertTrue(acutil.hashmapobj.get(addobj.name).street.equals("laneB"));
		assertTrue(acutil.hashmapobj.get(addobj.name).city.equals("bangalore"));
		assertTrue(acutil.hashmapobj.get(addobj.name).country.equals("india"));
		assertTrue(acutil.hashmapobj.get(addobj.name).zip==123456);
	}
	
	@Test
	public void deleteTest(){
		Address addobj=acutil.create();
		acutil.delete(addobj.name);
		assertFalse(acutil.hashmapobj.containsKey("nandita"));
	}
	*/
	@After
	public void after() {
		acutil=null;
	}
	
}
