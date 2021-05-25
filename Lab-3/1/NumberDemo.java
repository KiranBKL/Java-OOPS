import java.util.*;
class Number
{
	private double n;
	//private int j;
	Number(double n)
	{
		this.n=n;	
	}
	
	public boolean isZero(double n)
	{
		if(n==0)
			return true;
		else 
			return false;
	}
	public boolean isPositive(double n)
	{
		if(n>=0)
			return true;
		else
			return false;	
	}
	public boolean isNegative(double n)
	{
		if(n>=0)
			return false;
		else
			return true;	
	}
	public boolean isOdd(double n)
	{	
		if(n%2==0)
			return false;
		else	
			return true;
	}
	public boolean isEven(double n)
	{	
		if(n%2==0)
			return true;
		else	
			return false;
	}
	public boolean isPrime(double n)
	{	
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{	
				return false;
			}	
		}
		return true;

			
	}
	public boolean isAmstrong(double n)
	{	
		double m=n,sum=0,i;
		for(;m>0;m=m/10)
		{	
			i=m%10;
			sum=sum+(i*i*i);
		}
		if(sum==n)
			return true;
		else
			return false;
	}
	public double getFactorial(double n)
	{	
		if(n==0)
			return 1;
		else
			return n*getFactorial(n-1);	
	}
	public double getSqrt(double n)
	{	
		return Math.sqrt(n);	
	}
	public double getSqr(double n)
	{	
		return n*n;	
	}
	public double sumDigits(double n)
	{	
		if(n>=1)
		{
			int i = (int) n/10;
			//int i=n/10;
			return n%10+sumDigits(i);
		}
		else 
			return 0;	
	}
	static double rev=0;
	public double getReverse(double n)
	{	
		if(n>=1)
		{	
			int i = (int) n/10;
			//Double d=new Double(i);
			rev=rev*10+n%10;
			getReverse(i);
			return rev;
		
		}
		else 
			return 0;
	}
	

	public String toString()
	{
		return "it is"+isZero(n)+"it is "+isPositive(n)+"it is"+isNegative(n)+"\n"+isAmstrong(n);
	}
}
public class NumberDemo
{
	public static void main(String args[])
	{	
		Scanner obj=new Scanner(System.in);
		double  n=obj.nextDouble();		
		Number N=new Number(n);
		System.out.print(N);
		//System.out.println("Do U want Fcatorial of this number: 1-Yes::0-No");
		//int i=obj.nextInt();
		if(n<=9807 && n>=0)
			System.out.println("Factorial:\t"+N.getFactorial(n));
		else
			System.out.println("Factorial:\tInfinity");
		/*System.out.println(N.isPositive(n));
		System.out.println(N.isNegative(n));
		System.out.println(N.isOdd(n));
		System.out.println(N.isEven(n));
		System.out.println(N.isPrime(n));
		System.out.println(N.isAmstrong(n));
		System.out.println(N.getSqrt(n));
		System.out.println(N.getSqr(n));
		System.out.println(N.sumDigits(n));
		System.out.println(N.getReverse(n));
		System.out.println(N.getReverse(n));*/

		
	}
}
