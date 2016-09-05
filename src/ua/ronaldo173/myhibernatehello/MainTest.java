package ua.ronaldo173.myhibernatehello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ua.ronaldo173.myhibernatehello.entity.Capital;
import ua.ronaldo173.myhibernatehello.entity.Country;

/**
 * Here i run application and see what will happen(:)) with hibernate.
 * 
 * @author Alexandr Efimov
 *
 */
public class MainTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();

		Session session;
		session = factory.getCurrentSession();

		Country ukraineCountry = new Country("Ukraine", 50000000);
		Capital ukrCapital = new Capital("Kiev", 3000000);
		ukraineCountry.setCapital(ukrCapital);

		session.beginTransaction();
		session.save(ukraineCountry);
		session.save(ukrCapital);

		session.getTransaction().commit();
	}

}
