package com.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(1,23000,"Suraj");
		Employee e2= new Employee(2,26000,"Abhi");
		Employee e3= new Employee(3,28000,"Snehal");
		Employee e4= new Employee(4,29000,"Adersh");
		Employee e5= new Employee(1,23000,"Suraj");
		
		HashSet<Employee> set = new HashSet<>();
		set.add(e1);
		System.out.println(e1.hashCode());
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		System.out.println(e5.hashCode());
		
		Iterator<Employee> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
