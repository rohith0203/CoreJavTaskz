package com.Task1onetomany;
//Implement one-many association for Company and Employee.(Make sure to have rating,startYear for Employee)
public class Populationservey {
	public String fathername;
	public String job;
	public int familymembers;
	public int salary;
	public Populationservey(String fathername,String job,int familymembers,int salary)
	{ 
		this.fathername=fathername;
		this.job=job;
		this.familymembers=familymembers;
		this.salary=salary;

	}
	public void display()
	{
		System.out.println("yours father name::"+fathername+"<-->occupation::"+job+"<-->familymembers"+familymembers+"<-->income::"+salary);

	}
}
