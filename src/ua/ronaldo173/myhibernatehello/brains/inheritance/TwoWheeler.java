package ua.ronaldo173.myhibernatehello.brains.inheritance;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {
	private String steeringHandle;

	/**
	 * @return the steeringHandle
	 */
	public String getSteeringHandle() {
		return steeringHandle;
	}

	/**
	 * @param steeringHandle
	 *            the steeringHandle to set
	 */
	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}

}
