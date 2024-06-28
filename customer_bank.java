class Bank extends Thread
{
	static int bal=5000;
	static int withdrow;
	Bank(int withdrow)
	{
		this.withdrow=withdrow;
	}
	public  static synchronized void withdrow()
	{
		String name=Thread.currentThread().getName();
		if(withdrow<=bal)
		{
			System.out.println(name+" withdrow many");
			bal=bal-withdrow;
		}
		else
		{
		System.out.println("insufficient balance");
		}
	}
	public void run()
	{
		Bank.withdrow();
	}
}
class customer_bank
{
	public static void main(String aa[])
	{
 
		Bank r=new Bank(5000);
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.setName("shani");
		t2.setName("nikhilesh");
		
		Bank r2=new Bank(5000);
		Thread t3=new Thread(r2);
		Thread t4=new Thread(r2);
		t3.setName("amit");
		t4.setName("zuber");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
	
	