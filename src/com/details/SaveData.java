package com.details;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveData {
	
	public static void main(String[] args) {
		
	
	
	Configuration cfg=new Configuration();
	cfg.configure().addAnnotatedClass(Employee.class);
	
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	
	Transaction tr=session.beginTransaction();
	
	Employee emp=new Employee();
	emp.setEid(3);
	emp.setEname("Kondba");
	emp.setEaddress("Hadapasar Nagar Hapasar");
	emp.setEcontact("9373105823");
	emp.setEemail("ambhore11@gmail.com");
	
	
	session.save(emp);
	tr.commit();
	
	System.out.println("data stored in database............");


}
}