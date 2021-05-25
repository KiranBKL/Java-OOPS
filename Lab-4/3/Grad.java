class Grad extends Student
{
	Grad(String name,String id,double grade,int age,String address)
	{
		super(name,id,grade,age,address);
	}
	boolean isPassed(double grade)
	{
		if(grade>=8.0)
			return true;
		else
			return false;
	}
}
