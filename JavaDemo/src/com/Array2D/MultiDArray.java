package com.Array2D;

public class MultiDArray {
	public static void array() {
		int arr[][]= {{4,5,6,7},{2,1,3,6}};
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
	}

}
