class A
{
	int a;
	int b;
	A()
	{
		a=58;	
		b=67;
		System.out.println("contructor is non paramerize"+a+"\n"+b);
	}
	
	A(  A ref)
	{
	System.out.print("parameterize constructor \n"+ref.a+" "+ref.b);
	}

}
class B
{
	public static void main(String args[])
	{
	
		A r=new A();
		A r1=new A(r);
	}
}

