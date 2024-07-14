class A extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println("class method");
				Thread.sleep(1000);
			}	
			catch(InterruptedException e)
			{
				System.out.println(e);
			}	
		}
	}
}
class multithread_extending
{
	public static void main(String args[])throws Exception
	{
		A t=new A();
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main method");
			Thread.sleep(1000);
		}
	}
}
