package com.Task10thread;

public class Avg implements Runnable
{      static double avg;
	public void run()
	{
		int a=12,b=23,c=34,d=45;
		avg=(a+b+c+d)/4;
	}

}
