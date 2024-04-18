package com.cloneDemo;

public class Student implements Cloneable {
	int id;
	String name;
	Course course;
	
	Student(int id, String name, Course course){
		this.id=id;
		this.name=name;
		this.course=course;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
