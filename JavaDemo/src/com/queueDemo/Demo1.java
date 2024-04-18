package com.queueDemo;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> qu  =  new PriorityQueue<>();
		qu.add(80);
		qu.add(9);
		qu.add(56);
		qu.add(3);
		
//		System.out.print(qu+" ");
//		
//		System.out.println("Poll remove the head of the que : " + qu.poll());
//		System.out.println(qu);
//		
//		System.out.println("remove the head of the que : " + qu.remove());
//		System.out.println(qu);
//		
//		Iterator <Integer> itr = qu.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//		}
		Integer v;
		while((v=qu.poll())!=null) {
			System.out.println(v);
		}
		//System.out.println(qu.poll());
		//System.out.println(qu.remove());
		
		
	}

}
