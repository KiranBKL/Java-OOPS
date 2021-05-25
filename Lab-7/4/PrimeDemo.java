import java.util.*;
class PrimeDemo
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n=obj.nextInt();
		try
		{
			checkNum(n);
		}
		catch(PrimeException p1)
		{
			System.out.println(p1);
		}
	}
	static void checkNum(int num)throws PrimeException
	{
		int i;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
				break;
		}
		if(i==num)
			throw new PrimeException("Prime Number Exception raised",num);
		else
			System.out.println("Entered Number is Not a Prime Number\nNumer is :"+num);
	}
}

class PrimeException extends Exception
{
	String s;
	int n;
	PrimeException(String s,int n)
	{
		this.s=s;
		this.n=n;
	}
	public String toString()
	{
		return s+"\nPrime number is :"+n;
	}
}
