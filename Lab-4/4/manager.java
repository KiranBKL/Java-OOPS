class manager extends employee
{
	public manager(int code,String name,String address,int phone,int salary,float da,float hra)
	{
		super(code,name,address,phone,salary,da,hra);
	}
	public  double computesalary()
	{
		return super.computesalary();
	}
}
