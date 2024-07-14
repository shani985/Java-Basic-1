@FunctionalInterface
interface A
{
	void m(String name);
	void m1(String name);
}
class B implements A
{
	public void m(String name)
	{
		System.out.println("how are you "+name);
	}

	public void m1(String name)
	{
		System.out.println("how are you "+name);
	}


}
class func_interface
{
	public static void main(String args[])
	{
		B r= new B();
		r.m("zuber");
		r.m1("nikhilesh");

	}
}
