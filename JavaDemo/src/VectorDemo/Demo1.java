package VectorDemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("Komal");
		al.add("Madhu");
		al.add("Anil");
		al.add("Sanju");
		al.add("Vaishu");
		
		al.ensureCapacity(0);
		
		ArrayList<Trainer> tList = new ArrayList<>();
		tList.add(new Trainer("Medha", 10, "BE"));
		tList.add(new Trainer("Kirt", 18, "MCA"));
		tList.add(new Trainer("Jayshree", 5, "BCA"));
		/*Ways to construct vector
		 * 1. default constructor
		 * 2. constructor taking Collection extending String type parameter
		 * 3. constructor taking Collection of custom type parameter
		 */
		
		Vector<String> v = new Vector<>(al);
		Vector<Trainer> v1 = new Vector<>(tList);
		
		
		for(Trainer t: tList)
			System.out.println(t);
		
		Vector<String> v3 = new Vector<>(20);
		//Vector<String> v4 = new Vector<>(20);// we can set initial capacity to vector
		System.out.println("Capacity: " + v.capacity());
		v3.add("A");
		v3.add("Z");
		v3.add("Y");
		v3.add("C");
		System.out.println("Size: "+v3.size());
		System.out.println(v);
		
		Enumeration<String> eCursor = v.elements();
		
		while(eCursor.hasMoreElements())
			System.out.println(eCursor.nextElement());
		
		/*System.out.println(v.addAll(al)); //return boolean
		System.out.println(v);*/
		
		/*v.addAll(1, al);
		System.out.println(v);*/
		
		/*v.add(2, "W");
		System.out.println(v);*/
		
		System.out.println(v.firstElement());//returns object at index 0
		System.out.println(v.lastElement());//returns object at index v.size()-1
		//setElementAt, removeElementAt
		
		
		
		
		
		
	}

	

}
