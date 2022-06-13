package task7exception;
import java.util.*;

class MyException extends Exception
{
	
	public MyException()
	{
		//return ;
		System.out.println("ayyyyyyy");
	}
}
public class UserException {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the input");
try {
	int a=sc.nextInt();
	int a1=a;
	System.out.println(a1);
	throw new MyException();
}
catch(Exception e)
{
//	System.out.println("entered invalid number");
}
}
}