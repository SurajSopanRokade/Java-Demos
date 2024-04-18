package com.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>tech = new ArrayList<>();
		System.out.println(tech.size());
		tech.add("Java");
		tech.add("JHhdhdskhsiiodf");
		tech.add("dfgdzfr");
		tech.add("dzfgddfgdd");
		
		System.out.print(tech);
		System.out.println(tech.size());
		tech.add(1,"Suraj");
		System.out.print(tech);
		
		tech.remove(1);
		System.out.println(tech);
		boolean f = tech.remove("JHhdhdskhsiiodf");
		System.out.print(f);
		System.out.println(tech);
		
		ArrayList<String>l1=new ArrayList<>();
		l1.add("gfhfhfhtrgrsg");
		l1.add("sdfserds");
		l1.add("ooooopopoppo");
		
		tech.addAll(l1);
		System.out.println(tech);
		ArrayList<String>l2=new ArrayList<>();
		tech.addAll(2,l1);
		System.out.println(tech);
	}

}
