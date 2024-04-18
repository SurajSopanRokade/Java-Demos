package com.collection;

import java.util.*;

public class ReverseArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		ListIterator<Integer> p = obj.listIterator();
		
		while(p.hasNext()) {
			System.out.print(p.next()+" ");
		}
		System.out.println();
		p = obj.listIterator(obj.size());
		while(p.hasPrevious()) {
			System.out.print(p.previous()+" ");
		}
	}

}
