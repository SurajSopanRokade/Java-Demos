package com.exception;

public class Exception1 {
	public static void array(int n[]) {
		for (int i=0; i<=n.length; i++) {
			System.out.print(n[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in main block");
		int arr[]= {1,3,4,5,7,3,4};
		try {
		   array(arr);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("I am in catch block");
			
	  } finally {
			System.out.println("I am in final block");
		}
	}
	

}
//class MyException extends Exception1{
//	public int array1() {
//		int arr1[]= {2,3,4,5,6};
//		
//	}
//}
