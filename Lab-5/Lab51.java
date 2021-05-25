abstract class Shape
{
	String color;
	boolean filled;
	public Shape()
	{
		this.color="red";
		this.filled=true;
	}
	public Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public boolean  getFilled()
	{
		return filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}
	abstract double getArea();
	abstract double getPerimeter();
}

class Circle extends Shape
{
	double radius;
	double a;
	double p;
	public Circle()
	{
		super();
	}
	public Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		a=3.14*radius*radius;
		return a;
	}
	public double getPerimeter()
	{
		p=2*3.14*radius*radius;
		return p;
	}
	public String toString()
	{
		return "Area : "+a+"\nPerimeter : "+p+"\nColor : "+color+"\nFilled : "+filled;
	}
	
}

class Lab51
{
	public static void main(String args[])
	{
		Circle c1=new Circle(5.0,"blue",false);
		c1.getArea();
		c1.getPerimeter();
		System.out.println(c1);
	}
}
