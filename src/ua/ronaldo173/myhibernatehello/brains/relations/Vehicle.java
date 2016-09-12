package ua.ronaldo173.myhibernatehello.brains.relations;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String vehicleName;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Wheel> wheelsSet = new HashSet<>();

	/**
	 * @param vehicleName
	 */
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	/**
	 * 
	 */
	public Vehicle() {
	}

	/**
	 * @return the wheelsSet
	 */
	public Set<Wheel> getWheelsSet() {
		return wheelsSet;
	}

	/**
	 * @param wheelsSet
	 *            the wheelsSet to set
	 */
	public void setWheelsSet(Set<Wheel> wheelsSet) {
		this.wheelsSet = wheelsSet;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the vehicleName
	 */
	public String getVehicleName() {
		return vehicleName;
	}

	/**
	 * @param vehicleName
	 *            the vehicleName to set
	 */
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicleName=" + vehicleName + ", wheelsSet=" + wheelsSet + "]";
	}

}
