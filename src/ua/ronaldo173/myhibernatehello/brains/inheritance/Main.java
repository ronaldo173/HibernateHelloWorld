package ua.ronaldo173.myhibernatehello.brains.inheritance;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");

		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringHandle("Bike steering hundle");

		FourWheeler car = new FourWheeler();
		car.setVehicleName("Porsche");
		car.setSteeringWheel("Porsche Steering Wheel");

		Configuration configuration = new Configuration();
		configuration.configure();
		try (SessionFactory factory = configuration.buildSessionFactory()) {
			Session session = factory.getCurrentSession();

			session.beginTransaction();
			session.save(vehicle);
			session.save(bike);
			session.save(car);

			List<Vehicle> list = session.createCriteria(Vehicle.class).list();
			for (Vehicle vehicle2 : list) {
				System.out.println(vehicle2);
			}
			session.getTransaction().commit();

		}
	}
}
