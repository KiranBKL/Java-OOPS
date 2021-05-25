class Student
{
	String name;
	int age;
	float perc;
	public Student(String name,int age,float perc)throws PercentageException
	{
		this.name=name;
		this.age=age;
		if(perc>=50)
			this.perc=perc;
		else
			throw new PercentageException(perc,"Not create");
	}
	public String toString()
	{
		return "Name :"+name+"\tAge :"+age+"\tPrecentage :"+perc;
	}
}

class StudentDemo
{
	public static void main(String args[])
	{
		try
		{
			Student s=new Student("Nagendra",18,55f);
			System.out.println(s);
		}
		catch(PercentageException p1)
		{
			System.out.println(p1);
		}
	}
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
		return msg+" and Percentage is :"+n;
	}
}
