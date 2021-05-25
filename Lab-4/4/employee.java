class employee
{
	int code;
	String name;
	String address;
	int phone;
	int salary;
	float da;
	float hra;
	public employee(int code,String name,String address,int phone,int salary,float da,float hra)
	{
		this.code=code;
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.da=da/100;
		this.hra=hra/100;
		this.salary=salary;
	}
	public double computesalary()
	{
		double sal=(double) ((salary*da)+(salary*hra)+salary);
		return sal;
	}	
}
