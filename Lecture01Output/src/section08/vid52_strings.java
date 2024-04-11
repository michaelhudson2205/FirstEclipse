package section08;

import java.util.Iterator;

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
		
//		String word1 = "Hello";
//		String word2 = new String("Hello");
//		if(word1 == word2)
//		{
//			System.out.println("They are == equal");
//		}
//		else
//		{
//			System.out.println("They are NOT == equal");
//		}
//		
//		if(word1.equals(word2))
//		{
//			System.out.println("They are .equals equal");
//		}
//		else
//		{
//			System.out.println("They are NOT .equals equal");
//		}
//		
//		String name = "Steinway";
//		System.out.println(name.contains("way"));
//		System.out.println(name.contains("stein"));
//		System.out.println(name.toUpperCase().contains("stein".toUpperCase()));
		
//		String phrase = "It was a dark and stormy night";
//		String city   = "Salt Lake City";
//		String guide  = "012345678901234567890123456789";
//		System.out.println(phrase.length());
//		System.out.println(phrase.substring(3));
//		System.out.println(phrase.substring(3, 6));
//		System.out.println("At 29: " + phrase.substring(29));
//		
//		for (int i = 0; i < phrase.length(); i++)
//		{
//			if(!phrase.substring(i, i+1).equals("a"))
//			{
//				System.out.println(phrase.substring(i, i+1));
//			}
//		}
//		
//		String newCity = "";
//		newCity = city.substring(0, 4);
//		System.out.println(newCity);
//		newCity += " " + city.substring(10);
//		System.out.println(newCity);
		
//		String phrase1 = "Abracadabra";
//		String phrase2 = "abracadabra";
		
//		String phrase2 = "Presto";
//		String guide  = "012345678901234567890123456789";
//		System.out.println(phrase1.length());
//		System.out.println(phrase1.compareTo(phrase2));
//		
//		if(phrase1.compareToIgnoreCase(phrase2) < 0)
//		{
//			System.out.println(phrase1 + " comes before " + phrase2);
//		}
//		else if(phrase1.compareToIgnoreCase(phrase2) > 0)
//		{
//			System.out.println(phrase1 + " comes after " + phrase2);
//		}
//		else
//		{
//			System.out.println("They're equal.");
//		}
		
//		System.out.println(phrase1);
//		System.out.println(guide);
//		System.out.println(phrase1.charAt(4));
//		System.out.println(phrase1.indexOf('d'));
//		System.out.println(phrase1.indexOf('a'));
//		System.out.println(phrase1.lastIndexOf('a'));
//		char charLetter = phrase1.charAt(0);
//		System.out.println("charLetter = " + charLetter);
//		if (charLetter >= 'a' && charLetter <= 'z')
//		{
//			System.out.println("It's a lowercase letter");
//		}
//		else
//		{
//			System.out.println("It's uppercase, number, or special character.");
//		}
		
		System.out.println("Strings in functions");
		String phrase1 = "Abracadabra@";
		String guide  = "012345678901234567890123456789";
		System.out.println(phrase1);
		System.out.println(guide);
		// skip the even positions
//		String temp = "";
//		for (int i = 0; i < phrase1.length(); i+=2)
//		{
//			temp += phrase1.charAt(i);
//		}
//		System.out.println(temp);
		System.out.println("= " + KeepEvens(phrase1));
		// start at the end, and skip by 2 to the beginning
		System.out.println("= " + SkipBack(phrase1));
		
		System.out.println(RemoveAtPosition(phrase1, 11));
		
		
		
		
		
		
		} // End of psvm
	
	static String KeepEvens(String s)
	{
		String temp = "";
		for (int i = 0; i < s.length(); i+=2)
		{
			temp += s.charAt(i);
		}
		return temp;
	} // End of KeepEvens
	
	static String SkipBack(String s)
	{
		String temp = "";
		for (int i = s.length()-1; i >= 0; i-=2)
		{
			temp += s.charAt(i);
		}
		return temp;
	} // End of SkipBack
	
	static String RemoveAtPosition(String s, int num)
	{
		String partA = "";
		String partB = "";
		for (int i = 0; i < num; i++)
		{
			partA += s.charAt(i);
		}
		for (int j = num + 1; j < s.length(); j++)
		{
			partB += s.charAt(j);
		}
		return partA + partB;
	} // End of RemoveAtPosition

} // End of class
