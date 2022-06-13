package com.Task25Consumerinterface;
//Using Consumer Interface,print stream of integers ranging from 1 to 10 and double these numbers in your output.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		//List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10); for short curt
ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		
		List<Integer> doubleArray = list.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println("Double values of ArrayList Integers: "+doubleArray);
		doubleArray.forEach(System.out::println);
	}
}
