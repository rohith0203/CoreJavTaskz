package com.statesandcapitals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateCapital {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	HashMap<String,String> map=new HashMap<String,String>();
	map.put("telangana","hyderabad");
	map.put("karnataka", "bangalore");
	System.out.println("----->telangana     karnataka<---------------");
	System.out.println("=>>>>enter the states given above i will fetch the capital of that state<<<=");
	String capital1=sc.next();
//	String ans = map.get(capital1);
//	System.out.println(ans);
//	
		for(Map.Entry<String,String>x:map.entrySet())
		{
			if(capital1.equals(x.getKey()))
			{
				System.out.println(x.getValue());
			}
		}
	
}
}
