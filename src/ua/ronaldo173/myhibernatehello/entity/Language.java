package ua.ronaldo173.myhibernatehello.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LANGUAGE")
public class Language {
	@Id
	@GeneratedValue
	@Column(name = "Language_id")
	private int languageId;

	@Column(name = "Language_name")
	private String languageName;

	private List<Country> countries = new ArrayList<>();

	/**
	 * 
	 */
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param languageName
	 */
	public Language(String languageName) {
		this.languageName = languageName;
	}

	/**
	 * @return the languageId
	 */
	public int getLanguageId() {
		return languageId;
	}

	/**
	 * @param languageId
	 *            the languageId to set
	 */
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	/**
	 * @return the languageName
	 */
	public String getLanguageName() {
		return languageName;
	}

	/**
	 * @param languageName
	 *            the languageName to set
	 */
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	/**
	 * @return the countries
	 */
	public List<Country> getCountries() {
		return countries;
	}

	/**
	 * @param countries
	 *            the countries to set
	 */
	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

}
