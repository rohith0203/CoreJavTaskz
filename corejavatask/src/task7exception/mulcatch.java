package task7exception;

public class mulcatch {
public static void main(String[] args) {
	int a[]=new int [10];
	try
	{
	System.out.println(a[11]);
	a[10]=2/0;
	System.out.println(a);
	}
	catch(ArithmeticException e)
	{
		System.out.println("check the values");
	}catch(ArrayIndexOutOfBoundsException Arithmetice)
	{
		System.out.println("check the array bounds");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	System.out.println("over");
	

}
}
