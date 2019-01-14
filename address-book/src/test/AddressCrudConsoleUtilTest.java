package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.java.com.addressbook.Address;
import main.java.com.addressbook.AddressCrudConsoleUtil;

@RunWith(JUnit4.class)
public class AddressCrudConsoleUtilTest {
	//AddressCrudConsoleUtilTest acutiltest=new AddressCrudConsoleUtilTest();
	
	AddressCrudConsoleUtil acutil=null;
	public static Address addobj=new Address();
	
	@Before
	public void before() {
		acutil=new AddressCrudConsoleUtil();
	}
	
	@Test
	public void createTest(){
		addobj.id=101;
		addobj.name="Nandita";
		addobj.street="Lane D";
		addobj.city="Pune";
		addobj.country="India";
		addobj.zip=411001;
		
		Address name=acutil.hashmapobj.get(addobj.name);
		
	}
	
	@Test
	public void readTest(){
		
	}
	
	@Test
	public void updateTest(){
		
	}
	
	@Test
	public void deleteTest(){
		
	}
	
	@After
	public void after() {
		acutil=null;
	}
	
}
