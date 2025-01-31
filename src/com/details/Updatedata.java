package com.details;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Updatedata {

	public static void main(String[] args) {
		
	Configuration cfg=new Configuration();
	cfg.configure().addAnnotatedClass(Employee.class);
	
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	
	Transaction tr=session.beginTransaction();
	
	//Employee emp=new Employee();
	Employee emp=session.get(Employee.class, 1);
	emp.setEaddress("Radhakrishna Nagar Bhosari");
	emp.setEcontact("8806280312");
	
	session.update(emp);
	tr.commit();
	System.out.println("data updated Successfully........");
	

	}

}
