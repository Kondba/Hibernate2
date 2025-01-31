package com.details;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
    @Id
	int eid;
	String ename;
	String eaddress;
	String econtact;
	String eemail;
	public Employee(int eid, String ename, String eaddress, String econtact, String eemail) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.econtact = econtact;
		this.eemail = eemail;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public String getEcontact() {
		return econtact;
	}
	public void setEcontact(String econtact) {
		this.econtact = econtact;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", econtact=" + econtact
				+ ", eemail=" + eemail + "]";
	}
	
	
	
	
}
