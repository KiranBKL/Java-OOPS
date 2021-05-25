class CourseDemo
{
	public static void main(String args[])
	{
		Course co[]=new Course[10];
		co[0]=new Course("CSE","R161641",3);
		System.out.println(co[0]);
		co[1]=new Course("Mech","R161778",5);
		System.out.println(co[1]);
		co[2]=new Course("CSE","R161868",3);
		System.out.println(co[2]);
		co[3]=new Course("CSE","R161533",7);
		System.out.println(co[3]);
		co[4]=new Course("CSE","R161548",3);
		System.out.println(co[4]);
		sort(co,5);
		System.out.println("\n");
		for(int i=0;i<5;i++)
		{
			System.out.println(co[i]);
		}
	}
	static void sort(Course[] c,int n)
	{
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(c[i].courseid.compareTo(c[j].courseid)>0)
				{
					Course t=c[i];
					c[i]=c[j];
					c[j]=t;
				}
	}
}
