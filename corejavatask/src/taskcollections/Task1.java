package taskcollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

//Wite a Java program to create read only data using List, Set and Map in example
public class Task1 {
public static void main(String[] args) {
	ArrayList<String>a=new ArrayList<String>();
	a.add("car");
	a.add("bike");
	a.add("cycle");
	System.out.println(a);
	
	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	Set<Integer>s=new LinkedHashSet<Integer>();
	s.add(23);
	s.add(12);
	s.add(1);
	System.out.println(s);
	//bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
	Map<Integer,String>m=new HashMap<>();
	m.put(2,"A");
	m.put(3,"B");
	m.put(1,"C");
	for(Map.Entry<Integer,String>m1:m.entrySet())
	{
	System.out.println(m1.getKey()+" "+m1.getValue());
	}
}
}
