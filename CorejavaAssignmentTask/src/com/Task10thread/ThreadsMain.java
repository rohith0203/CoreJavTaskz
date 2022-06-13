package com.Task10thread;

public class ThreadsMain {
public static void main(String[] args) {
	Runnable r=new Add();
	Thread t=new Thread(r);
	t.start();
	
	Runnable r1=new Avg();
	Thread t1=new Thread(r1);
	t1.start();
	
	Runnable r2=new Display();
	Thread t2=new Thread(r2);
	t2.start();
	
}
}
