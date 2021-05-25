class savingsAccount
{
	static float annualinterestrate;
	private float savingbalance;
	public float calculateMonthlyInterest()
	{
		savingbalance=savingbalance+(annualinterestrate*savingbalance)/12;
		return savingbalance;
	}
	public static void setAnnualInterestRate(float b)
	{
		annualinterestrate=b/100;
	}
	public savingsAccount(float a)
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
		savingsAccount s1=new savingsAccount(2000);
		savingsAccount s2=new savingsAccount(3000);
		savingsAccount.setAnnualInterestRate(4);
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
