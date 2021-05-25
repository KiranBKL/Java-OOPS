abstract class shape
{
	String color;
	boolean filled;
	public shape()
	{
		this.color="blue";
		this.filled=true;
	}
	public shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public String getcolor()
	{
		return color;
	}
	public void setcolor(String color)
	{
		this.color=color;
	}
	public Boolean isfilled()
	{
		return true;
	}
	public void setfilled(boolean filled)
	{
		this.filled=filled;
	}
	abstract public double getArea();
	abstract public double getperimeter();
	abstract public String toString();
}
class circle extends shape
{
	double radius;
	public circle()
	{
		super();
	}
	public circle(double radius)
	{
		this.radius=radius;
	}
	public circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public double getradius()
	{
		return radius;
	}
	public void setradius(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	public double getperimeter()
	{
		return 2*3.14*radius;
	
	}
	public String getColor()
	{
		return color;
	
	}
	public String toString()
	{
		return "circle area: "+(3.14*radius*radius)+"perimeter: "+(2*3.14*radius)+"color: "+color+"filled with: "+super.isfilled();
	}
}
class Rectangle extends shape
{
	double length;
	double width;
	Rectangle ()
	{
		super();
	}
	
	Rectangle(String color,Boolean filled)
	{
		super(color,filled);
	}
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	Rectangle(double length,double width,String color,Boolean filled)
	{
			super(color,filled);
			this.length=length;
			this.width=width;
	}
	double getWidth()
	{
		return width;
	}
	void setWidth(double width)
	{
		this.width=width;
	}
	double getLength()
	{
		return length;
	}
	void setLength()
	{
		this.length=length;
	}
	public double getArea()
	{
		return length * width;
	}
	public double getperimeter()
	{
		return 2 * (length+width);
	}
	
	public String toString()
	{
		return "Rectangle Area:  "+getArea()+"Rectangle perimeter : "+getperimeter()+"Rectangle color"+super.getcolor()+"Filled with "+super.isfilled();
	}
}
class Square extends Rectangle
{
	double side,side1;
	Square()
	{
		super();
	}
	Square(double side)
	{
		this.side=side;
	}
	Square (double side,double side1,String color,Boolean filled)
	{
		super(color,filled);
		this.side=side;
		this.side1=side1;
	}
	public double getArea()
	{
		return side * side1;
	}
	public double getperimeter()
	{
		return 2 * (side+side1);
	}
	public String toString()
	{
		return "Square Area:  "+getArea()+"Squaree perimeter : "+getperimeter()+"Square color"+super.getcolor()+"Filled with "+super.isfilled();
	}
}
class lab51
{
	public static void main(String args[])
	{
		circle c=new circle(5,"blue",true);
		Rectangle c1=new Rectangle(5,5,"Red",true);
		System.out.println(c.getArea());
		System.out.println(c);
		System.out.println(c.getColor());
		System.out.println(c1.getArea());
		System.out.println(c1);
		System.out.println(c1.getcolor());
		Square c2=new Square(7,7,"violet",true);
		System.out.println(c2.getArea());
		System.out.println(c2);
		System.out.println(c2.getcolor());
	}
}
