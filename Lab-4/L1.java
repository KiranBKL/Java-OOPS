class Author
{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setemail(String email)
	{
		this.email=email;	
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	public String getName()
	{	return name;
	}
	public String getemail()
	{	return email;
	}
	public char getGender()
	{	return gender;
	}
	public String toString()
	{
		return name+" ("+gender+")"+" at "+email+"\n";
	}
}
class L1{
	public static void main(String[] args)
	{
		Author a1=new Author("nagendra","nagendra@gmail.com",'m');
		System.out.print(a1);
		a1.setemail("nagendra892@gmail.com");
		System.out.println("after changing mail");
		System.out.print(a1);
		
	}
	
}

