package passfail;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Double> h = new HashMap<String, Double>();
		while(true)
		{
//		h.put("selva", 75.6);
//		h.put("abi", 89.5);
//		h.put("ram", 40.0);
			System.out.println("enter the name");
			String s=sc.next();
			System.out.println("enter the marks ");
			Double i=sc.nextDouble();
			h.put(s,i);
		}
	
//		HashMap<String, String> h1 = new HashMap<>();
//
//		for (Map.Entry<String, Double> x : h.entrySet()) {
//			String key = x.getKey();
//			Double value = x.getValue();
//			if (value > 65) {
//				h1.put(key, "pass");
//			} else {
//				h1.put(key, "pail");
//			}
//		}
//		System.out.println(h1);
	}
}
