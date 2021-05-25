class Undergrad extends Student
{
	Undergrad(String name,String id,double grade,int age,String address)
	{
		super(name,id,grade,age,address);
	}
	boolean isPassed(double grade)
	{
		if(grade>=7.0)
			return true;
		else
			return false;
	}
}
