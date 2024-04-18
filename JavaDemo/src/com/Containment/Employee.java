package com.Containment;

public class Employee {
	int id;
	String name;
	double salary;
	Address address;// this class employee has a entity reference Address called Aggregation
						// code Reusability
	Employee(){
		id=0;
		name="";
		salary=0;
		
	}
	Employee(int id, String name, double salary, Address address ){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
	public void display() {
		System.out.println("ID " + id + "\n" + "Name " + name + "\n" + "Salary " + salary );
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1 = new Address("Pune", "Maharastra", "India");
		Address a2 = new Address("Nagpur", "Maharas", "India");
		
		Employee e1 = new Employee(1, "Suraj", 23000, a1 );
		Employee e2 = new Employee(2, "Su", 45000, a2 );
		e1.display();
		e2.display();
		
	}

}
