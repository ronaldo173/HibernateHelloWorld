package ua.ronaldo173.myhibernatehello.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "USERS")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int id;
	private String firstName;
	private String lastName;
	private String email;

	@Fetch(FetchMode.SELECT)
	@ElementCollection(fetch = FetchType.LAZY)
	@JoinTable(name = "USER_ADRESS", joinColumns = @JoinColumn(name = "user_id"))
	private Collection<Address> addresses = new ArrayList<>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", addresses=" + addresses + ", ipAdressesList=" + ipAdressesList + "]";
	}

	/**
	 * @return the addresses
	 */
	public Collection<Address> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses
	 *            the addresses to set
	 */
	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 */
	public User(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "USERS_IP_ADDRESS")
	private List<IpAdress> ipAdressesList = new ArrayList<>();

	/**
	 * @return the ipAdressesList
	 */
	public List<IpAdress> getIpAdressesList() {
		return ipAdressesList;
	}

	/**
	 * @param ipAdressesList
	 *            the ipAdressesList to set
	 */
	public void setIpAdressesList(List<IpAdress> ipAdressesList) {
		this.ipAdressesList = ipAdressesList;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 */
	public User() {
		super();
	}

}
