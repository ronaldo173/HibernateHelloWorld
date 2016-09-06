package ua.ronaldo173.myhibernatehello.inheritancepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CIRCLE")
public class Circle extends Shape {

	@Column(name = "Circle_radius")
	int radius;

	/**
	 * 
	 */
	public Circle() {
	}

	/**
	 * @param shapeName
	 * @param radius
	 */
	public Circle(String shapeName, int radius) {
		super(shapeName);
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

}
