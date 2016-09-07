package ua.ronaldo173.myhibernatehello.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UsersTestMain {

	public static void main(String[] args) {

		User user1 = new User("Alexandr", "Efimov", "secret@mail.ru", "Kharkov..mg");
		User user2 = new User("Pamela", "Anderson", "pamela@inbox.ru", "USA");
		IpAdress ipAdress = new IpAdress("first->192.168.0.1");
		IpAdress ipAdress2 = new IpAdress("second->0.0.0.");

		user1.getIpAdressesList().add(ipAdress2);
		user1.getIpAdressesList().add(ipAdress);
		user2.getIpAdressesList().add(ipAdress);

		Configuration configuration = new Configuration();
		configuration.configure();

		try (SessionFactory factory = configuration.buildSessionFactory();) {

			Session session = factory.getCurrentSession();

			saveToDb(session, user1, user2);
			// saveToDb(session, ipAdress, ipAdress2);
			session.getTransaction().commit();

			/*
			 * session.beginTransaction(); List<User> list =
			 * session.createCriteria(User.class).list(); for (User user : list)
			 * { System.out.println(user); }
			 */

			session = factory.openSession();
			session.beginTransaction();
			User user = session.get(User.class, 40);

			System.out.println("get...");
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
