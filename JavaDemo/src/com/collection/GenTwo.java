package com.collection;

public class GenTwo<T,V> {
	T obj1;
	V obj2;
	GenTwo(T t, V v){
		obj1=t;
		obj2=v;
	}
	void showType() {
		System.out.println(obj1.getClass());
		System.out.println(obj2.getClass());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenTwo<Integer, String> obj= new GenTwo<Integer, String>(1,"Java");
		obj.showType();
	}

}
