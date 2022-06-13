package com.Task20;

import java.util.ArrayList;
import java.util.Iterator;

//Methods of Iterator:hasNext(),next(),remove()
//Methods of ListIterator:add(E e),hasNext(),hasPrevious(),next(),nextIndex(),previous(),previousIndex(),remove(),set(E e)	


public class Iterator1 {
public static void main(String[] args) {
	ArrayList<Integer>a=new ArrayList<Integer>();
	a.add(1);
	a.add(12);
	a.add(32);
	a.add(3);
	////////////////////////////////////for remove the element in list by remove iterator
	Iterator i=a.iterator();
	while(i.hasNext())
	{      Object o=i.next();
	if(o.equals(12))
	{
		i.remove();
	}
		//System.out.println("after"+i.next());
	}
	for(Integer s:a)
	{
	System.out.println("before"+s);
	}
	}
}
