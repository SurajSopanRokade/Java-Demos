package com.stack;

import java.util.Iterator;
import java.util.Stack;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<> ();
		st.push(8);
		st.push(23);
		st.push(34);
		st.push(6);
		st.push(9);
		
//		System.out.print(st+" ");
		System.out.println(st.peek());
		Iterator <Integer> itr = st.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//		}
		while(!st.empty()) {
			System.out.print(st.pop()+" ");
		}
		System.out.print(st.isEmpty());
//		System.out.println(st.search(8));
		
	}

}
