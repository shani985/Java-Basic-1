abstract class shop
{
	shop()
	{
		System.out.println(" all book of this shop");
	}
	public abstract void buy();
}
class math extends shop
{
	math()
	{
		super();
	}
	public void buy()
	{
		System.out.println("mathmetics 1 book");
	}
}
class java extends shop
{
	java()
	{
		super();
	}
	public void buy()
	{
		System.out.println("java indian writters");
	}
}
class text2
{
	public static void main(String args[])
	{
		shop r=new math();
		r.buy();
		shop r1 = new java();
		r1.buy();
	}
}

