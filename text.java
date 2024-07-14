abstract class programming
{
	public abstract void devlaper();
	public abstract void rank();
}
class java extends programming
{
	public void devlaper()
	{
		System.out.println("james gousling");
	}
	public void rank()
	{
		System.out.println("rank of java is 1st");
	}
}
class text
{
	public static void main(String args[])
	{
		java r=new java();
		r.devlaper();
		r.rank();
	}
}
			