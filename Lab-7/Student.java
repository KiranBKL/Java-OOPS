import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Name:");
		String s=obj.nextLine();
		System.out.print("Enter Student age:");
		int a=obj.nextInt();
		System.out.print("Enter Student Percentage :");
		float p=obj.nextFloat();
		try
		{
			checkPerc(p);
		}
		catch(PercentageException p1)
		{
			System.out.println(p1);
		}
	}
	static void checkPerc(float p)throws PercentageException
	{
		if(p<50)
			throw new PercentageException(p);
		else
			System.out.print("Name :"+s+"\nAge :"+a+"\nPercentage :"+p);
	}
}
class PercentageException extends Exception
{
	float perc;
	PercentageException(float perc)
	{
		this.perc=perc;
	}
}
