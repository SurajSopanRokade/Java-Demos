package com.treeset;

import java.util.Scanner;
import java.util.TreeSet;

//WAP to create  Unique Names Tracker
//The program should allow users to perform the following operations:
//
//Add a Name: Add a new name to the set of unique names.
//
//Remove a Name: Remove a specified name from the set.
//
//Check if Name Exists: Check if a given name exists in the set.
//
//Display All Names: Display all the unique names in the set
public class Tracker {
	public TreeSet<String> sytrack(TreeSet<String> tset){
		Scanner sc = new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("choise 1 = Add new name");
			
			System.out.println("choise 2 = Remove name");
	
			System.out.println("choise 3 = check name exist or not");
			
			System.out.println("choise 4 = show all data");
			int i=sc.nextInt();
			if (i==1) {
				System.out.println("Give us name to add");
				String str = sc.next();
				tset.add(str);
			}
			else if (i==2) {
				System.out.println("Give us name to Remove");
				String str = sc.next();
				tset.remove(str);
			}
			else if (i==3) {
				System.out.println("Give us name to check");
				String str = sc.next();
				boolean b=tset.contains(str);
				if (b) {
					System.out.println("Yes it exist");
				}
				else
					System.out.println("Not exist");
			}
			else if (i==4) {
				System.out.println("Show data");
				System.out.println(tset);
			}
			System.out.println("If you want to continue type y else type n");
			ch = sc.next().charAt(0);
			
			
		}while(ch=='Y'|| ch=='y');
		return tset;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tracker t1 = new Tracker();
		TreeSet<String> tset = new TreeSet<>();
			tset.add("Suraj");
			tset.add("Abhishek");
			tset.add("Snehal");
			tset.add("Yogesh");
			tset.add("Sunish");
			
			t1.sytrack(tset);
		
		System.out.println(tset);
	}
}

