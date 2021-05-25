class BookDemo
{
	public static void main(String args[])
	{
		Author a1=new Author("Kiran","kirankumaradhoni@gmail.com",'M');
		Book b1=new Book("Python",a1,18.95,333);
		System.out.println(b1);
	}
}
