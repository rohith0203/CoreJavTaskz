package taskcollections;

import java.util.HashSet;
// coverting the list to array using collections 
public class Task6conversionssss {
public static void main(String[] args) {
	HashSet<String>h=new HashSet<String>();
	h.add("1");
	h.add("12");
	h.add("20");
	h.add("2");
	h.add("8");
	h.add("3");
	System.out.println(h);
	String []x=new String[h.size()];
	h.toArray();
	for(String ans:h)
	{
		System.out.println("after converting int to array "+ans);
	}
}
}
