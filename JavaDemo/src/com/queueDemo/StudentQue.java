package com.queueDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class StudentQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(12,"Suraj");
		Student s2 = new Student(45,"Pritam");
		Student s3 = new Student(16,"Sudarshan");
		Student s4 = new Student(17,"Snehal");
		Queue<Student> qu= new PriorityQueue<>();
		qu.add(s1);
		qu.add(s2);
		qu.add(s3);
		qu.add(s4);
		Student s;
		while((s=qu.poll())!=null) {
			System.out.println(s+" ");
		}
		System.out.println(qu.poll());
		
	}

}
