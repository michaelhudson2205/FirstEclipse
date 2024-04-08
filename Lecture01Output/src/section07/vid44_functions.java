package section07;

public class vid44_functions
{

	public static void main(String[] args)
	{
		int iNum;
		iNum = 7;
		int iNumDoubled;
//		iNumDoubled = iNum * 2;
		iNumDoubled = doubler(iNum);
//		System.out.println(iNumDoubled);
		System.out.println("Where is my Git history?");
		int num1, num2, num3;
		num1 = 16213;
		num2 = 4123;
		num3 = 1723;
		int maxNum = findMax(num1, num2);
		System.out.println(maxNum);
		int maxNum3 = findMax3(num1, num3, num2);
		System.out.println(maxNum3);
		int newMax;
		newMax = findMax(findMax(num1, num2), num3);
		System.out.println(newMax);

	}
	
	static int doubler(int num)
	{
		int temp;
		temp = num * 2;
		return temp;
	}
	
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
	}
	
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
	}

}
























