package ua.ronaldo173.myhibernatehello.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UsersTestMain {

	public static void main(String[] args) {

		/*
		 * User user1 = new User("Alexandr", "Efimov", "secret@mail.ru"); User
		 * user2 = new User("Pamela", "Anderson", "pamela@inbox.ru"); IpAdress
		 * ipAdress = new IpAdress("first->192.168.0.1"); IpAdress ipAdress2 =
		 * new IpAdress("second->0.0.0.");
		 * 
		 * user1.getIpAdressesList().add(ipAdress2);
		 * user1.getIpAdressesList().add(ipAdress);
		 * user2.getIpAdressesList().add(ipAdress);
		 * 
		 * Address address = new Address(); address.setCity("Kharkov");
		 * address.setCountry("Ukraine"); address.setStreet("Mrshala Gukova");
		 * 
		 * Address workAddress = new Address("England", "London", "Baker street"
		 * );
		 * 
		 * user1.getAddresses().add(workAddress);
		 * user1.getAddresses().add(address);
		 */

		Configuration configuration = new Configuration();
		configuration.configure();

		try (SessionFactory factory = configuration.buildSessionFactory();) {

			Session session = factory.openSession();
			User user = session.get(User.class, 1);
			System.out.println(user);

		}
	}

	private static void saveToDb(Session session, Object... objects) {
		session.beginTransaction();
		for (Object object : objects) {
			session.save(object);
		}
	}
}
