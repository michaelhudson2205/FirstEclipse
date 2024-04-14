package section11;

public class ShapeDriver
{

	public static void main(String[] args)
	{
		Square sq1 = new Square();
		Square sq2 = new Square("napkin", "blue", 5);
		Circle c1 = new Circle();
		Circle c2 = new Circle("plate", "red", 3);
		
		System.out.println(sq1);
		System.out.println("====================");
		System.out.println(sq2);
		System.out.println("====================");
		System.out.println(c1);
		System.out.println("====================");
		System.out.println(c2);
		
	}

}
