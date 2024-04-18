package com.throwsdemo;

import java.io.IOException;

public class Demo2 {
	void m() throws IOException {
		throw new IOException("Exception");
	}
	void n() throws IOException {
		m();
	}
	void p() {
		try {
			n();
		}catch(IOException e) {
			System.out.println("Execption handled in p method");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts...");
		Demo2 d1 = new Demo2();
		try {
			d1.n();
		}catch(IOException e) {
			System.out.println("Exception handled");
			e.printStackTrace();
		}
		d1.p();
		System.out.println("Normal flow");
	}

}
