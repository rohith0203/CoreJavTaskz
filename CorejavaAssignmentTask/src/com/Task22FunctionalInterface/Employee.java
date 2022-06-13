package com.Task22FunctionalInterface;
//Provide an interface Company with 
//default method of return type double calculating the profit(CP-SP)
//static method of return type String which takes (double) input from previous method and returns company name.
//Abstract method String getCompDetails(double profit,String name);=>Needs to be implemented using Lambda expression.
interface company
{
	
	default  double calculatingtheprofit(int cp,int sp)
	{
		return cp-sp;
	}
	public static String takes()
	{
		return "company is::techouts";
	}
	public String getCompDetails(double profit,String name);
}
public class Employee {
  public String getCompDetails(double profit,String name)
  {
	return profit+" "+name;
  }
  
//	public static void main(String[] args) {
//		company c=
//				((cp,sp),(profit,name))->{
//					
//					System.out.println(cp-sp);
//					takes();
//					int profit=cp-sp;
//                    System.out.println(profit+" "+name);			
//				};
//				c.calculatingtheprofit(234,123);
//				
//				c.getCompDetails(profit,"rohith");
//		
//			
//		
//		
//		
//		
		
	}
		
	
//}
