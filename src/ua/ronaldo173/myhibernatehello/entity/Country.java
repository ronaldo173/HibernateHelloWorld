package ua.ronaldo173.myhibernatehello.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Country")
public class Country {

	@Id
	@Column(name = "country_name")
	private String countryName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "country_state", joinColumns = { @JoinColumn(name = "country_name") }, inverseJoinColumns = {
			@JoinColumn(name = "state_name") })
	Collection<State> listStates = new ArrayList<>();

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
	 * @return the listStates
	 */
	public Collection<State> getListStates() {
		return listStates;
	}

	/**
	 * @param listStates
	 *            the listStates to set
	 */
	public void setListStates(Collection<State> listStates) {
		this.listStates = listStates;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", listStates=" + listStates + ", countryPopulation="
				+ countryPopulation + "]";
	}

}
