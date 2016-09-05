package ua.ronaldo173.myhibernatehello.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Countries")
public class Country {

	@Id
	@Column(name = "country_name")
	String countryName;

	@OneToOne
	@JoinColumn(name = "capital_name")
	Capital capital;

	@Column(name = "country_population")
	long countryPopulation;

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName
	 *            the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the capital
	 */
	public Capital getCapital() {
		return capital;
	}

	/**
	 * @param capital
	 *            the capital to set
	 */
	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	/**
	 * @return the countryPopulation
	 */
	public long getCountryPopulation() {
		return countryPopulation;
	}

	/**
	 * @param countryPopulation
	 *            the countryPopulation to set
	 */
	public void setCountryPopulation(long countryPopulation) {
		this.countryPopulation = countryPopulation;
	}

	/**
	 * 
	 */
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param countryName
	 * @param countryPopulation
	 */
	public Country(String countryName, long countryPopulation) {
		this.countryName = countryName;
		this.countryPopulation = countryPopulation;
	}

}
