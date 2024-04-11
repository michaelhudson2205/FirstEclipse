package section08;

public class vid60_challenge_strings
{

	public static void main(String[] args)
	{
		String phrase3 = "To be, or not to be: #Hamlet Act 3, Scene 1";
		System.out.println(RemoveSpaces(phrase3));
		System.out.println(KeepLetters(phrase3));
		System.out.println(Reverse(phrase3));

	} // >>>>>>>>>>end of psvm
	
	static String RemoveSpaces(String input)
	{
		String temp = "";
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) != ' ')
			{
				temp += input.charAt(i);
			}
		}
		return temp;
	} // >>>>>>>>>>end of RemoveSpaces
	
	static String KeepLetters(String input)
	{
		String temp = "";
		for (int i = 0; i < input.length(); i++)
		{
			if (input.toUpperCase().charAt(i) >= 'A'&& input.toUpperCase().charAt(i) <= 'Z')
			{
				temp += input.charAt(i);
			}
		}
		return temp;
	} // >>>>>>>>>>end of KeepLetters
	
	static String Reverse(String input)
	{
		String temp = "";
		for (int i = input.length() - 1; i >= 0; i--)
		{
			temp += input.charAt(i);
			// Or could use temp += input.substring(i, i + 1);
		}
		return temp;
	} // >>>>>>>>>>end of Reverse

} // >>>>>>>>>>end of class
