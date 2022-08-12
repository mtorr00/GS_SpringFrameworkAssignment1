package org.genspark.martintorrey;

public class Address {
	
	private String city;
	private String state;
	private String country;
	private String zipcode;
	
	
	//getters and setters---------------------------------------------
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	//-----------------------------------------------------------------
	
	//constructors-----------------------------------------------------
	public Address(String city, String state, String country, String zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}
	public Address() {
		super();
	}
	//-----------------------------------------------------------------
	
	
	//toString override------------------------------------------------
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
	}
	
}
