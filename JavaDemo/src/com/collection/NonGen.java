package com.collection;

public class NonGen {
	Object obj;
	NonGen(){
		
	}
	NonGen(Object o){
		this.obj=o;
	}
	void showType() {
		System.out.println(obj.getClass());
	}
	Object getObj() {
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonGen obj = new NonGen(12);
		System.out.println(obj.getObj());
		//int i=(int)obj.getObj();
		
		NonGen obj1 = new NonGen("Java");
		obj1.showType();
		//String str =(String)obj1.getObj();
		obj=obj1;
		System.out.println(obj.getObj());
		//int v = (int)obj.getObj();
	}

}
