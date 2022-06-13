package taskcollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Task_removeduplicates {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	ArrayList<String> B=new ArrayList<String>();
	a.add("hi");
	a.add("ho");
	a.add("rohith");
	a.add("rohith");
	a.add("a");
	a.add("a");
	
	
	for(int i=0;i<a.size();i++)
	{
		for(int j=i+1;j<a.size();j++)
		{
			if(a.get(i).equals(a.get(j)))
			{
				a.remove(j);
				j--;
			}
		}
	}
	Iterator dublicate=a.iterator();
	while(dublicate.hasNext()) {
		System.out.println(dublicate.next());
	
	
	
	}	
	
}
}
