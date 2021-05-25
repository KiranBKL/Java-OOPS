class savingsAccount
{
	static double annualinterestrate;
	private double savingbalance;
	public double calculateMonthlyInterest()
	{
		savingbalance=savingbalance+(annualinterestrate*savingbalance)/12;
		return savingbalance;
	}
	public static void setAnnualInterestRate(double b)
	{
		annualinterestrate=b/100;
	}
	public savingsAccount(double a)
	{
		savingbalance=a;
	}
	public String toString()
	{
		return "Balance is: "+savingbalance;
	}
}
class savingsAccountDemo
{
	public static void main(String args[])
	{
		savingsAccount s1=new savingsAccount(12000);
		savingsAccount s2=new savingsAccount(24000);
		savingsAccount.setAnnualInterestRate(2);
		s1.calculateMonthlyInterest();
		s2.calculateMonthlyInterest();
		System.out.println(s1);
		System.out.println(s2);
		savingsAccount.setAnnualInterestRate(5);
		s1.calculateMonthlyInterest();
		s2.calculateMonthlyInterest();
		System.out.println(s1);
		System.out.println(s2);
	}
}
