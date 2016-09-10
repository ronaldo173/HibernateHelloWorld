package ua.ronaldo173.myhibernatehello.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STREET")
	private String street;

	/**
	 * 
	 */
	public Address() {
		super();
	}

	/**
	 * @param country
	 * @param city
	 * @param street
	 */
	public Address(String country, String city, String street) {
		this.country = country;
		this.city = city;
		this.street = street;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", street=" + street + "]";
	}

}
