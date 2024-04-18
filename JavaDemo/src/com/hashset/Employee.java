package com.hashset;

import java.util.Objects;

public class Employee {
	int eid,salary;
	String ename;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, int salary, String ename) {
		super();
		this.eid = eid;
		this.salary = salary;
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", ename=" + ename + "]";
	}
	public int hashCode() {
		return eid+ename.hashCode()%23;
	}
	@Override
	public boolean equals(Object o) {
		System.out.println("I am in equals");
		Employee e = (Employee)o;
		if (this.eid==e.eid&&this.ename.equals(e.ename))
			return true;
		else
			return false;	
//		return this.eid==e.eid&&ename.equals(e.ename);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	

}
