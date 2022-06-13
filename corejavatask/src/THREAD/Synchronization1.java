package THREAD;

class Print 
{
 public void PrintTable(int n)// if u write synchronization in starting of the method then the output will comes in order
 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
		}
		
	}
}


class Th1 extends Thread
{
	Print n;
	public Th1(Print p1)
	{
		this.n=p1;
	}
	public void run()
	{
		n.PrintTable(5);
	}
}


class Th2 extends Thread
{
	Print n;
	public Th2(Print p1)
	{
		n=p1;
	}
	public void run()
	{
		n.PrintTable(100);
	}
}


public class Synchronization1 
{
	public static void main(String[] args) 
	{
		Print p1=new Print();
		Th1 t1=new Th1(p1);
		Th2 t2=new Th2(p1);
		t1.start();
		t2.start();
		
	}

}
