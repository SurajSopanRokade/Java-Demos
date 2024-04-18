package com.throwsdemo;

public class Demo1 {
	public void check(int n) {
		if (n<18) {
			throw new ArithmeticException("Not valid");
		}
		else
			System.out.println("Welcome to vote");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts");
		Demo1 d1 = new Demo1();
		try {
		d1.check(13);
		}catch(ArithmeticException e) {
			System.out.println("Age must be above 18");
			e.printStackTrace();
		}
		finally{
			System.out.println("I am in finally");
		}
		System.out.println("Rest of code");
	}

}
