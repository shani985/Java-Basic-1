abstract class animal
{	animal()
	{
	System.out.println("all animal");
	}
	public abstract void sound();
}
class dog extends animal
{
	dog()
	{
		super();
	}
	public void sound()
	{
	System.out.println("dog is barking");
	}
}
class lion extends animal
{
	lion()
	{
		super();
	}
	public void sound()
	{
		System.out.println("lion is roar");
	}

}
class text1
{
	public static void main(String args[])
	{
		dog d=new dog();
		
		d.sound();
		lion l=new lion();
		l.sound();
	}
}

			