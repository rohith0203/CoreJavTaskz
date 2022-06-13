package THREAD;
class Dog implements Runnable
{
	public void run()
	{
		System.out.println("helooo koma");
	}
}
public class ThreadRunnableString {

	public static void main(String[] args) {
		Runnable r=new Dog();
		Thread t2=new Thread(r,"stella");
		t2.start();
		String str1=t2.getName();
		System.out.println(str1);
	}
}
