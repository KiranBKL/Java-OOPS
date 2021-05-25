class employeedemo
{
	public static void main(String args[])
	{
		manager m1=new manager(101,"M","KRP",12345,100000,20,30);
		typist t1=new typist(104,"S","HRP",67890,50000,15,25);
		System.out.println("Salary of manager is:"+m1.computesalary());
		System.out.println("Salary of typist is:"+t1.computesalary());
	}
}
