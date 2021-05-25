class DateTimeDemo
{
	public static void main(String args[])
	{
		Date d1=new Date(18,"December",2018);
		Time t1=new Time(05,05,05);
		DateTime dt=new DateTime(d1,t1);
		System.out.println(dt);
	}
}
