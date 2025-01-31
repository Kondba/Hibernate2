package com.details;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {

	public static void main(String[] args) {

		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tr=session.beginTransaction();
		
		
		Employee emp=session.get(Employee.class, 1);
		session.delete(emp);

		tr.commit();
		System.out.println("Employee Delete Successfully........");
		
	}

}
