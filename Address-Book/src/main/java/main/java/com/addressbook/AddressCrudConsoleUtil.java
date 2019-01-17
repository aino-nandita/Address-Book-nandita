package main.java.com.addressbook;

import java.util.Scanner;

public class AddressCrudConsoleUtil {
	AddressStore store=new MapAddressStore();
	Scanner scanner=new Scanner(System.in);
	MySQLAddressStore sql=new MySQLAddressStore();
	
		public Address create() {
			Address add=new Address();
			System.out.println("******* Enter your details to create Address *******");
			System.out.println("1) Id: ");
			int id=scanner.nextInt();
			System.out.println("2) Name : ");
			String name=scanner.next();
			System.out.println("3) Street: ");
			String street=scanner.next();
			System.out.println("4) City: ");
			String city=scanner.next();
			System.out.println("5) Country: ");
			String country=scanner.next();
			System.out.println("6) Zip: ");
			int zip=scanner.nextInt();
			
			add.setId(id);
			add.setName(name);
			add.setStreet(street);
			add.setCity(city);
			add.setCountry(country);
			add.setZip(zip);
			
			store.create(name, add);
			sql.create(name, add);
			return add;
		}
	
		public void read(String name) {
			System.out.println("Reading the details : ");
			Address add1=store.read(name);
			
			System.out.println("Name:" + add1.getName());
			System.out.println("Street:" + add1.getStreet());
			System.out.println("City:" + add1.getCity());
			System.out.println("Country:" + add1.getCountry());
			System.out.println("Zip:" + add1.getZip());
			
			
			Address add2=sql.read(name);
			
			System.out.println("Name:" + add1.getName());
			System.out.println("Street:" + add1.getStreet());
			System.out.println("City:" + add1.getCity());
			System.out.println("Country:" + add1.getCountry());
			System.out.println("Zip:" + add1.getZip());
			
		}
	
		public void update(String name, Address address) {
			
			Address updateadd=store.read(name);
			
			System.out.println("******* Enter your details to update Address *******");
	
			System.out.println("2) Name : ");
			String name1=scanner.next();
			System.out.println("3) Street: ");
			String street1=scanner.next();
			System.out.println("4) City: ");
			String city1=scanner.next();
			System.out.println("5) Country: ");
			String country1=scanner.next();
			System.out.println("6) Zip: ");
			int zip1=scanner.nextInt();
			
			updateadd.setName(name1);
			updateadd.setStreet(street1);
			updateadd.setCity(city1);
			updateadd.setCountry(country1);
			updateadd.setZip(zip1);
			
			store.update(name1, updateadd);
			sql.update(name1, address);
			System.out.println("Address Updated! ");
		}
	
		public void delete(String name) {
			
			store.delete(name);
			sql.delete(name);
			System.out.println("******* Delete Address *******");
			System.out.println("Details Removed for" + name);
		}
}
