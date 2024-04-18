package com.Overloading;
//method overloading is to increase the readability of code
public class ChangeNoOfArg {
	public int add(int a, int b) {//method overloading by changing the number of arguments 
		int addition=a+b;
		return addition;
	}
	public int add(int a, int b, int c) {
		int addition=a+b+c;
		return addition;
	}
	public int multi(int a, int b) {//method overloading by changing the dataType of argument
		System.out.println("i am in int");
		int multi=a*b;
		return multi;
	}
	public double multi(double a, double b) {
		System.out.println("i am in double");
		double multi=a*b;
		return multi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeNoOfArg c1 = new ChangeNoOfArg();
		System.out.println(c1.add(2,3,2));
		System.out.println(c1.add(2,3));
		System.out.println(c1.multi(2,3));
	}

}
