package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class AppleCustomeObjKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<AppleDemo,Integer> appleMap=new HashMap<>();
		AppleDemo a1=new AppleDemo(150,"Smila Apple");
		System.out.println(a1.hashCode());
		appleMap.put(a1, 200);
		AppleDemo a2=new AppleDemo(300, "Washinton apple"); 
		appleMap.put(a2, 3500);
		System.out.println(a2.hashCode());
		AppleDemo a3=new AppleDemo(1, "Green Apple");
		System.out.println(a3.hashCode());
		appleMap.put(a3, 4508);
		
		
		Set<Entry<AppleDemo, Integer>> set=appleMap.entrySet();
		Iterator<Entry<AppleDemo, Integer>>  itr = set.iterator();
		{
			Entry<AppleDemo, Integer> e=itr.next();
		//	System.out.println("key:"+ e.getKey());
		//	System.out.println("Value: "+e.getValue());
		}
		AppleDemo a4=new AppleDemo(150,"Smila Apple");
		appleMap.put(a4, 4508);
//		System.out.println(a4.hashCode());
		System.out.println("Hahahaah "+appleMap.get(a2));
		Set<Entry<AppleDemo, Integer>> set1=appleMap.entrySet();
		Iterator<Entry<AppleDemo, Integer>>  itr1 = set1.iterator();
		while(itr1.hasNext()){
//			System.out.println(itr1.next());
		}
		
	}

}
