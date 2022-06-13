package com.task19;

import java.util.Scanner;

//Implement an exception "InvalidUserName".
//User inputs his UserName in console. When length of userName is <10 or if it has "&", this should be handled by the exception.
public class Main {
public static void main(String[] args) throws MyException1 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name please");
	String n=sc.next();
	
	if(n.length()<10||n=="&")
	{
		throw new MyException1();
	}
	else
	{
		System.out.println("Thank you for your respond");
	}
	
	
	
	
	
	
	
}
}
