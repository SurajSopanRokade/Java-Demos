package com.linklistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/*Methods Available
 * 
 * 1. addFirst()
 * 2. addLast()
 * 3. removeFirst()
 * 4. removeLast()
 * 5. getFirst()
 * 6. getLast()
 * 7. descending iterator
*/

public class DemoLink  {
	/*
	  ArrayList<Student> a1 = new ArrayList<>();
		a1.add(new Student(1,"Suraj", 78));
		a1.add(new Student(2,"Raj", 88));
		a1.add(new Student(3,"Ura", 98));
	*/  
	  
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a1 = new ArrayList<>();
		a1.add(new Student(1,"Suraj", 78));
		a1.add(new Student(2,"Raj", 88));
		a1.add(new Student(3,"Ura", 98));
		
		//System.out.println("*****"+a1.get(1));
		
		//same method will work with Linked list
	    //difference internally uses doubly linked list as data structure
		
//		LinkedList<Student> l1 = new LinkedList<Student>();
//		l1.add(new Student(1,"Pushkar", 76));
//		l1.add(new Student(2,"Ajay", 66));
//		l1.add(new Student(3,"Ram", 96));
//		
//		//System.out.println(l1.get(2));
//		l1.set(0, new Student(1,"Suraj", 90));
		
		//System.out.println(l1);
		
//		Collections.sort(l1);
//		
//		LinkedList<String> str = new LinkedList<>();
//		str.add("Suraj");
//		str.add("Abhishek");
//		str.add("Sunish");
//		str.add("Snehal");
//		
//		str.addFirst("Sumit");
//		
//		for (String i:str)
//			System.out.print(i+" ");
//		str.addLast("Sopan");
//		for (String i:str)
//			System.out.print(i+" ");
//		str.removeFirst();
//		System.out.println(str);
//		
//		str.removeLast();
//		System.out.println(str);
		
//		Collections.sort(str);
//		System.out.println(str);
		
//		LinkedList<String> languages = new LinkedList<>();
//
//	    // add elements in the linked list
//	    languages.add("Python");
//	    languages.add("Java");
//	    languages.add("JavaScript");
//	    System.out.println("LinkedList: " + languages);
//	    
//	    String str1=languages.get(0);
//	    System.out.println(str1);
		
	}

	
	

}
