package com.cloneDemo;

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		Course science = new Course("Physics", "Chemistry", "Biology");
		Student s1 = new Student(1, "Suraj", science);
		Student s2 =null;
		
		s2=(Student) s1.clone();
		
		System.out.println("s2 "+s2);
		s1.course.sub3="Maths";
		
		System.out.println("s2 "+s2);
		System.out.println("s1 "+s1);
		System.out.println("Main ends...");
	}

}
