package task7exception;

import java.util.ArrayList;
import java.util.Scanner;
class customex extends Exception
{

	public customex() {
		System.out.println("invalid id");
		
	}
	

}
public class Pojomain {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id ");
		int id1=sc.nextInt();
	
		int count = 0;
    	ArrayList<Pojo>a=new ArrayList<>();
    	a.add(new Pojo("rohith",100,"balanagar"));
    	a.add(new Pojo("prasad",101,"annaanagar"));
    	a.add(new Pojo("sithara",102,"gollnagar"));
    	
    		
    	try {
    	for(int i=0;i<a.size();i++)
    	{
    		Pojo p = a.get(i);
    		int id = p.id;
    		if(a.get(i).id==id1)
    		{
    			
    			count++;
    		}
    	}
    	if(count == 1) {
    		System.out.println("welcome to office");
    		return;
    	}
    	
    	
    	throw new customex();
    	}
    	catch (Exception e)
    	{
    		
    	}
    	
    	
    	
	}

}
