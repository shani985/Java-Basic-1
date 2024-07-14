interface A
{
	void show();
}
interface B
{
	void display();
}
class multi implements A,B
{
	public void show()
	{
		System.out.println("ineterface A");
	}
	public void display()
	{
		System.out.println("interface B");
	}
}

class check3
{
	public static void main(String args[])
	{
		multi r=new multi();
		r.show();
		r.display();
	}
}

