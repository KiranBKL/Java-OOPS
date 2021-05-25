class Shape
{
	public void numberOfSides()
	{
		System.out.println("Based on Input");
	}
}
class Trapezoid extends Shape
{
	public void numberOfSides()
	{
		System.out.println("Trapezoid has 4 sides");
	}
}
class Triangle extends Shape
{
	public void numberOfSides()
	{
		System.out.println("Triangle has 3 sides");
	}
}
class Hexagon extends Shape
{
	public void numberOfSides()
	{
		System.out.println("Hexagon has 6 sides");
	}
}
class Sides
{
	public static void main(String args[])
	{
		Trapezoid tr=new Trapezoid();
		tr.numberOfSides();
		Triangle tg=new Triangle();
		tg.numberOfSides();
		Hexagon he=new Hexagon();
		he.numberOfSides();
	}
}
