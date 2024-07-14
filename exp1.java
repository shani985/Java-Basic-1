class exp1
{
	public static void main(String args[])
	{
		System.out.println("main method is start");
		int a=46,b=0,c;
		try	
		{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("main method is ending");

	}
}