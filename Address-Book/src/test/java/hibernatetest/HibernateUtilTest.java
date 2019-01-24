package hibernatetest;
import static org.junit.Assert.*;
import org.hibernate.Session;
import org.junit.Test;

import hibernate.HibernateUtil;


public class HibernateUtilTest{
	@Test
	public void getSessionTest()
	{
		Session session= HibernateUtil.getSessionFactory().openSession();
		assertNotNull(session);
	}
}