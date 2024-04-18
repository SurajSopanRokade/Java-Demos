package com.linkedhashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer, String> map = new HashMap<>();
		map.put(11,"Suraj");
		map.put(24,"Abhi");
		map.put(6,"ram");
		System.out.println(map);
//		map.clear();
//		System.out.print(map.isEmpty());
//		System.out.println(map);
		
		LinkedHashMap <Integer, String> map1 = new LinkedHashMap<>(map);
		map1.put(10,"Suraj");
		map1.put(20,"Abhi");
		map1.put(4,"ram");
		System.out.println(map1);
		map1.remove(11);
		System.out.println(map1);
		
		Set<Entry<Integer, String>> set = map1.entrySet();
		Iterator<Entry<Integer, String>> itr = set.iterator();
		int max=0;
		String str = null;
		while(itr.hasNext()) {
			Entry<Integer, String> ent = itr.next();
			
			int a= ent.getKey();
			if (a>max) {
				max=a;
				str=ent.getValue();
			}
			
			
		}
		System.out.println("String = " + str + "Max = " + max);
		
		
		
	}

}
