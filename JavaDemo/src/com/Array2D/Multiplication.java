package com.Array2D;

public class Multiplication {
	public static void multi() {
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int c[][]= new int [3][3];
		for (int i=0; i<a.length; i++) {
			
			for (int j=0; j<b.length; j++) {
				c[i][j]=0;
				for (int k=0; k<c.length; k++) {
					c[i][j]+=a[j][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi();
	}

}
