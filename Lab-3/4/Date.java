class Date
{
	private int day;
	private String month;
	private int year;
	Date(int day,String month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay()
	{
		return day;
	}
	public String getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	public void setDay(int day)
	{
		this.day=day;
	}
	public void setMonth(String month)
	{
		this.month=month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public String toString()
	{
		return day+"-"+month+"-"+year;
	}
}
