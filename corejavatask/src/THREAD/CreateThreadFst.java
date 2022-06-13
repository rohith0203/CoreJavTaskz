package THREAD;
 class My extends Thread
{
public void run()
{
	System.out.println("inside run method present in my class");
}
}
public class CreateThreadFst
{
	public static void main(String[] args) {
		System.out.println("main starts");
		My m=new My();
		m.start();
		System.out.println("main ends");
		
		
	}

}
