package THREAD;
class a implements Runnable
{
	public void run()
	{
		System.out.println("Runnable in a");
	}
}
class b extends Thread
{
	public void run()
	{
		System.out.println("thread in b");
	}
}
public class Excercise {
	public static void main(String[] args) {
		a a1=new a();
		System.out.println("main starts");
		Thread t=new Thread(a1);
		t.start();
		b b1=new b();
		b1.start();
		System.out.println("main ends");
	}

}
