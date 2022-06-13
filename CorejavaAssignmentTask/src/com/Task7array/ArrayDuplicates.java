package com.Task7array;

import java.util.HashMap;
import java.util.Map;

//In an array of 1-10, multiple numbers are duplicates, how do you find duplicates using Map implemented classes.
public class ArrayDuplicates {
public static void main(String[] args) {
	
	Integer []arr= {1,2,3,2,1,5,5,7,3,9,9};
	
	Map<Integer,String>m=new HashMap<Integer,String>();
	
	for(Integer l:arr) 
	{
		if(m.containsKey(l)) {
			System.out.println("duplicate is:"+l);
		}else
		m.put(l,"original");
	}
	
	
	
	
}
}
