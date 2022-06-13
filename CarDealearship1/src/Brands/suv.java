package Brands;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class suv {
	Scanner sc = new Scanner(System.in);

	HashMap<String, String> mergeHashMap;

	public void suvModel() {
		Map<String, String> benz = new HashMap<String, String>();
		benz.put("Benz AMG GT 63 ", "suv");
		benz.put("Benz A-Class Sedan ", "xuv");
		benz.put("Benz SL-Class ", "lxi");
		benz.put("Benz_EQC", "lxx");

		Map<String, String> maruti = new HashMap<String, String>();
		maruti.put("alto 800", "suv");
		maruti.put("swift ", "xuv");
		maruti.put("swift desire", "lxi");
		maruti.put("brezza_EQC", "lxx");
		
		Map<String,String>toyota=new HashMap<String,String>();
		toyota.put("Toyota SR Trim","lxi");
		toyota.put("Toyota SR5 Trim","suv");
		toyota.put("Toyota LE Trim","lxx");
		toyota.put("Toyota_EQC_Trim","xuv");
		
		Map<String,String>hyundai=new HashMap<String,String>();
		hyundai.put("Hyundai Veloster N","lxx");
		hyundai.put("Hyundai Genesis G70","suv");
		hyundai.put("Hyundai Kona. .","xuv");
		hyundai.put("Hyundai_EQC","lxi");
		
		HashMap<String, String> mergeHashMap = new HashMap<String, String>();
		mergeHashMap.putAll(benz);
		mergeHashMap.putAll(maruti);
		mergeHashMap.putAll(toyota);
		mergeHashMap.putAll(hyundai);

		System.out.println("enter your type/model  like suv,lxi,xuv,lxx");
		String choose = sc.next();
		
		for (Map.Entry<String, String> z : mergeHashMap.entrySet()) {
			if(choose.equals(z.getValue()))
			System.out.println(z.getKey() + " " + z.getValue());
		}
//	String key=z.getKey();
// 	String value=z.getValue();
//		
		
//
//		if (choose.equals(mergeHashMap.getValue())) {
//			System.out.println(key + " " + value);
//		}
		
		
//		getKey1(mergeHashMap, choose);
		

	}
	
	
//	public static void getKey1(Map<String, String> map, String value)
//    {
//        for (Map.Entry<String, String> entry: map.entrySet())
//        {
//            if (value.equals(entry.getValue())) {
//            	System.out.println("suv cars are : " + entry.getKey());
//            }
//        }
//    }

}
