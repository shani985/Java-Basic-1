class Bus implements Runnable
{
	int available=1,passenger;
	Bus(int passenger)
	{
		this.passenger=passenger;
	}
	
	public synchronized  void run()
		{
			String name=Thread.currentThread().getName();
			if(available>=passenger)
			{
				System.out.println(name+ " rejerved seat");
				available=available-passenger;
				
			}
			else
			{
				System.out.println("sorry seat is not available");
			}
		}
}
class customer_set_book
{
	public static void main(String aa[])
	{
		Bus r=new Bus(1);
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		Thread t3=new Thread(r);
		t1.setName("ram");
		t2.setName("shani");
		t3.setName("nikhilesh");
		t1.start();
		t2.start();
		t3.start();


	}
}

