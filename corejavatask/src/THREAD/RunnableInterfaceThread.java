package THREAD;

class NewThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("inside new thread"); 
		}
	}
}
public class RunnableInterfaceThread {
	public static void main(String[] args) {
		NewThread r=new NewThread();
		System.out.println("main starts");
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<=5;i++)
		{
		System.out.println("inside new thread main"); 
		}
	}

}
