package com.treemap;

public class Book implements Comparable<Book>{
	int bid;
	String bname;
	int price;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bid, String bname, int price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.bname.compareTo(o.bname);
	}
	
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	
		
	

}
