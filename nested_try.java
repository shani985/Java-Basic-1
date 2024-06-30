class nested_try
{
	public static void main(String args[])
	{	System.out.println("main method is start");
		try{	
			System.out.println("nested try start");
			try
			{
				System.out.println(46/0);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			int a[]={35,56,8,495,5,75};
			System.out.println(a[57]);
		    }
		catch(Exception e)
			{
				System.out.println(e);
			}
		finally
		{
			try{
				String str=null;
				System.out.println(str.toUpperCase());
			    }
			 catch(Exception e)
				{
					System.out.println(e);
				}
		}		
				

	}
}			
