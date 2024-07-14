abstract class college
{
	public abstract void teacher();
	public abstract void student();
	void absent()
	{
		System.out.println("student is not present in the college");
	}
}

abstract class role1_teacher extends college
{
	public void teacher()
	{
		System.out.println("teacher is teach java");
	}
}
 class role_of_student extends role1_teacher 
{
	public void student()
	{
		System.out.println("student is goto college read the subject java from the teacher");
	}
}
class text3
{
	public static void main(String args[])
	{
	
		college r=new role_of_student();
		r.absent();
		r.teacher();
		r.student();
	}
}
		 