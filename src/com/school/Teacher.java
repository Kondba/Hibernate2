package com.school;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	int tid;
	String tname;
	String tage;
	String city;
    double salary;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int tid, String tname, String tage, String city, double salary) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tage = tage;
		this.city = city;
		this.salary = salary;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTage() {
		return tage;
	}
	public void setTage(String tage) {
		this.tage = tage;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", tage=" + tage + ", city=" + city + ", salary=" + salary
				+ "]";
	}
	
	

}
