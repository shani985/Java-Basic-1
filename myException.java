class myException
{
	public static void main(String args[])
	{	
	try
	{
	vote(45);
	}
        catch(Exception e)
	{
	System.out.println(e);
	}
	}

	public static void vote(int age)throws InvalidAgeException 
	{
		if(age<18)
		{
			throw new InvalidAgeException("not eligible for vote");
		}
		else
		{

			System.out.println("eligible for voting");
	        }
	}
}
class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{	
		System.out.println(msg);
	}
}
