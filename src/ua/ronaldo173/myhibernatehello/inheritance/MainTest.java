package ua.ronaldo173.myhibernatehello.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {
		Shape shape = new Shape("Square");
		Rectangle rectangle = new Rectangle("Rectangle", 10, 20);
		Circle circle = new Circle("Circle", 4);

		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.getCurrentSession();

		session.beginTransaction();
		session.save(shape);
		session.save(rectangle);
		session.save(circle);

		session.getTransaction().commit();

	}
}
