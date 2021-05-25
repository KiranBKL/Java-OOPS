import java.io.*;
import java.util.*;
class Student
{
	String name;
	int age;
	float perc;
	public Student(String name,int age,float perc)
	{
		this.name=name;
		this.age=age;
		this.perc=perc;
	}
	public String toString()
	{
		return "Name :"+name+"\tAge :"+age+"\tPrecentage :"+perc;
	}
}

class StudentDemo
{
	public static void main(String args[])throws IOException
	{
		FileWriter fw=new FileWriter("data.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		int marks,age,l=1;
		Scanner k=new Scanner(System.in);
		while(l<3)
		{
		System.out.println("Enter the age and marks");
		marks =k.nextInt();
		age=k.nextInt();
		Student s=new Student("Kiran",age,marks);
		try
		{	
			checkPerc(s);
		
		}
		catch(PercentageException p1)
		{
			System.out.println(p1);
		}
		}
	}
	static void checkPerc(Student s)throws PercentageException,IOException
	{
		
		if(s.perc<50)
			throw new PercentageException(s.perc,"PercentageException Raised:");
		else
		{
			
			bw.write(s.name+"\n"+s.age+"\n"+s.perc);
			System.out.println("Percentage is Above 50\n"+s);
			
		}

		
	}
	bw.close();
			fw.close();
}

class PercentageException extends Exception
{
	float n;
	String msg;
	PercentageException(float n,String s)
	{
		this.n=n;
		this.msg=s;
	}
	public String toString()
	{
		return msg+" Percentage is :"+n;
	}
}
S