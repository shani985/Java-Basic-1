interface customer_sanju
{
	int amt=56;
	void perchase();
}
class seller_raju implements customer_sanju
{	
	public void perchase()
	{	
		System.out.println("sanju need "+amt+"kg sugar");
	}
	  static void required()
	{
		System.out.println("parlegi and goodday & CNC");
	}   

}
class check
{
	public static void main(String args[])
	{
		customer_sanju r=new seller_raju();
		r.perchase();
		seller_raju.required();
		System.out.println(customer_sanju.amt);
	}
}

