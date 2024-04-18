package com.Array2D;

public class Jagged {
	public static void array() {
		int arr[][]=new int [4][];
		arr[0]= new int [3];
		arr[1]= new int [5];
		arr[2]= new int [4];
		arr[3]= new int [1];
		
		for (int i=0; i<arr.length; i++) {
			int k=1;
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j]=k++;
			}
		}
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
	}

}
