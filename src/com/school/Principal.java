package com.school;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Principal {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Teacher.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Teacher teach=new Teacher();
		
		teach.setTid(1);
		teach.setTname("Ashish Sir");
		teach.setTage("34");
		teach.setCity("Nanded");
		teach.setSalary(20000.0);
		session.save(teach);
		tr.commit();
		session.close();
}
}