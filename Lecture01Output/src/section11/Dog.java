package section11;

public class Dog
{
	private String breed;
	private String speak;
	
	// default constructor n.b. no return type
	public Dog()
	{
		breed = "Unknown";
		speak = "Woof";
	}
	
	public Dog(String breed, String speak)
	{
		this.breed = breed;
		this.speak = speak;
	}
	
	public String getBreed()
	{
		return breed;
	}

	public String getSpeak()
	{
		return speak;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	public void setSpeak(String speak)
	{
		this.speak = speak;
	}

	@Override
	public String toString()
	{
		return "Dog info: " + 
				"\nBreed = " + breed +
				"\nSound = " + speak;
	}
	
}
