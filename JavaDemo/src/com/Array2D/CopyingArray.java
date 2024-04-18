package com.Array2D;

public class CopyingArray {
	public static void copyArray() {
		char [] Copyfrom= {'a','b','c','d','e','f','g','h','i'};
		char [] Copyto= new char [4];
		System.arraycopy(Copyfrom, 1, Copyto, 0, 4);
		System.out.println(String.valueOf(Copyto));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyArray();
	}

}
