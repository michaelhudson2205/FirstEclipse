package section09;

public class Vid70_challenge_arrays
{

	public static void main(String[] args)
	{
		int [] numbers = {3, 11, -10, 167, 2, 88, 999};
		PrintArray(ReverseArray(numbers));
		System.out.println("\nThe maximum value is: " + MaxValue(numbers));
		System.out.println(GetMaxLetter("Shakeszpeare"));
		
		
	} // >>>>>>>>>>end of psvm
	
	public static void PrintArray(int [] nums)
	{
		for (int val : nums)
		{
			System.out.print(val + " ");
		}
	} // >>>>>>>>>>end of PrintArray
	
	public static int [] ReverseArray(int [] nums)
	{
		int [] newArray = new int[nums.length];
		int j = nums.length -1;
		for (int i = 0; i < nums.length; i++)
		{
			newArray[i] = nums[j];
			j--;
		}
		return newArray;
	} // >>>>>>>>>>end of ReverseArray
	
	public static int MaxValue(int [] nums)
	{
		int maxValue = nums[0];
		for (int i = 0; i < nums.length - 1; i++)
		{
			if(nums[i + 1] > maxValue)
			{
				maxValue = nums[i + 1];
			}
		}
		return maxValue;
	} // >>>>>>>>>>end of MaxValue
	
	public static char GetMaxLetter(String word)
	{
		char [] letters = word.toCharArray();
		char max = letters[0];
		for (char ltr : letters)
		{
			if(ltr > max)
			{
				max = ltr;
			}
		}
		return max;
	} // >>>>>>>>>>end of GetMaxLetters

} // >>>>>>>>>>end of class
