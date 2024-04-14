package section11;

public class Circle extends Shape2d
{
	public Circle()
	{
		super();
	}
	
	public Circle(String name, String color, double radius)
	{
		super(name, color, radius);
	}
	
	// Circumference
	// Diameter
	// Area
	
	public double GetCircumference()
	{
		return 2 * Math.PI * GetRadius();
	}
	
	public double GetRadius()
	{
		return getSide();
	}
	
	public double GetDiameter()
	{
		return 2 * GetRadius();
	}
	
	public double GetArea()
	{
		return Math.PI * GetRadius() * GetRadius();
	}
	
	@Override
	public String toString()
	{
		String output = super.toString();
		output += "\nfrom Circle (child class): Circumference: " + GetCircumference() + ", Diameter: " + GetDiameter() + ", Area: " + GetArea();
		return output;
	}
}
