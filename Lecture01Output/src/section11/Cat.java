package section11;

public class Cat
{
	// attributes
	private String breed;
	private int age;
	private double weight;
	private boolean isLongHair;
	
	public String getBreed()
	{
		return breed;
	}
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public boolean isLongHair()
	{
		return isLongHair;
	}
	public void setLongHair(boolean isLongHair)
	{
		this.isLongHair = isLongHair;
	}
	
	public void getInfo()
	{
		System.out.println("Breed    : " + breed +
				"\nAge      : " + age +
				"\nWeight   : " + weight +
				"\nLong Hair? " + isLongHair);
	}
	
	@Override
	public String toString()
	{
		return "Breed    : " + breed +
				"\nAge      : " + age +
				"\nWeight   : " + weight +
				"\nLong Hair? " + isLongHair;
	}
	
} // ==========end of class Cat==========
