package com.Task3interface;
//With help of an anonymous inner class, implement any abstract method of the interface. Observe on working of anonymous Inner class here.

interface working
{
	abstract void work();
}
class Anonymous1 implements working
{
	@Override
	public void work()
	{
		System.out.println("comfortably working");
	}
}

public class Anonymous {
	public static void main(String[] args) {
		Anonymous1 help=new Anonymous1();
		help.work();
	}
}
