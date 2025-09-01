package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App { 
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		person p1 = new person(7, "joel", "TENALI", "12345678901");
		person p2 = new person(37, "joni", "GUNTUR", "2345612345");
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.persist(p1);

		tx.commit();

		factory.close();
	}

}
