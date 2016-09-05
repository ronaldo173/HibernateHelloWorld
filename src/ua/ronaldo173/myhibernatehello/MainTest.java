package ua.ronaldo173.myhibernatehello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ua.ronaldo173.myhibernatehello.entity.Country;
import ua.ronaldo173.myhibernatehello.entity.State;

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

		/**
		 * create beans.
		 */
		Country countryChina = new Country("China", 2 * 10 ^ 9);
		State statePekin = new State("Pekin", 12 * 10 ^ 6);
		State stateTyangin = new State("Tyangin", 4 * 10 ^ 6);

		countryChina.getListStates().add(statePekin);
		countryChina.getListStates().add(stateTyangin);

		session.beginTransaction();
		session.save(countryChina);
		session.getTransaction().commit();
	}

}
