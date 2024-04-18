package com.treemap;

import java.util.TreeMap;



public class BookTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(12,"Titans",2300);
		Book b2 = new Book(13,"Java",4500);
		Book b3 = new Book(14,"Orbital",6700);
		Book b4 = new Book(15,"Impossible",8900);
		BookComp c1 = new BookComp();
		TreeMap<Book,Integer> map1 = new TreeMap<>(c1);
		map1.put(b1, 34);
		map1.put(b2, 78);
		map1.put(b3, 89);
		map1.put(b4, 45);
		
		System.out.println(map1);
		
		
	}

}
