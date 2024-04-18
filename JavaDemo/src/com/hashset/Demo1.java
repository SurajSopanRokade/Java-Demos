package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list = new ArrayList<>();
		list.add("Suraj");
		list.add("Abhishek");
		list.add("Snehal");
		list.add("Sunish");
		
		list.add("Suraj");
//		System.out.println("Before "+list);
		HashSet<String> set = new HashSet<>(list);
//		System.out.println("After "+set);
		
//		set.clear();
//		System.out.println(set);
//		
//		System.out.println(set.isEmpty());
//		set.remove("Sunish");
//		System.out.println(set);
		
//		System.out.println(set.contains("suraj"));
//		Set<String> set1=(Set<String>) set.clone();
//		System.out.println(set);
//		System.out.println(set1);
		
//		Iterator<String>itr=set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
	}

}
