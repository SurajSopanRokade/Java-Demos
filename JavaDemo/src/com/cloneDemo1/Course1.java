package com.cloneDemo1;

public class Course1 implements Cloneable  {
	String sub1;
	String sub2;
	String sub3;
	
	Course1(String sub1, String sub2, String sub3){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	
	@Override
	public String toString() {
		return "Course [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
	}
	protected Object clone() throws CloneNotSupportedException 
		{
	        return super.clone();
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
