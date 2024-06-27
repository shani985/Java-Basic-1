class thread1 extends Thread
	{
	public void run()
		{
			String name =Thread.currentThread().getName();
			for(int i=0;i<5;i++)
			{
				System.out.println(name);
				Thread.yield();
			}
		}
	}
class thread2 extends Thread
	{	
		public void run() 
		{	 
		
			String name =Thread.currentThread().getName();
			try
			{
				for(int i=0;i<5;i++)
				{
					System.out.println(name);
					Thread.yield();
					Thread.sleep(1000);
				}	
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}
class thread_yield
{
	public static void main(String aa[])
	{
		thread1 r=new thread1();
		thread2 r1=new thread2();
		r.setName("thread1");
		r1.setName("thread2");
		
		r.start();
		
		//System.out.println(r.isAlive());
		r1.start();
		r1.interrupt();

		//System.out.println(r1.isAlive());
		
	}
}