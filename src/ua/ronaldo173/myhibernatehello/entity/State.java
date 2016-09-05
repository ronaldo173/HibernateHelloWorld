package ua.ronaldo173.myhibernatehello.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "State")
public class State {

	@Id
	@Column(name = "state_name")
	private String stateName;

	@Column(name = "state_population")
	long statePopulation;

	/**
	 * 
	 */
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param stateName
	 * @param statePopulation
	 */
	public State(String stateName, long statePopulation) {
		this.stateName = stateName;
		this.statePopulation = statePopulation;
	}

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName
	 *            the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the statePopulation
	 */
	public long getStatePopulation() {
		return statePopulation;
	}

	/**
	 * @param statePopulation
	 *            the statePopulation to set
	 */
	public void setStatePopulation(long statePopulation) {
		this.statePopulation = statePopulation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", statePopulation=" + statePopulation + "]";
	}

}
