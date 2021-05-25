class Book
{
	String aname;
	String title;
	int price;
	int pages;
	Book(String aname,String title,int price,int pages)
	{
		this.aname=aname;
		this.title=title;
		this.price=price;
		this.pages=pages;
	}
	public String toString()
	{
		return "Author name: "+aname+"\nTitle : "+title+"\nPrice :"+price+"\nPages :"+pages;
	}
}
