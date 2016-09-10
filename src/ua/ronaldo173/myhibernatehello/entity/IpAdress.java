package ua.ronaldo173.myhibernatehello.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "IP_ADDRESSES")
public class IpAdress {

	@Id
	@GeneratedValue
	@Column(name = "ip_adress_id")
	private int id;

	@Column(name = "ip_Address")
	private String ipAddress;

	@ManyToMany(mappedBy = "ipAdressesList", fetch = FetchType.LAZY)
	List<User> list = new ArrayList<>();

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
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress
	 *            the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * 
	 */
	public IpAdress() {
	}

	/**
	 * @param ipAddress
	 */
	public IpAdress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IpAdress [id=" + id + ", ipAddress=" + ipAddress + "]";
	}

}
