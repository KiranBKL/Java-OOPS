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
	public String toString()
	{
		return "\nAuthor Name: "+name+"\nAuthour email: "+email+"\nAuthor gender: "+gender;
	}
}
