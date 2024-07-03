class A extends Thread 
{
	public void run()
	{
		String n=Thread.currentThread().getName();
		for(int i=0;i<6;i++)
		{
			System.out.println(n);
			
		}
		
		
	}	
}
class multithread_basic
{
	public static void main(String args[])throws Exception
	{
		A t1=new A();
		A t2=new A();
		A t3=new A();
		t1.setName("Thread1");
		t2.setName("thread2");
		t3.setName("Thread3");
		t1.start();
		t2.join();
		t3.start();
	}
}