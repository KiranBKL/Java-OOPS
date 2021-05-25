class DateTime
{
	Date d;
	Time t;
	DateTime(Date d,Time t)
	{
		this.d=d;
		this.t=t;
	}
	public Date getD()
	{
		return d;
	}
	public Time getT()
	{
		return t;
	}
	public void setD(Date d)
	{
		this.d=d;
	}
	public void setT(Time t)
	{
		this.t=t;
	}
	public String toString()
	{
		return "Date ->    "+d+"\nTime ->    "+t;
	}  
}
