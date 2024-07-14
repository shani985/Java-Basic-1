interface A
{
	void show();
}
interface B
{
	void show();
}
class multiple implements A,B
{
	public void show()
	{
		System.out.println("interface A & B ");
	}
}
class check2
{
	public static void main(String args[])
	{
		multiple m=new multiple();
		m.show();
	}
}

		