package com.treeset;

import java.util.TreeSet;

public class CompareTwoSet {
	public void compare(TreeSet<String>t,TreeSet<String>t1) {
		if (t.size()==t1.size()) {
			int count=0;
			for (String x:t) {
				for (String y:t1) {
					if (x.equals(y))
						count++;
				}
				if (count==t.size())
					System.out.println("Two sets are equal");
			}
		}
		else
			System.out.println("Two sets are not equal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t=new TreeSet<>();
		t.add("Blue");
		t.add("Red");
		t.add("Purple");
		t.add("Brown");
		t.add("White");
		t.add("Yellow");
		
		TreeSet<String> t1=new TreeSet<>();
		t1.add("Blue");
		t1.add("Red");
		t1.add("Purple");
		t1.add("Brown");
		t1.add("White");
		t1.add("Yellow");
		
		CompareTwoSet c1 = new CompareTwoSet();
		c1.compare(t,t1);
	}

}
