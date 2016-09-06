package ua.ronaldo173.myhibernatehello.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "SHAPE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Discriminator", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "S")
public class Shape {

	@Id
	@GeneratedValue
	@Column(name = "Shape_id")
	private int shapeId;

	@Column(name = "Shape_name")
	private String shapeName;

	public Shape() {
	}

	/**
	 * @param shapeName
	 */
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}

	/**
	 * @return the shapeId
	 */
	public int getShapeId() {
		return shapeId;
	}

	/**
	 * @param shapeId
	 *            the shapeId to set
	 */
	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}

	/**
	 * @return the shapeName
	 */
	public String getShapeName() {
		return shapeName;
	}

	/**
	 * @param shapeName
	 *            the shapeName to set
	 */
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

}
