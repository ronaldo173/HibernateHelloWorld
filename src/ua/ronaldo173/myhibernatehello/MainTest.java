package ua.ronaldo173.myhibernatehello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ua.ronaldo173.myhibernatehello.entity.Country;
import ua.ronaldo173.myhibernatehello.entity.Language;

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
		Country countryChina = new Country("China");

		Language englLang = new Language("english");
		englLang.getCountries().add(countryChina);
		Language mandarinLang = new Language("mandarin");
		mandarinLang.getCountries().add(countryChina);

		countryChina.getListLanguages().add(englLang);
		countryChina.getListLanguages().add(mandarinLang);

		session.beginTransaction();
		session.save(countryChina);
		session.getTransaction().commit();
	}

}
