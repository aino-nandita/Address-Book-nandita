package main.java.com.addressbook;

import java.util.HashMap;
import java.util.Scanner;

import main.java.com.addressbook.Address;

public class AddressCrudConsoleUtil {
	public HashMap< String , Address> hashmapobj = new HashMap <>();
	Scanner scanner=new Scanner(System.in);

		public Address create() {
			Address add=new Address();
			
			System.out.println("Enter your Address id: ");
			int addid=scanner.nextInt();
			System.out.println("Enter your Address name : ");
			String addname=scanner.next();
			System.out.println("Enter your Address street: ");
			String addstreet=scanner.next();
			System.out.println("Enter your Address city: ");
			String addcity=scanner.next();
			System.out.println("Enter your Address country: ");
			String addcountry=scanner.next();
			System.out.println("Enter your Address zip: ");
			int addzip=scanner.nextInt();
			
			add.setId(addid);
			add.setName(addname);
			add.setStreet(addstreet);
			add.setCity(addcity);
			add.setCountry(addcountry);
			add.setZip(addzip);
			
			return hashmapobj.put(addname, add);
		}
	
		public void read(String name, Address read_address) {
		
			System.out.println("Reading details and displaying");
			
			read_address=hashmapobj.get(name);
			
			System.out.println("Name:" + read_address.getName());
			System.out.println("Street:" + read_address.getStreet());
			System.out.println("City:" + read_address.getCity());
			System.out.println("Country:" + read_address.getCountry());
			System.out.println("Zip:" + read_address.getZip());
		}
	
		public void update(String name) {
			Address updateadd=hashmapobj.get(name);
			
			System.out.println("Enter your Address id: ");
			int addid=scanner.nextInt();
			System.out.println("Enter your Address name : ");
			String addname=scanner.next();
			System.out.println("Enter your Address street: ");
			String addstreet=scanner.next();
			System.out.println("Enter your Address city: ");
			String addcity=scanner.next();
			System.out.println("Enter your Address country: ");
			String addcountry=scanner.next();
			System.out.println("Enter your Address zip: ");
			int addzip=scanner.nextInt();
			
			updateadd.setId(addid);
			updateadd.setName(addname);
			updateadd.setStreet(addstreet);
			updateadd.setCity(addcity);
			updateadd.setCountry(addcountry);
			updateadd.setZip(addzip);
			
			hashmapobj.replace(name, updateadd);
			
			System.out.println("Address Updated! ");
		}
	
		public void delete(String name) {
			hashmapobj.remove(name);
			System.out.println("Details Removed for" + name);
		}
}
