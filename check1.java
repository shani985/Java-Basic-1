interface client
{
	void web_design();
	void web_devlaper();
}
 abstract class rajtech implements client
{
	public void web_design()
	{
		System.out.println(" green, top manu,four dot button");
	}
}
class shanitech extends rajtech
{
	public void web_devlaper()
	{
		System.out.println(" CSS,HTNL,JAVA SCRIPT");
	}
}
class check1
{
	public static void main(String args[])
	{
		client r=new shanitech();
		r.web_design();
		r.web_devlaper();
	}
}