package com.queueDemo;

public class Student implements Comparable<Student>{
	int roll;
	String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		System.out.println("I am in comparable");
		if(this.roll==o.roll)
			return 0;
		else if(this.roll>o.roll)
			return 1;
		else 
			return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
