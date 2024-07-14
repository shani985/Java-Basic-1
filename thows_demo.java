class throws_demo
{
	public static void wait()throws InterruptedException	
{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			thread.sleep(1000);
		}
	}
	public static void main(String args[])
	{
		wait();
	}
}