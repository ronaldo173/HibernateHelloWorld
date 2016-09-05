package ua.ronaldo173.myhibernatehello.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country {

	@Id
	@GeneratedValue
	@Column(name = "Country_id")
	private int countryId;

	@Column(name = "Country_name")
	private String countryName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "COUNTRY_LANGUAGE", joinColumns = { @JoinColumn(name = "Country_id") }, inverseJoinColumns = {
			@JoinColumn(name = "Language_id") })
	List<Language> listLanguages = new ArrayList<>();

	/**
	 * 
	 */
	public Country() {
		super();
	}

	/**
	 * @param countryName
	 */
	public Country(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the countryId
	 */
	public int getCountryId() {
		return countryId;
	}

	/**
	 * @param countryId
	 *            the countryId to set
	 */
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

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
	 * @return the listLanguages
	 */
	public List<Language> getListLanguages() {
		return listLanguages;
	}

	/**
	 * @param listLanguages
	 *            the listLanguages to set
	 */
	public void setListLanguages(List<Language> listLanguages) {
		this.listLanguages = listLanguages;
	}

}