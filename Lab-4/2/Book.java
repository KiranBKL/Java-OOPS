class Book
{
	private String bname;
	private Author author;
	private double bprice;
	private int qty=0;
	Book(String bname,Author author,double bprice,int qty)
	{
		
		this.bname=bname;
		this.bprice=bprice;
		this.qty=qty;
		this.author=author;
	}
	/*public String getBname()
	{
		return bname;
	}
	public double getBprice()
	{
		return bprice;
	}
	public Author getAuthor()
	{
		return author;
	}*/
	public void setBprice(double bprice)
	{
		this.bprice=bprice;
	}
	public int getQty()
	{
		return qty;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public String toString()
	{
		return "Book Name: "+bname+""+author+"\nBook price :"+bprice+"\nBook QTY :"+qty;
	}
}
