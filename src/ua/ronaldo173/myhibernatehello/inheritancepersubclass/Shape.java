package ua.ronaldo173.myhibernatehello.inheritancepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "SHAPE")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Shape {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "Shape_id")
	private int shapeId;

	@Column(name = "Shape_name")
	private String shapeName;

	/**
	 * @param shapeName
	 */
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}

	/**
	 * 
	 */
	public Shape() {
	}

}
