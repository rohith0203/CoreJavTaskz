package com.Task10thread;

public class Add implements Runnable{
	static int c;
	public void run()
	{
		int a=10;
		int b=20;
		 c=a+b;
	}



}
