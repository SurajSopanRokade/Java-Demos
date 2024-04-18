package com.hashmap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> obj = new HashMap<>();//Default arg
		HashMap<Integer,String> obj1= new HashMap<>(20);//Map with Initial capacity
		HashMap<Integer,String> obj2= new HashMap<>(obj1);//Creating map using another
		HashMap<Integer,String> obj3= new HashMap<>(15,0.5f);//
		
		HashMap<Integer,String> hmap = new HashMap<>();
		hmap.put(1, "10th");
		hmap.put(2, "12th");
		
		System.out.println(hmap.put(1,"B.E."));
		System.out.println(hmap);
		
		
		
	}

}
