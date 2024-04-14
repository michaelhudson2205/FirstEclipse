package section11;

public class Shape2d
{
	private String name;
	private String color;
	private double side;
	
	public Shape2d()
	{
		name = "No Name";
		color = "Unknown";
		side = 1;
	}
	
	public Shape2d(String name, String color, double side)
	{
		this.name = name;
		this.color = color;
		this.side = side;
	}

	public String getName()
	{
		return name;
	}

	public String getColor()
	{
		return color;
	}

	public double getSide()
	{
		return side;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public void setSide(double side)
	{
		this.side = side;
	}

	@Override
	public String toString()
	{
		return "from the Shape2d (parent class): " + name + ", color = " + color + ", side=" + side;
	}
	
	
	
}
