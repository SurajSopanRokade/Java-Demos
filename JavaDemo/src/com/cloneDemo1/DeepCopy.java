package com.cloneDemo1;

public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Course1 science = new Course1("Physics", "Chemistry", "Biology");
		 
        Student1 student = new Student1(111, "John", science);
 
        Student1 student1 = null;
        student1= (Student1) student.clone();
        
        student.course.sub3="maths";
//        student1.course.sub3="ths";
        System.out.println("s "+student);
        System.out.println("s1 "+student1);
	}

}
