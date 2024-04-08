package section07;

public class vid44_functions
{

	public static void main(String[] args)
	{
//		int iNum;
//		iNum = 7;
//		int iNumDoubled;
////		iNumDoubled = iNum * 2;
//		iNumDoubled = doubler(iNum);
////		System.out.println(iNumDoubled);
//		System.out.println("Where is my Git history?");
//		int num1, num2, num3;
//		num1 = 16213;
//		num2 = 4123;
//		num3 = 1723;
//		int maxNum = findMax(num1, num2);
//		System.out.println(maxNum);
//		int maxNum3 = findMax3(num1, num3, num2);
//		System.out.println(maxNum3);
//		int newMax;
//		newMax = findMax(findMax(num1, num2), num3);
//		System.out.println(newMax);
//		double dNum1 = 7.4;
//		double dNum2 = 3.19;
//		System.out.println(findMaxDouble(dNum1, dNum2));
		
//		double mathNum = 45.17;
//		double result = Math.sqrt(mathNum);
//		System.out.println("The square root of " + mathNum + " is " + result);
		
		// Subroutines and Functions
		Greeting();
		Greeting("Greg");
		
		
		
		
	} // End psvm
	
	static void Greeting()
	{
		System.out.println("Welcome!");
	}

	static void Greeting(String name)
	{
		System.out.println("Hello " + name);
	}
	
	static double findMaxDouble(double d1, double d2)
	{
		if(d1 >= d2)
		{
			return d1;
		}
		else
		{
			return d2;
		}
	} // End findMaxDouble
	
	static int doubler(int num)
	{
		int temp;
		temp = num * 2;
		return temp;
	} // End doubler
	
	static int findMax(int n1, int n2)
	{
		if(n1 >= n2)
		{
			return n1;
		}
		else
		{
			return n2;
		}
	} // End findMax
	
	static int findMax3(int n1, int n2, int n3)
	{
//		if(n1 >= n2 && n1 >= n3)
//		{
//			return n1;
//		}
//		else if(n2 >= n1 && n2 >= n3)
//		{
//			return n2;
//		}
//		else
//		{
//			return n3;
//		}
		int max = n1; //assume n1 is the max
		if(n2 > max)
		{
			max = n2;
		}
		if(n3 > max)
		{
			max = n3;
		}
		return max;
	} // End findMax3

}
























