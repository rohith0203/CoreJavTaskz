package com.Task8Treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree {
public static void main(String[] args) {
	Set t=new HashSet();
	t.add(2);
	t.add(345);
	t.add("hi");
	
	System.out.println(t);
	
	TreeSet h=new TreeSet(t);
	System.out.println(t);
	
}
}
