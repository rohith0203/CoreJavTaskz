package com.Task9ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ListiteratorAndIterator {
public static void main(String[] args) {
	ArrayList<String>coll=new ArrayList<String>();
	coll.add("one");
	coll.add("two");
	coll.add("three");
	coll.add("four");
	coll.add("five");
	coll.add("six");
	Iterator i1=coll.iterator();
	System.out.println("\"using iterator:\"");
	while(i1.hasNext())
	{
		
		System.out.println(i1.next());
	}
	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	System.out.println("\"using list iterator:\"");
	
	ListIterator i2=coll.listIterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	//aaaaaaaaaaaaaaaaaaaaaa      to reverse any collection we use "hasprevious"   in  listiterator            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
System.out.println("\"using list iterator:\"");
	
	ListIterator i3=coll.listIterator();
	while(i2.hasPrevious())
	{
		System.out.println(i2.previous());
	}
	
}
}
