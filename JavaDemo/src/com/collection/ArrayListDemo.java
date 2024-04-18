package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>obj = new ArrayList<>();
		obj.add(12);
		obj.add(4);
		obj.add(6);
		obj.add(7);
		obj.add(34);
		Integer[] arr3=(Integer[]) obj.toArray();
		int sum=0;
		for (int i=0; i<obj.size(); i++) {
			System.out.print(obj.get(i)+" ");
			sum=sum+obj.get(i);	
		}
		
		System.out.println("sum = "+sum);
		System.out.println();
		sum=0;
		for (int i:obj) {
			System.out.print(i+" ");
			sum=sum+i;	
		}
		Object []arr= obj.toArray();
		System.out.println(Arrays.toString(arr));
		Integer j[]= obj.toArray(new Integer[obj.size()]);
		System.out.println("j "+Arrays.toString(j));
		System.out.println("sum = "+sum);
		sum=0;
		Iterator<Integer>itr= obj.iterator();
		while(itr.hasNext()) {
			//System.out.print(itr.next()+" ");
			sum=sum+itr.next();
		}
		
		System.out.println("sum = "+sum);
		List<Integer> p =  Arrays.asList(2,3,4,5,6,7);
		System.out.println(p);
		ArrayList<Integer> obj9 = new ArrayList<>(Arrays.asList(2,3,4,5,6,7));
		Object []arr1=p.toArray();
		Object []arr7=obj9.toArray();
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr7));
	}

}
