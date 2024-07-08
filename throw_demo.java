class throw_demo
{
	public static void main(String args[])
// throws ArithmeticException
	{	
		throw_demo r=new throw_demo();
		//r.div(24,5);
		try
		{
		r.div(34,0);
		}
		catch(Exception e)
		{
		System.out.println("value of b is zero:");
		}
	}
	void div(int a,int b)
//throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
	}

}