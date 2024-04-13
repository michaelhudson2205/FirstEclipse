package section10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vid72_Exception_Handling
{
	public static void main(String[] args)
	{
		// Run time errors
//		ArithmeticException *
//		NullPointerException *
//		IndexOutOfBoundsException *
//		ArrayIndexOutOfBoundsException *
//		IllegalArgumentException *
//		InputMismatchException
		
		Scanner scn = new Scanner(System.in);
		int age = 45;
		int num;
		int [] numbers = new int[5];
		
		try
		{
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		if(num < 0)
		{
			throw new IllegalArgumentException("Too low");
		}
		int recip = 1/ num;
		System.out.println("The reciprocal is " + recip);
		String temp = null;
//		System.out.println(temp.charAt(3));
		String word = "java";
//		System.out.println(word.charAt(num));
		numbers[num] = num;
		}
		catch(ArithmeticException aex)
		{
			System.err.println("Something went wrong Mike: aex");
			System.err.println(aex.getMessage());
		}
		catch(NullPointerException npex)
		{
			System.err.println("Something went wrong Mike: npex");
			System.err.println(npex.getMessage());
		}
//		catch(IndexOutOfBoundsException ioobex)
//		{
//			System.err.println("Something went wrong Mike: ioobex");
//			System.err.println(ioobex.getMessage());
//		}
		catch(ArrayIndexOutOfBoundsException aioobex)
		{
			System.err.println("Something went wrong Mike: aioobex");
			System.err.println(aioobex.getMessage());
		}
		catch(InputMismatchException immex)
		{
			System.err.println("Something went wrong Mike: immex");
			System.err.println(immex.getMessage());
		}
		catch(Exception ex)
		{
			System.err.println("Something went wrong Mike.");
			System.err.println(ex.getMessage());
		}
		finally
		{
			System.out.println("We finally got here");
		}
		
		
		
		
	} // >>>>>>>>>>end of psvm
} // >>>>>>>>>>end of class
