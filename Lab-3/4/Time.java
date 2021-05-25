class Time
{
	int hour;
	int minutes;
	int seconds;
	Time(int hour,int minutes,int seconds)
	{
		this.hour=hour;
		this.minutes=minutes;
		this.seconds=seconds;
	}
	public int getHour()
	{
		return hour;
	}
	public int getMinutes()
	{
		return minutes;
	}
	public int getSecond()
	{
		return seconds;
	}
	public void setHour(int hour)
	{
		this.hour=hour;
	}
	public void setMinutes(int minutes)
	{
		this.minutes=minutes;
	}
	public void setSeconds(int seconds)
	{
		this.seconds=seconds;
	}
	public String toString()
	{
		return hour+":"+minutes+":"+seconds;
	}
}
