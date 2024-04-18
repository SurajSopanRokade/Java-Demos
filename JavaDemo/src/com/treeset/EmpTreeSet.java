package com.treeset;

import java.util.TreeSet;

public class EmpTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Ram");
		Employee e2=new Employee(2,"Ravan");
		Employee e3=new Employee(5,"Amit");
		Employee e4=new Employee(4,"Pavan");
		Employee e5=new Employee(3,"Satish");
		Employee e6=new Employee(5,"Satish S");
		
		TreeSet<Employee> tset = new TreeSet<>();
		tset.add(e1);
		tset.add(e2);
		tset.add(e3);
		tset.add(e4);
		tset.add(e5);
		tset.add(e6);
		
//		for (Employee e : tset) {
//			System.out.println(e);
//		}
		Employee e61=new Employee(1,"Ram");
		tset.add(e61);
		for(Employee x:tset)
			System.out.println(x);
	}

}
