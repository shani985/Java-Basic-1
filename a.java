interface customer_sanju
{
	int amt=56;
	void perchase();
}
class seller_raju implements customer
{
	void perchase()
	{
		System.out.println("sanju need"+amt+"kg sugar");
	}
	 void requred()
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
		System.out.println(customer.amt);
	}
}

