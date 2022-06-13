package taskcollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//WAP to map multiple countries with their respective capitals using map .Iterating them using
//1.foreach loop
//2.keyset iterator
//3.entryset iterator along with foreach
//4.EntrySet along with Java iterator

public class Task3 {
public static void main(String[] args) {
	Map<String,String>m=new HashMap<>();
	m.put("india", "hyd");
	m.put("goa", "panaji");
	m.put("maldives","male");
	for(Map.Entry<String,String> m1:m.entrySet())
	{
		System.out.println(m1.getKey()+" "+m1.getValue());
	}
	// for key seytttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt
	Iterator<String> m2=m.keySet().iterator();
	while(m2.hasNext())
	{
		System.out.println("when only key set need:"+m2.next());
	}
	
	for(Map.Entry<String,String> m3:m.entrySet())
	{
		System.out.println(m3.getKey()+" "+m3.getValue());
	}
	
	
	// for entry settttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt
	Iterator<Entry<String, String>> m4=m.entrySet().iterator();
	while(m4.hasNext())
	{
		Entry<String, String> x = m4.next();
		System.out.println("when entry set need:"+x.getKey() +" -> "+x.getValue());
	}
	
	
	
	
}
}
