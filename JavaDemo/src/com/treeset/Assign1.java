package com.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//addAll
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(1);
		tset.add(2);
		tset.add(3);
		tset.add(4);
		
		TreeSet<Integer> tset1 = new TreeSet<>();
		tset1.add(5);
		tset1.add(6);
		tset1.add(7);
		tset1.add(8);
//		tset1.add(null);
//		tset1.add(2);
		TreeSet<Integer> tset3 = new TreeSet<>();
		for (int i:tset) {
			tset.add(i);
		}
		tset.addAll(tset1);
		System.out.println(tset);
		System.out.println("tset : "+tset);
// First and Last elements
		System.out.println(tset.first());
		System.out.println(tset.last());
		
//Greater or equal element
		System.out.println(tset.ceiling(5));
		
//Higher than 
		System.out.println(tset.higher(6));
//Iterate
		Iterator <Integer> itr = tset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//lower than
		System.out.println(tset.floor(3));
//count
		int count=0;
		for (int i:tset) {
			System.out.println(i+" ");
			count++;
		}
		System.out.println("Count : "+ count);
//remove
		tset.remove(7);
		System.out.println(tset);
		TreeSet<String> t=new TreeSet<>();
		t.add("Blue");
		t.add("Red");
		t.add("Purple");
		t.add("Brown");
		t.add("White");
		t.add("Yellow");
//		//1 way
//		System.out.println("the remove first element : "+t.pollFirst());
//		
//		for(String x:t)
//			System.out.print(x+" ");
//		System.out.println();
//		//2 way
//		System.out.println("Remove first element : "+t.remove(t.first()));
//		for(String x:t)
//			System.out.print(x+" ");
//		System.out.println();
//		//3 way
//		Iterator<String> i=t.iterator();
//		String y=t.first();
//		while(i.hasNext())
//		{
//			String x=i.next();
//			if(y.equals(x))
//			{
//				i.remove();
//			}
//		}
//		System.out.println("Using iterator....");
//		for(String x:t)
//			System.out.print(x+" ");
// retrives and remove last highest
//		System.out.println(t.pollLast());
//		System.out.println(t.remove(t.last()));
//
		TreeSet<String> t1=new TreeSet<>();
		t1.add("Blue");
		t1.add("Red");
		t1.add("Purple");
		t1.add("Brown");
		t1.add("White");
		t1.add("Yellow");

//		Iterator<String> i=t1.descendingIterator();
//		while(i.hasNext())
//			System.out.print(i.next()+" ");
//		
//		System.out.println(t1.higher("Purple"));
//		System.out.println(t1.lower("Purple"));
		
		
	}


}
