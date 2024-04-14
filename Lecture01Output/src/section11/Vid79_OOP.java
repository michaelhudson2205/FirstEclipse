package section11;

public class Vid79_OOP
{

	public static void main(String[] args)
	{
		Cat fluffy = new Cat();
		fluffy.setBreed("Persian");
		fluffy.setAge(5);
		fluffy.setWeight(21.5);
		fluffy.setLongHair(true);
		
		Cat mittens = new Cat();
		mittens.setBreed("Domestic Shorthair");
		mittens.setAge(2);
		mittens.setWeight(12.2);
		mittens.setLongHair(false);
		
		System.out.println("Fluffy's breed = " + fluffy.getBreed());
		fluffy.setBreed("Himalayan");
		System.out.println("Fluffy's breed = " + fluffy.getBreed());
		fluffy.getInfo();
		System.out.println("====================");
		System.out.println(fluffy);
		
	}

}
