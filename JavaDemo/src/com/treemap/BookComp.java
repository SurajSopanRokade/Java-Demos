package com.treemap;

import java.util.Comparator;

public class BookComp implements Comparator<Book> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
//		if (o1.price==o2.price)
//			return 0;
//		else if (o1.price<o2.price)
//			return -1;
//		else
//			return 1;
		Integer i = o1.price;
		Integer j = o2.price;
		return i.compareTo(j);
	}

}
