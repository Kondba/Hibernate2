package com.suraj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Student stu=new Student();
		
		stu.setSid(4);
		stu.setSname("Ankush");
		session.save(stu);
		tr.commit();
		session.close();
		
		System.out.println("Data Stored successfully.....");
		
	}
}
