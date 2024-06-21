import java.util.Scanner;
interface client
{
	void input();
	void output();
}
class rahul implements client
{	
	Scanner sc=new Scanner(System.in);
	{
		System.out.println("enter the total number of emplayee");
	}
	int n=sc.nextInt();
	double sel[]=new double[n];
	String name[]=new String[n];
	public void input()
	{
		
		
		System.out.println("enter the name");
		for(int i=0;i<n;i++)
		{
			name[i] = sc.nextLine();

			
		}
		System.out.println("enter the selary");
		for(int i=0;i<n;i++)
		{
			sel[i]=sc.nextDouble();
		}
	}
	public void output()
	{	
		for(int i=0;i<n;i++)
		{
			System.out.println(name[i]+"  "+sel[i]);
		}
	}
}
class text4
{
	public static void main(String args[])
	{
		client r=new rahul();
		r.input();
		r.output();
	}
}