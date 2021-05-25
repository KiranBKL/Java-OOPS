class StudentDemo
{
	public static void main(String args[])
	{
		Grad g=new Grad("Kiran","R161641",10,18,"Kurnool");
		boolean b=g.isPassed(g.grade);
		if(b==true)
			System.out.println("Kiran Passed the Exams");
		else
			System.out.println("Kiran Failed the Exams");
		Undergrad u=new Undergrad("kkkk","R161642",9.2,19,"Kurnool");
		boolean b2=u.isPassed(u.grade);
		if(b2==true)
			System.out.println("kkkk Passed the Exams");
		else
			System.out.println("kkkk Failed the Exams");
	}
}
