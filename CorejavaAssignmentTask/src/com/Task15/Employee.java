package com.Task15;
//Write the details of Employee class to a file in your local and make this file non-editable.
public class Employee
{

	public String ename;
	public int eid;
	public String edepartment;
	
	public Employee(String ename,int eid, String edepartment)
	{
		this.ename=ename;
		this.eid=eid;
		this.edepartment=edepartment;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEdepartment() {
		return edepartment;
	}

	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}

	@Override
	public String toString() {
		return " ename=" + ename + ", eid=" + eid + ", edepartment=" + edepartment + "]\n";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
