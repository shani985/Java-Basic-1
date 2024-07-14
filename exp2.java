class exp2
{
	public static void main(String args[])
	{
		System.out.println("main method is start ");
		String str=null;
		try
		{
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException e)
		{
			//System.out.println(e);
			System.out.println(e);
		}
		System.out.println("main method is ending ");
	}
}