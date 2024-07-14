class obj_class
{
	int a;
	int b;
	void diff(int x,int y)
	{
		System.out.println("x subtruct from a: "+(a-x));
		System.out.println("y subtruct from the b: "+(b-y));
	}
	void addition(int x,int y)
	{
		System.out.println("a add in the x: "+(x+a));
		System.out.println("b add in the y: "+(y+b));
	}

	{ 
	System.out.println("work is successful");
	}
	
	public String toString()
	{
		return "shani mourya";
	}
}
class demo
{
	public static void main(String args[])
	{
	
		obj_class r=new obj_class();
		r.a=678;
		r.b=563;
		r.diff(46,47);
		r.addition(46,38);
		System.out.println(r);
	}
	

}
	
