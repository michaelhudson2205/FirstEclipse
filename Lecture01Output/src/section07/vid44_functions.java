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
		System.out.println(iNumDoubled);

	}
	
	static int doubler(int num)
	{
		int temp;
		temp = num * 2;
		return temp;
	}

}
























