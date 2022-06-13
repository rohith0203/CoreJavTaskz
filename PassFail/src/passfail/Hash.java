package passfail;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Input:HashMap
//{selva:75.6f, abi:89.5f,ram:40}
//Output:hashmap
//{selva:pass,abi:pass,ram:fail}
public class Hash {
	public static void main(String[] args) {
		HashMap<String, Double> h = new HashMap<String, Double>();
		h.put("selva", 75.6);
		h.put("abi", 89.5);
		h.put("ram", 40.0);
		System.out.println(h);
		HashMap<String, String> h1 = new HashMap<>();

		for (Map.Entry<String, Double> x : h.entrySet()) {
			String key = x.getKey();
			Double value = x.getValue();
			if (value > 65) {
				h1.put(key, "pass");
			} else {
				h1.put(key, "pail");
			}
	}
		
		
		
	
		System.out.println(h1);
	}
}
