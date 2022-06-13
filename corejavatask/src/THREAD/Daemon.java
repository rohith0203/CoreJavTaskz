package THREAD;

public class Daemon extends Thread 
{
public void run()
{
	System.out.println("Name:"+Thread.currentThread().getName());
	System.out.println("daemon:"+Thread.currentThread().isDaemon());
}
public static void main(String[] args) {
	Daemon t1=new Daemon();
	Daemon t2=new Daemon();
	Daemon t3=new Daemon();
	t1.setDaemon(true);
	t1.start();
	t2.start();
	t3.start();
	
	
}
}
