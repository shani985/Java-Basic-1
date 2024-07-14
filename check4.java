interface ram
{
	void add();
}
interface raja extends ram
{
	void sub();
}
class rajat implements raja
{
	public void add()
	{
		int a=47;
	 	int b=489;
		System.out.println("sum of two number = " +(a+b));
	}
	public void sub()
	{
		int a=354;
		int b=465;
		System.out.println("subtruction of two number "+(a-b));
	}
}
class check4
{
	public static void main(String ar[])
	{
		rajat r=new rajat();
		r.add();
		r.sub();
	}
}