package ua.ronaldo173.myhibernatehello.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "C")
public class Circle extends Shape {

	@Column(name = "Circle_radius")
	private int radius;

	public Circle() {
	}

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
