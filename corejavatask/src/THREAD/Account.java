package THREAD;

class SBI
{
	private int bal=500;
	public int balance()
	{
		return bal;
	}
	public void Withdraw(int amount)
	{
		bal=bal-amount;
		System.out.println(bal);
	}
}

public class Account implements Runnable {
	private String p;
	
	  SBI A=new SBI();
	public void Cash(int amount)
	{
		
		
		if(A.balance()>=amount)
		{
			
			System.out.println(Thread.currentThread().getName() + "you can proceed"); 
			A.Withdraw(amount);
		}
		else System.out.println("please the check the balance");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("okkkk");
		
		
	}
	public static void main(String[] args) {
		Account acc=new Account();
		Thread t1=new Thread(acc);
		t1.setName("rohith");
		acc.Cash(100);
		
		t1.start();
		
		Thread t2=new Thread(acc);
		t2.setName("h");
		acc.Cash(200);
		t2.start();
	}
	

	
}

