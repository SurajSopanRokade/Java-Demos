package com.mypack;
import com.accessmodifiers.A;// Specific class name or * allowed wild cards not allowed
public class B extends A{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a = new B();// 
		a.msg();// we can Access protected methods and datamembers to another package through inheritance
	}

}
