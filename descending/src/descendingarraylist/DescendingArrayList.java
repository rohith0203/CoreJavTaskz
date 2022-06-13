package descendingarraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

//Create a method which accepts an integer array and removes all the duplicates in the array.
//		Return the resulting array in descending order
public class DescendingArrayList {
	public static  void arr1()
	{	Scanner sc=new Scanner(System.in);
	System.out.println("enter the how many values you are going to add");
	int c=sc.nextInt();
	Integer[] arr=new Integer[c];
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("enter the array along with repeated values");
		int x=sc.nextInt();
		arr[i] = x;
	}
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("sorted array"+arr[i]);

	}
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i].equals(arr[j]))
		{
			j--;
		}
	}
	System.out.println("ffffff3"+arr[i]);
}

	

	}

	public static void main(String[] args) {

		arr1();
	}

}
