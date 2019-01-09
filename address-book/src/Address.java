import java.io.*;
import java.util.Scanner;

public class Address {
	int id, zip;
	String name, street, city, country;
	
	public int getid() { //getter methods
		return this.id;
	}
	
	public int getzip() {
		return this.zip;
	}
	
	public String getname() {
		return this.name;
	}
	
	public String getstreet() {
		return this.street;
	}
	
	public String getcity() {
		return this.city;
	}
	
	public String getcountry() {
		return this.country;
	}
	
	public void setid(int id) { //setter methods
		this.id=id;
	}
	
	public void setzip(int zip) {
		this.zip=zip;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public void setstreet(String street) {
		this.street=street;
	}
	
	public void setcity(String city) {
		this.city=city;
	}
	
	public void setcountry(String country) {
		this.country=country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
