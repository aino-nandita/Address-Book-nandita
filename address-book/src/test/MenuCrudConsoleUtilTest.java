package test;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.com.addressbook.Menu;
import main.java.com.addressbook.MenuCrudConsoleUtil;
import main.java.com.addressbook.MenuItem;

public class MenuCrudConsoleUtilTest {
	
	static MenuCrudConsoleUtil mcutil=null;
	
	//@Mock
	
	
	@Before
	public void before() {
		mcutil= new MenuCrudConsoleUtil();
	}
	
	@Test
	public void createMenuTest() {
		Menu menu=mcutil.createMenu();
		assertNotNull(menu);
	}
	
	@Test
	public void createMenuItemTest() {
		Menu m=new Menu("Residential Address");
		//MenuItem mi=mcutil.createMenuItem(m);
		//assertNotNull(mi);
	}
	
	@After
	public void after() {
		mcutil=null;
	}
}
