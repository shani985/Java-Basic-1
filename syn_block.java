class msg
{
	public void show(String name)
	{
		//synchronized(this)
		//{
			for(int i=0;i<=4;i++)
			{
				System.out.println("how are you "+name);
			}
		//}
	}
}
class ourthread extends Thread
{
	msg m;
	String name;
	ourthread(msg m,String name)
	{
		this.m=m;
		this.name=name;
	}
	public void run()
	{
		m.show(name);
	}
}
class syn_block
{
	public static void main(String aa[])
	{
		msg m=new msg();
		ourthread t1=new ourthread(m,"shani");
		ourthread t2=new ourthread(m,"amit");
		t1.start();
		t2.start();
	}
}
