import java.util.*;
import java.io.*;
class Person
{
	String pname;
	int age;
	Person(String pname,int age)
	{
		this.pname=pname;
		this.age=age;
	}
	public String toString()
	{
		return "Name :"+pname+"\tAge :"+age;
	}
}

class PersonDemo
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Name :");
		String name=obj.nextLine();
		System.out.print("Enter Age :");
		int age=obj.nextInt();
		Person p=new Person(name,age);
		try
		{
			checkNum(p.pname,p);
		}
		catch(NumericException n1)
		{
			System.out.println(n1);
		}
	}
	static void checkNum(String name,Person p)throws NumericException
	{
		int i=0;
		for( i=0;i<((p.pname).length());i++)
		{
			if(name.charAt(i)>='0' && name.charAt(i)<='9')
				throw new NumericException(name);
		}
		if(i==(p.pname).length())
			System.out.println("There is no Numeric in the Name \n"+p);
	}
}

class NumericException extends Exception
{
	String s;
	NumericException(String s)
	{
		this.s=s;
	}
	public String toString()
	{
		return "Numerics are Present int the Name :"+s;
	}
}
