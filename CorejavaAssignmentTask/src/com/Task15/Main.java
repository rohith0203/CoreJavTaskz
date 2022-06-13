package com.Task15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
	ArrayList<Employee>data=new ArrayList<Employee>();
	data.add(new Employee ("rohith",1909,"frontend"));
	data.add(new Employee ("srinu",1910,"hybris"));
	data.add(new Employee ("charan",1911,"SSL"));
	data.add(new Employee ("devi",1912,"SSL"));
	data.add(new Employee ("devi",1955,"SSL"));
	try {
		File f = new File("D:\\Employee.txt");
		PrintWriter file=new PrintWriter(f);
		file.println(data);
		f.setReadOnly();
		file.print("Testing the read only");
		file.print(" Second Testing the read only");
		file.flush();
		file.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
}
}
