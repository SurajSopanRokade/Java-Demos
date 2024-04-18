package com.Static;

public class StaticVariables {
	int rollnum;//instance variables get memory every time object is created
	String name;
	static String college="SCOE";//Static variable get memory only once at time of class loading
	static void changeName() {//Static method cannot take non static DataMembers
								//Static method cannot use this and super keywords
		college="COEP";
	}
	static {
		//it is used to initialize static data members
		//it is invoked before main during time of class loading
	}
	StaticVariables(int rollnum, String name){
		this.rollnum=rollnum;
		this.name=name;
	}
	
	public String toString() {
		return " Rollnum " + rollnum +"\n"+ " Name " +name+"\n"+" College name " + college;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariables.changeName();//calling change method creating object
		StaticVariables s1 = new StaticVariables(1, "Suraj");
		System.out.println(s1);
		StaticVariables s2 = new StaticVariables(2, "Su");
		System.out.println(s2);
	}

}
