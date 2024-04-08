package section06;

public class vid38_loops
{

	public static void main(String[] args)
	{
//		for(int i = 0; i <= 10; i++)
//		{
//			System.out.println(i + ". Hello");
//		}
//		
//		// a countdown
//		for(int j = 10; j >=0; j--)
//		{
//			System.out.println("Countdown: " + j);
//		}
//		
//		for(int sardine = 10; sardine <= 200; sardine += 15)
//		{
//			System.out.println("Here's your sardine: " + sardine);
//		}
		
		int i = 0;
		int j = 0;
		int count = 0;
		while(i < 200)
		{
			j++;
			System.out.println("i = " + i);
			System.out.println("\tj = " + j);
//			i++;
			i += 7;
			count++;
		}
		System.out.println("This loop ran " + count + " times.");

	}

}
