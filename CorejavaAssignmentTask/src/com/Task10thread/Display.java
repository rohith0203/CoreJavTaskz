package com.Task10thread;

public class Display implements Runnable{
	public void run()
	{
		System.out.println(Add.c);
		System.out.println(Avg.avg);
	}
}
