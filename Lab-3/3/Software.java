class Software
{
	double version;
	String sname;
	Book book;
	Software(double version,String sname,Book book)
	{
		this.version=version;
		this.sname=sname;
		this.book=book;
	}
	public String toString()
	{
		return "Version :"+version+"\nSoftware Name : "+sname+"\n"+book;
	}
}
