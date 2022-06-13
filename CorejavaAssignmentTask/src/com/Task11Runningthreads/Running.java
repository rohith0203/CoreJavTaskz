package com.Task11Runningthreads;

public class Running  extends Thread
{
		public void run()
		{
			if(Thread.currentThread().isDaemon())
			{
				System.out.println("hi");
			}
			else
			{
				System.out.println("bye");
			}
		}
public static void main(String[] args) {
	
	Running r=new Running();
	Thread t1=new Thread(r);
	Thread t2=new Thread(r);
	Thread t3=new Thread(r);
	t1.setName("hello");
	t1.setDaemon(true);
	System.out.println(t1.isDaemon());
	System.out.println(t1.getName());
	t2.start();
	t3.start();
	
	
	
	
	
}		
}

