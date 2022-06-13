package taskcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
	


public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	
//	for(int i=0;i<=a.length-1;i++)
//	{
//	System.out.print(a[i]);
//	}
//	for(Integer a1:a)
//	{
//		System.out.println(a1);
//	}
	
	List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
	System.out.println(list);
	
//	for(Object x : a2) {
//		System.out.println(x);
//	}
//	
	
	
} 

}
