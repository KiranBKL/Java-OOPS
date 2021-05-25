class Course
{
	 String coursename;
	 String courseid;
	 int courseduration;
	Course(String coursename,String courseid,int courseduration)
	{
		this.coursename=coursename;
		this.courseid=courseid;
		this.courseduration=courseduration;
	}
	public String getCoursename()
	{
		return coursename;
	}
	public String getCourseid()
	{
		return courseid;
	}
	public int getCourseduration()
	{
		return courseduration;
	}
	public void setCoursename(String coursename)
	{
		this.coursename=coursename;
	}
	public void setCourseid(String courseid)
	{
		this.courseid=courseid;
	}
	public void setCourseduration(int courseduration)
	{
		this.courseduration=courseduration;
	}
	public String toString()
	{
		return "Course Name: "+coursename+"	Course ID:"+courseid+"		Course Duration: "+courseduration;
	}
}
