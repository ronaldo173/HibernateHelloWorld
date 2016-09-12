package ua.ronaldo173.myhibernatehello.brains.relations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		List<Wheel> wheels = new ArrayList<Wheel>() {
			private static final long serialVersionUID = 4235174980723937682L;

			{
				add(new Wheel("Left"));
				add(new Wheel("Right"));
				add(new Wheel("Back left"));
				add(new Wheel("Back right"));
			}
		};

		Configuration configuration = new Configuration();
		configuration.configure();

		try (SessionFactory factory = configuration.buildSessionFactory()) {
			Session session = factory.getCurrentSession();
			session.beginTransaction();

			// Vehicle car = new Vehicle("Car");
			// Vehicle moto = new Vehicle("Moto");
			//
			// car.getWheelsSet().addAll(wheels);
			//
			// Wheel wheel = wheels.get(0);
			// moto.getWheelsSet().add(wheel);
			// wheel.getVehicles().add(moto);
			// wheel.getVehicles().add(car);
			//
			// session.save(car);
			// session.save(moto);
			//
			// Vehicle vehicle = session.get(Vehicle.class, 1);
			// System.out.println(vehicle);

			List<Vehicle> list = session.createCriteria(Vehicle.class).list();
			for (Vehicle vehicle : list) {
				System.out.println(vehicle);
			}
			session.getTransaction().commit();
		}
	}

}
