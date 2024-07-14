class handling1
{
	public static void main(String args[])
	{	
		try
		{
			int a=46,b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		try
		{
			int a[]={34,26,37,37};
			System.out.println(a[7]);
		}
		catch( ArrayIndexOutOfBoundsException n)
		{
			System.out.println(n);
		}
		try
		{
			String str="shanimourya";
			int b=Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
			
	}
}

		
	