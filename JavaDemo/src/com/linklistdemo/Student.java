package com.linklistdemo;

public class Student implements Comparable<Student> {
	int sid;
	String sname;
	int perc;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", perc=" + perc + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getPerc() {
		return perc;
	}

	public void setPerc(int perc) {
		this.perc = perc;
	}

	public Student(int sid, String sname, int perc) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.perc = perc;
	}

	public Student() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.sname.compareTo(o.sname);
	}

}
