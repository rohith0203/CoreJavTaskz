package com.Task24consumerInterface;
//Using Consumer Interface,print stream of integers ranging from 1 to 10 and make sure to neglect numbers between 3 and 7.
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class ConsumerInterface
{
	static void myMethod(List<Integer> list) 
	{
		List<Integer> koma = list.stream().filter(x->x<3||x>7).map(x->x).collect(Collectors.toList());
		koma.forEach(n->System.out.println(n));
	}
}

public class Mian
{
	public static void main(String[] args) 
	{
		List<Integer> ls = new ArrayList<Integer>();
		for (int i=1;i<=10;i++)
		{
			ls.add(i);
		}
		Consumer<List<Integer>> con = ConsumerInterface::myMethod;
		con.accept(ls);

	}

}


