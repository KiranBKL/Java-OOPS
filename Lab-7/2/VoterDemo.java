import java.io.*;
class Voter
{
	String name;
	int age;
	public Voter(String name,int age)throws AgeException
	{
		this.name=name;
		if(age<18)
			throw new AgeException(age,"Not Elegible");
		else
			this.age=age;
	}
	public String toString()
	{
		return "Name :"+name+"\t Age :"+age;
	}
}

class VoterDemo
{
	public static void main(String args[])
	{
		try
		{
			Voter s=new Voter("Nagaraj",17);
			System.out.println(s);
		}
		catch(AgeException a1)
		{
			System.out.println(a1);
		}
	}
}

class AgeException extends Exception
{
	int age;
	String msg;
	AgeException(int age,String s)
	{
		this.age=age;
		this.msg=s;
	}
	public String toString()
	{
		return msg+" and Age :"+age;
	}
}
