class table
{
	public synchronized void printtable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
}
class Thread1 extends Thread
{
	table t;
	Thread1(table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printtable(5);
	}
}
class Thread2 extends  Thread 
{
	table t;
	Thread2(table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printtable(7);
	}
}
class table_solve
{
	public static void main(String a[])
	{
		table obj=new table();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();
	}
}
		
