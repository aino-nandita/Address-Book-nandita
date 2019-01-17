package main.java.com.addressbook;

import java.sql.*;

public class MySQLAddressStore implements AddressStore{
	 Connection connect=null;
	 java.sql.Statement statement;
	 ResultSet result;
	 
	public MySQLAddressStore() {
		
	try {
		
		
		
		Class.forName("com.mysql.jdbc.Driver"); // To load the mySQL driver
		
		System.out.println("Trying to connect to database....");
		connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/address_book","root","root");     
		System.out.println("Connection established successfully!!!!");
	}
	catch(Exception e) {
		 System.out.println("Unable to connect to mySQL database!");
		 System.out.println(e.getMessage());
	} 
}

	public int create(String name, Address address) {
		try {
			statement=connect.createStatement();
			
			statement.executeUpdate("Insert into Addition values('"+address.getId() + "','" +address.getName()+ "','"+ address.getStreet()+"','"+ address.getCity()+"','"+ address.getCountry()+"','"+ address.getZip()+"')");	
			System.out.println("Data inserted!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return address.id;
	}

	public Address read(String name) {
		Address address=new Address();
		try {
			statement=connect.createStatement();
			result=statement.executeQuery("SELECT * from Addition where name='"+ name+"'");
			address.name=name;
			
			if(result.next()) {
				address.street=result.getString("street");
				address.city=result.getString("city");
				address.country=result.getString("country");
				address.zip=result.getInt("zip");
			}
			System.out.println("Reading Data!");
			return address;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void update(String name, Address address) {
		try {
			statement=connect.createStatement();
			statement.executeUpdate("Update Addition set street='"+ address.street+"', City='"+ address.city+"', Country='"+ address.country+"', Zip='"+ address.zip+"' where name='"+ name +"' ");	
			System.out.println("Data Updated!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public int delete(String name) {
		int id=0;
		try {
			statement=connect.createStatement();
			id=statement.executeUpdate("delete from Addition where name='"+ name +"' ");	
			System.out.println("Data Deleted!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return id;
	}
		
}