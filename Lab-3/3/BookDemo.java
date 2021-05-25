class BookDemo
{
	public static void main(String args[])
	{
		Book b1=new Book("Kiran","Python",500,1032);
		Software s1=new Software(18.0,"ubuntu",b1);
		System.out.println("Software");
		System.out.println(s1);
		System.out.println("\n\nHardware");
		Hardware h1=new Hardware("Motherboard","Kiran",b1);
		System.out.println(h1);	
	}
}
