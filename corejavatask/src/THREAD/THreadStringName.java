package THREAD;


public class THreadStringName {

	public static void main(String[] args) {
		
		Thread t1=new Thread("helooo tech outs");
		t1.start();
		String str=t1.getName();
		System.out.println(str);
		
		
		
		
	}
}
