package com.treeset;

import java.util.Comparator;

public class Employee implements Comparable<Employee> 
	{
	int empid;
	String name;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		Integer a = this.empid;
		Integer b = o.empid;
		
		return a.compareTo(b);
	}
//	public class CompEmp implements Comparator<Employee>{
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			// TODO Auto-generated method stub
//			Integer a = o1.empid;
//			Integer b = o2.empid;
//			return a.compareTo(b);
//		}
//	}
}
