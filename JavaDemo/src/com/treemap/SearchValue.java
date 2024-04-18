package com.treemap;

import java.util.Collections;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SearchValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(2, "Suraj");
		map.put(4, "Abhishek");
		map.put(7, "Snehal");
		map.put(12, "Adarsh");
		map.put(6, "Ishvar");
//		System.out.println(map);
//		Set<Entry<Integer, String>> set=map.entrySet();
//		for (Entry<Integer, String> e : set) {
//			if(e.getValue().equals("Suraj"))
//				System.out.println(e.getKey()+"==>"+e.getValue());
//		}
//		System.out.println(map.ceilingKey(3));
//		System.out.println(map.floorKey(12));
		
//		System.out.println(map.firstKey());
//		System.out.println(map.lastKey());
		
//		System.out.println(map.floorEntry(10));
		
//		System.out.println(map.lastEntry());
//		System.out.println(map.firstEntry());
		
//		System.out.println(map.lowerEntry(7));
		
		NavigableSet<Integer>nset=map.navigableKeySet();
		for(int i : nset) {
			if (i==12)
				System.out.println(i + " " + map.get(i));
		}
		SortedMap<Integer, String>map1=map.subMap(2, 12);
		System.out.println(map1);
	}

}
