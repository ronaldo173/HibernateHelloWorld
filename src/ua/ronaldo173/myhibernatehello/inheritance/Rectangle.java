package ua.ronaldo173.myhibernatehello.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "R")
public class Rectangle extends Shape {

	@Column(name = "Rectangle_length")
	private int length;
	@Column(name = "Rectangle_breadth")
	private int breadth;

	/**
	 * 
	 */
	public Rectangle() {
		super();
	}

	/**
	 * @param length
	 * @param breadth
	 */
	public Rectangle(String shapeName, int length, int breadth) {
		super(shapeName);
		this.length = length;
		this.breadth = breadth;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the breadth
	 */
	public int getBreadth() {
		return breadth;
	}

	/**
	 * @param breadth
	 *            the breadth to set
	 */
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
