package section09;

import java.util.Iterator;

public class vid62_arrays
{

	public static void main(String[] args)
	{
		/*
		 * // track test scores int [] scores1 = {90, 72, 80, 95, 88, 79}; // traverse
		 * for (int i = 0; i < scores1.length; i++) { System.out.println(scores1[i]); }
		 * 
		 * System.out.println("Scores2 Array:"); int [] scores2 = new int[5]; scores2[3]
		 * = 44; for (int i = 0; i < scores2.length; i++) { System.out.println("Sub: " +
		 * i + " Value " + scores2[i]); }
		 * 
		 * int [] scores3; scores3 = new int[] {77, 88, 96, 75, 92}; for (int i = 0; i <
		 * scores3.length; i++) { System.out.println("Sub: " + i + " Value " +
		 * scores3[i]); }
		 * 
		 * int counter = 0; int sum = 0; for (int i = 0; i < scores3.length; i++) {
		 * System.out.println("Sub: " + i + " Value " + scores3[i]); sum+= scores3[i];
		 * counter++; } System.out.println("The sum of the elements of the array is " +
		 * sum); System.out.println("This loop ran " + counter + " times."); double
		 * average = (double) sum / counter; System.out.println("The average is " +
		 * average);
		 * 
		 * // "for each" loop counter = 0; sum = 0; for (int grade : scores3) {
		 * System.out.println(grade); sum += grade; counter++; }
		 * System.out.println("This time the sum of the elements of the array is " +
		 * sum); average = (double) sum / counter;
		 * System.out.println("This time the average is " + average);
		 * 
		 * System.out.println("The elements in scores3 are: " + scores3);
		 */

		// Two dimensional array: Matrix
		/*
		 * int[][] matrix1 = new int[3][4]; int[][] matrix2 = { { 91, 82, 93, 84 }, {
		 * 74, 75, 86, 84 }, { 70, 89, 92, 99 } };
		 * 
		 * for (int row = 0; row < matrix2.length; row++) { for (int col = 0; col <
		 * matrix2[0].length; col++) { System.out.print(matrix2[row][col] + " "); }
		 * System.out.println(); }
		 */

		// Jagged Arrays
		/*
		 * int[][] jagged = { { 91, 82, 93, 84, 99, 99, 99 }, { 74, 75, 86, 84 }, { 70,
		 * 89, 92, 99, 90 } };
		 * 
		 * for (int row = 0; row < jagged.length; row++) { for (int col = 0; col <
		 * jagged[row].length; col++) { System.out.print(jagged[row][col] + " "); }
		 * System.out.println(); }
		 */
		
		
//		int [] someNums = {2, 4, 6, 8, 10, 121};
//		PrintArray(someNums);
//		System.out.println("\nDone");
//		System.out.printf("%.2f\n", GetAverage(someNums));
//		PrintArray(DoubleArray(someNums));
//		System.out.println("\nDoubled!");
//		int [] dubNums = DoubleArray(someNums);
//		PrintArray(dubNums);
//		System.out.println("\nStill Doubled!");
		
		// String methods with array
		String name1 = "Jackson";
		String name2 = new String("ville");
		String name3 = name1 + name2;
		System.out.println(name3);
		char [] charName = {'S', 'm', 'i', 't', 'h'};
		String name4 = new String(charName);
		System.out.println(name4);
		char [] charList = name3.toCharArray();
		for (char letter : charList)
		{
			System.out.print(letter + " ");
		}
		
		

	} // >>>>>>>>>>end of psvm
	
	public static void PrintArray(int [] nums)
	{
		for (int val : nums)
		{
			System.out.print(val + " ");
		}
	} // >>>>>>>>>>end of PrintArray
	
	public static double GetAverage(int [] nums)
	{
		int sum = 0;
		for (int i : nums)
		{
			sum += i;
		}
		return (double) sum / nums.length;
	} // >>>>>>>>>>end of GetAverage
	
	public static int [] DoubleArray(int [] nums)
	{
		int [] newArray = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
		{
			newArray[i] = nums[i] * 2;
		}
		return newArray;
	}

} // >>>>>>>>>>end of class
