package com.collection;

public class Gen<T> {
	T obj;
	Gen(T o){
	 obj=o;
	}
	T getObj() {
		return obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer>obj = new Gen<Integer>(10);
		Integer i=obj.getObj();
		
		Gen<String>obj1 = new Gen<String>("Suraj");
		String str=obj1.getObj();
		
//		obj=obj1;//Type mismatch
		
		
	}

}
