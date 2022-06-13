package taskcollections;
//converting linked list to arraylist
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<>();
		a.add(10);
		a.add(5);
		a.add(1);
		a.add(21);
		a.add(11);
		a.add(122);
		
		System.out.println(a);
		// linked list to arraylistttttttttttttttttttttttttttttttttt
		List<Integer>b=new ArrayList<>(a);
		for(Integer m:b)
		{
			System.out.println(m);
		}
		// list to arrayyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy
		int []x=new int[a.size()];
		a.toArray();
		for(Integer ans:a)
		{
			System.out.println("after list to array"+ans);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
