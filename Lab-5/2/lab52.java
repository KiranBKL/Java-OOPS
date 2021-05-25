import java.io.*;
import java.util.*;
class emp
{
	private int empcode;
	private String fn;
	private String ln;
	emp(int empcode,String fn,String ln)
	{
		this.empcode=empcode;
		this.fn=fn;
		this.ln=ln;
	}
	public double pay()
	{System.out.println("based on employee type");
	return 0.0;}
	public String toString()
	{
		return empcode+" "+fn+" "+ln;
	}
}
class hourlyemp extends emp
{
	private double rate;
	private double workinghours;
	hourlyemp(int empcode,String fn,String ln,double rate,double workinghours)
	{
		super(empcode,fn,ln);
		this.rate=rate;
		this.workinghours=workinghours;
	}
	public double pay(/*double rate,double workinghours*/)
	{return rate*workinghours;}

}
class salariedemp extends emp
{
	private double commissionrate;
	private double grosssales;
	private double basic;
	salariedemp(int empcode,String fn,String ln,double commissionrate,double grosssales,double basic)
	{
		super(empcode,fn,ln);
		this.commissionrate=commissionrate;
		this.grosssales=grosssales;
		this.basic=basic;
	}
	//public double pay(double rate,double workinghours)
	//{return rate*workinghours;}
}
class lab52
{
	public static void main(String[] args)
	{
		hourlyemp h=new hourlyemp(1533,"badu","mahendar reddy",1000,8);
		System.out.println(h);
		System.out.println(h.pay(/*h.rate,h.workinghours)*/));
	}

}
