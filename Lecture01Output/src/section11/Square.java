package section11;

public class Square extends Shape2d
{
	public Square()
	{
		super();
	}
	
	public Square(String name, String color, double side)
	{
		super(name, color, side);
	}
	
	// Perimter, Area
	public double GetPerimeter()
	{
		return getSide() * 4;
	}
	
	public double GetArea()
	{
		return getSide() * getSide();
	}
	
	@Override
	public String toString()
	{
		String output = super.toString();
		output += "\nfrom Square (child class): Perimeter: " + GetPerimeter() + ", Area: " + GetArea();
		return output;
	}
}
