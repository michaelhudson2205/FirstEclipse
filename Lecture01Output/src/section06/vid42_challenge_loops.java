package section06;

import java.util.Scanner;

public class vid42_challenge_loops
{

	public static void main(String[] args)
	{
		int startNum, stopNum, skipNum;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start value: ");
		startNum = sc.nextInt();
		System.out.print("Enter the stop value: ");
		stopNum = sc.nextInt();
		System.out.print("Enter the skip value: ");
		skipNum = sc.nextInt();
		System.out.println();
		
		//=====================================================================
		for(int i = startNum; i <= stopNum; i += skipNum)
		{
			System.out.println("for loop returns: " + i);
		}
		
		//=====================================================================
		int j = startNum;
		String outcome;
		while(j <= stopNum)
		{
			System.out.println(j % 5 != 0 ? "while loop: " + j : 
				"while loop: I dont print anything divisible by 5");
			j++;
		}
		
		//=====================================================================
		int k = startNum;
		do
		{
			if((k % 5 != 0) && (k % 7 != 0))
			{
				System.out.println("do-while loop: " + k);
			}
			else
			{
				System.out.println("this do-while loop doesn't print "
						+ "anything divisible by 5 0r 7");
			}
			k += skipNum;
		} while (k <= stopNum);
		

	}

}
