package com.dxc.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.dxc.beans.Student;

public class App_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration =new Configuration().configure();
		
		ServiceRegistry serviceRegistry= new ServiceRegistryBuilder()
				                             .applySettings(configuration.getProperties())
				                             .buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		
		Student s1 =new Student(1,"Harsha", "harsha@gmail.com", "9988776655");
		
		session.save(s1);
		transaction.commit();
		System.out.println("Successfully saved");
		
		session.close();
		sessionFactory.close();

	}

}
