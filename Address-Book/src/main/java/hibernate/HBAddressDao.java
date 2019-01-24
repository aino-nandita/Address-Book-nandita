package hibernate;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import main.java.com.addressbook.Address;
import main.java.com.addressbook.AddressStore;

public class HBAddressDao implements AddressStore{
	
	public static Session getSession() {
		return HibernateUtil.getSessionFactory().openSession();
	}
	

	public int create(Address address){
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		Integer id=null;
		try {
			id=(Integer) session.save(address);
			transaction.commit(); 
			System.out.println("Address saved!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return id;
	}
	
	public Address read(int id) {
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		Address address=null;
		try {
			Query query=session.createQuery("from Address where id= :id");
			query.setParameter("id", id);
			Object object= ((org.hibernate.query.Query) query).uniqueResult();
			address=(Address) object;
			
			transaction.commit();
			System.out.println("Reading Address!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return address;
	}
	
	public void update(Address address) {
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		try {
			session.update(address);
			transaction.commit();
			System.out.println("Address saved!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	public  int delete(int id) {
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		int result=0;
		try {
			Query query=session.createQuery("delete Address where id= :id");
			query.setParameter("id", id);
			result=query.executeUpdate();
			
			transaction.commit();
			System.out.println("Address deleted!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return result;
	}
}
