package ua.ronaldo173.myhibernatehello.brains.relations;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Wheel {
	@Id
	@GeneratedValue
	private int id;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "wheelsSet")
	private Collection<Vehicle> vehicles = new HashSet<>();

	/**
	 * @return the vehicles
	 */
	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}

	/**
	 * @param vehicles
	 *            the vehicles to set
	 */
	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	private String name;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	/**
	 * @param name
	 */
	public Wheel(String name) {
		this.name = name;
	}

	/**
	 * 
	 */
	public Wheel() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Wheel [name=" + name + "]";
	}

}
