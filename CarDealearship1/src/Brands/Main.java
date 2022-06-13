package Brands;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static HashMap<String,String>z;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Cars b=new Cars();
//	car.modelOfBenz();
//	car.modelOfmaruti();
//	
	suv s=new suv();
	System.out.println("Welcome To Cars DealerShip");
	System.out.println("enter yes for display");
	String s1=sc.next();
	  switch (s1) { case "yes": {
	  
	  
	  System.out.println("choose  1  for brand ---or----choose 2 type"); 
	  
	  int x =sc.nextInt(); switch (x) { case 1: {
	  System.out.println(">----------------------------------------------------<");
	  System.out.println("Enter 1 for Benz models");
	  System.out.println("Enter 2 for maruti models");
	  System.out.println("Enter 3 for toyota models");
	  System.out.println("Enter 4 for hyundai models");
	  System.out.println(">----------------------------------------------------<");
	  int i = sc.nextInt(); switch (i) { case 1: { b.modelOfBenz(); break; } case
	  2: { b.modelOfmaruti(); break; }
	  //case 3: { b.modelOfToyota(); break; } case
//	  4: { b.modelOfHyundai(); break; }
	  
	  } } break;
	  
	  case 2: {
		  s.suvModel();
		  
	  
	  } 
	  
	  } }
	  
//	  default: { System.out.println("sorry");
//	  
//	  }
	  
	  }
	 

}
}
