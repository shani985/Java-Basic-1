class NFE
{
	public static void main(String args[])
	{	String Str="shani";
		try
		{
			int a= Integer.parseInt("Str");
			System.out.println(a);
		}
		catch(NumberFormatException n)
		{
			//System.out.println(n);
			System.out.println("string"+Str+" can not convertd in integers");
		}
	}
}

