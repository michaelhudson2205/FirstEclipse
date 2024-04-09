package section08;

public class vid52_strings
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
//		String word = "Hello, World!";
//		String word1 = " ";
//		System.out.println(word);
//		System.out.println(word.length());
//		System.out.println(word.toUpperCase());
//		System.out.println(word);
//		
//		word = word.toUpperCase();
//		System.out.println(word);
//		System.out.println(word.isEmpty());
//		System.out.println(word1.isEmpty());
//		System.out.println(word1.isBlank());
		
		String word1 = "Hello";
		String word2 = new String("Hello");
		if(word1 == word2)
		{
			System.out.println("They are == equal");
		}
		else
		{
			System.out.println("They are NOT == equal");
		}
		
		if(word1.equals(word2))
		{
			System.out.println("They are .equals equal");
		}
		else
		{
			System.out.println("They are NOT .equals equal");
		}
		
		String name = "Steinway";
		System.out.println(name.contains("way"));
		System.out.println(name.contains("stein"));
		System.out.println(name.toUpperCase().contains("stein".toUpperCase()));
		
	} // End of psvm

} // End of class
