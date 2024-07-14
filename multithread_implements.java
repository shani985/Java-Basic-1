class A implements Runnable
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println("class method ");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class multithread_implements
{
	public static void main(String args[])
	{
		A r= new A();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main method");
			thraed.sleep(1000);
		}
	}
}
			