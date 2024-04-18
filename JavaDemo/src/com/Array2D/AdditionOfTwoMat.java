package com.Array2D;

public class AdditionOfTwoMat {
	public static void addition() {
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int c[][]= new int [3][3];
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<b.length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<b.length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();
	}

}
