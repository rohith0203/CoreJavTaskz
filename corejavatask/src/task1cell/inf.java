package task1cell;

import java.util.Scanner;


public class inf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the contact Name");
		String s=sc.next();
		System.out.println("Enter the primary phno");
		long l=sc.nextLong();
		System.out.println("Enter the Secondary phno");
		int i=sc.nextInt();
		System.out.println("contact saved");
		
		Cellphone c=new Cellphone();
		c.contact(s);
		c.contact(l);
		c.contact(i);
		
	}

}
