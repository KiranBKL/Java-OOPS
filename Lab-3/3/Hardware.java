class Hardware
{
	String category;
	String publisher;
	Book book;
	Hardware(String category,String publisher,Book book)
	{
		this.category=category;
		this.publisher=publisher;
		this.book=book;
	}
	public String toString()
	{
		return "Category : "+category+"\nPublisher : "+publisher+"\n"+book;
	}
}
