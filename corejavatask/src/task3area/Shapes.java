package task3area;

public class Shapes {

	public double pi=3.14;
	public int r;
	class circle 
	{
		public void area(double pi,int r) {
          System.out.println(pi*r*r);
		}
		public void perimeter(double pi,int r) {
          System.out.println(2*pi*r);
		}
	}
	class triangle 
	{
		public void area(int b,int h) {
			System.out.println(1/2*b*h);
		}
		public void perimeter(int a,int b,int c) {
			System.out.println(a+b+c);
		}

	}
	class square 
	{    
		public void area(int a) {
			System.out.println(a*a);
		}
		public void perimeter(double pi,int a) {
			System.out.println(4*a);
		}

	}
	
}
