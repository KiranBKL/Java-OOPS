import java.io.*;
import java.util.*;
class PercentageException extends Exception{
	double perc;

	PercentageException(double perc)
	{
		this.perc=perc;
	}
	public String toString()
	{
		return "your percentage is below 50"+":"+perc;
	}
}
class Student{
	String name;int age;double perc;
	Student(String name,int age,double perc)
	{
		this.name=name;
		this.age=age;
		this.perc=perc;
	}
	public String toString()
	{
		return name+";"+age+";"+perc;
	}
}
class kiranstDemo{
	public static void main(String[] args)throws IOException
	{
		Student s=new Student("upendra",18,45);
		try
		{
			checkperc(s);
		}
		catch(PercentageException e){
			System.out.println(e);
		}
	}
		static void checkperc(Student s)throws PercentageException{
			if(s.perc<50)
			{
				throw new PercentageException(s.perc);
			}
			else
			{
				System.out.println("you are passed");
			}
		}

	}

