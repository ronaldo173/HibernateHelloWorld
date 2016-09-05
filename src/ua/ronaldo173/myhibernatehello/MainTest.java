package ua.ronaldo173.myhibernatehello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ua.ronaldo173.myhibernatehello.entity.Student;

public class MainTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();

		Student student = new Student();
		student.setName("Pendergast");
		student.setDescription("new student");
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Alina");
		student2.setDescription("old student");

		Session session;
		// = factory.openSession();
		session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(student);
		session.save(student2);

		session.getTransaction().commit();
		// session.close();
	}

}
