package THREAD;
class t extends Thread
{
public void run()
{
	for(int i=0;i<=5;i++)
	{
	try {
	
		Thread.sleep(500);
		
	}
	
	catch(InterruptedException ie)
	{
		System.out.println(ie);
	}
	System.out.println(i);
	}
}
}
public class SleepThread1 {
public static void main(String[] args) {
	t t1=new t();
	t1.start();
}
}
