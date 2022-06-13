package taskcollections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task6conversionssss1 {
public static void main(String[] args) {
	TreeMap<String,String>t=new TreeMap<String,String>();
	t.put("hi","hola");
	t.put("thanks","graciase");
	t.put("friend","amigoo");
	Iterator<Entry<String,String>>i=t.entrySet().iterator();
	while(i.hasNext())
	{
		Entry<String,String>ans=i.next();
		System.out.println(ans.getKey()+" "+ans.getValue());
	}
}
}
