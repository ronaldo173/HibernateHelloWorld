package ua.ronaldo173.myhibernatehello.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Capitals")
public class Capital {

	@Id
	@Column(name = "capital_name")
	String capitalName;

	@Column(name = "capital_population")
	long capitalPopulation;

	/**
	 * @return the capitalName
	 */
	public String getCapitalName() {
		return capitalName;
	}

	/**
	 * @param capitalName
	 *            the capitalName to set
	 */
	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	/**
	 * @return the capitalPopulation
	 */
	public long getCapitalPopulation() {
		return capitalPopulation;
	}

	/**
	 * @param capitalPopulation
	 *            the capitalPopulation to set
	 */
	public void setCapitalPopulation(long capitalPopulation) {
		this.capitalPopulation = capitalPopulation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Capital [capitalName=" + capitalName + ", capitalPopulation=" + capitalPopulation + "]";
	}

	/**
	 * 
	 */
	public Capital() {
	}

	/**
	 * @param capitalName
	 * @param capitalPopulation
	 */
	public Capital(String capitalName, long capitalPopulation) {
		this.capitalName = capitalName;
		this.capitalPopulation = capitalPopulation;
	}

}
