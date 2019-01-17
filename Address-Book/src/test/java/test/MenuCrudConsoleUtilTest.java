package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.com.addressbook.Menu;
import main.java.com.addressbook.MenuCrudConsoleUtil;

public class MenuCrudConsoleUtilTest {
	
	static MenuCrudConsoleUtil mcutil=null;
	Menu menu;

	@Before
	public void before() {
		mcutil= new MenuCrudConsoleUtil();
	}
	
	@Test
	public void createMenuTest() {
		Logger logger=Logger.getLogger("my logger: ");
		logger.info("Enter the menu: ");
		Menu menu=mcutil.createMenu();
		assertNotNull(menu);
	}
	
	@Test
	public void createMenuItemTest() {
	menu=mcutil.createMenu();
	mcutil.createMenuItem(menu);
	assertTrue(menu.menuitemlist.get(0).name.equals("create"));
	}
	
	@After
	public void after() {
		mcutil=null;
	}
}
