package task2allensolly;

public class A {
	void myMethod(String jeans) {
		System.out.println(jeans);
	}
}
	class B extends A{
		void myMethod(String Tonjeans,String Formal) {
			System.out.println(Tonjeans+"+"+ Formal);
		}
	
	public static void main(String[] args) {
		B obj=new B();
		obj.myMethod("Ton");
	}

}