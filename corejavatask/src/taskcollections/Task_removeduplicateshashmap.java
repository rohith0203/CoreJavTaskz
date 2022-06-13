package taskcollections;

import java.util.HashMap;

public class Task_removeduplicateshashmap {
	public static void main(String [] args)

	{

	HashMap<String ,String> m = new HashMap<>();
	
	String[] Arr = {"a", "b","c","d","a","b","b"};

	for(String key :Arr) 

	m.put(key,"Present");

	System.out.println(m);
	
	}
}
