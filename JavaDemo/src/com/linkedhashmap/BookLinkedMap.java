package com.linkedhashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BookLinkedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(12,"Titans",2300);
		Book b2 = new Book(13,"Java",4500);
		Book b3 = new Book(14,"Orbital",6700);
		Book b4 = new Book(15,"Impossible",8900);
		
		LinkedHashMap <Book, Integer> map = new LinkedHashMap<>();
		map.put(b1,12);
		map.put(b2,56);
		map.put(b3,7);
		map.put(b4,89);
		Set<Entry<Book, Integer>> set = map.entrySet();
		Iterator <Entry<Book, Integer>> itr = set.iterator();
		int max=0;
		Book bb=null;
		
		while (itr.hasNext()) {
			
			Entry<Book, Integer> ent = itr.next();
			System.out.println(ent.getKey()+" " +"\n"+"Copies = " +ent.getValue());
			int a= ent.getValue();
			if (a>max) {
				max=a;
				bb=ent.getKey();
			}
			
			
		}
		int min=max;
		Book bok=null;
		itr = set.iterator();
		while (itr.hasNext()) {
			
			Entry<Book, Integer> ent = itr.next();
			int b= ent.getValue();
			if (b<min) {
				min=b;
				bok=ent.getKey();
			}
			
		}
		System.out.println("Min = " +min +"object of = " + bok );
//		ArrayList<Integer>a1=new ArrayList<>(map.values());
//		Collections.sort(a1);
//		System.out.println(a1);
//		Book bbbb=null;
//		Set<Book> l=map.keySet();
//		Iterator <Book> itr1 = l.iterator();
//		while(itr1.hasNext()) {
//			Book bbb=itr1.next();
//			if (map.get(bbb)==a1.get(0))
//			bbbb=bbb;
//		}
//		
//		System.out.println("Max copy object " + bb + " Max copies " + max);
//		System.out.println("Min copy object " + bbbb + " Min copies " + a1.get(0));
	}

}
