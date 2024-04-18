package com.cloneDemo1;

import com.cloneDemo.Course;

public class Student1 implements Cloneable  {
	int id;
	String name;
	Course1 course;
	
	Student1(int id, String name, Course1 course){
		this.id=id;
		this.name=name;
		this.course=course;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	protected Object clone() throws CloneNotSupportedException
	{
		Student1 student = (Student1) super.clone();
		 
        student.course = (Course1)course.clone();
 
        return student;


	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
