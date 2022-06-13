package THREAD;

 class MultiTh1 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)
		{ 
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		 Thread t =new Thread("hello");
		 Thread t1=new Thread("hoola");
		 
		 MultiTh1 t4=new MultiTh1();
		 Thread t3=new Thread(t4);
		 t3.start();
		 t.start();
		 t1.start();
		 
		 System.out.println(t.getName());
		 System.out.println(t1.getName());
		}

	

}

