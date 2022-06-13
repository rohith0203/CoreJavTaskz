package Brands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Cars {
	public HashMap<String,String>m;
	public HashMap<String,String> benz;
	public HashMap<String,String> maruti;
	public void Brands()
	{
		HashMap<Integer,String>B=new HashMap<Integer,String>();
		B.put(1,"Benz");
		B.put(2,"maruti");
		B.put(3,"toyota");
		B.put(4,"hyundai");

		for(Map.Entry<Integer,String>x:B.entrySet())
		{
			System.out.println(x.getKey()+" "+x.getValue());
		}
}
	public  void modelOfBenz()
	{
		Map<String,String>benz=new HashMap<String,String>();
		benz.put("Benz AMG GT 63 ","suv");
		benz.put("Benz A-Class Sedan ","xuv");
		benz.put("Benz SL-Class ","lxi");
		benz.put("Benz_EQC","lxx");
		for(Map.Entry<String,String>y:benz.entrySet())
		{
			System.out.println(y.getKey()+" "+y.getValue());
		}
		
		
		
	}
	public  void modelOfmaruti()
	{
		Map<String,String>maruti=new HashMap<String,String>();
		maruti.put("alto 800","suv");
		maruti.put("swift ","xuv");
		maruti.put("swift desire","lxi");
		maruti.put("brezza_EQC","lxx");
		for(Map.Entry<String,String>z:maruti.entrySet())
		{
			System.out.println(z.getKey()+" "+z.getValue());
		}
	}
	
	public void modelOfToyota()
	{
		Map<String,String>toyota=new HashMap<String,String>();
		toyota.put("Toyota SR Trim","lxi");
		toyota.put("Toyota SR5 Trim","suv");
		toyota.put("Toyota LE Trim","lxx");
		toyota.put("Toyota_EQC_Trim","xuv");
		for(Map.Entry<String,String>z:toyota.entrySet())
		{
			System.out.println(z.getKey()+" "+z.getValue());
		}
	
		
	}
	public void modelOfHyundai()
	{
		Map<String,String>hyundai=new HashMap<String,String>();
		hyundai.put("Hyundai Veloster N","lxx");
		hyundai.put("Hyundai Genesis G70","suv");
		hyundai.put("Hyundai Kona. .","xuv");
		hyundai.put("Hyundai_EQC","lxi");
		for(Map.Entry<String,String>z:hyundai.entrySet())
		{
			System.out.println(z.getKey()+" "+z.getValue());
		}
	}
	
	
	
	
//	public void last()
//	{
//		.entrySet().stream().sorted(HashMap.Entry.comparingByKey());
//	}
//	
//	
}
