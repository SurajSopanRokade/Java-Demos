package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {
	public void message()throws IOException, NullPointerException 
	{
		System.out.println("I am here");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class Throws1{
		public void message()throws FileNotFoundException,ArrayIndexOutOfBoundsException
		{
			System.out.println("I am not here");
		}
	}

}
