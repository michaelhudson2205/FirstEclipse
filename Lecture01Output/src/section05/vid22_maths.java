package section05;

import java.util.Scanner;

public class vid22_maths
{

	public static void main(String[] args)
	{
//		double num1, num2, sum, diff, prod, quot;
//		num1 = 10;
//		num2 = 3;
//		sum = num1 + num2;
//		diff = num1 - num2;
//		prod = num1 * num2;
//		quot = num1 / num2;
//		System.out.println("The sum is " + sum);
//		System.out.println("The difference is " + diff);
//		System.out.println("The product is " + prod);
//		System.out.println("The quotient is " + quot);
		
//		double C, F;
//		F = 50;
//		C = (5.0/9)*(F-32);
//		System.out.println("Conversion: " + F + "F = " + C + "C");
		
//		int num1, num2, sum, diff, prod, quot;
//		num1 = 10;
//		num2 = 3;
//		sum = num1 + num2;
//		diff = num1 - num2;
//		prod = num1 * num2;
//		quot = num1 / num2;
//		System.out.println("num1 is " + num1);
//		System.out.println("num2 is " + num2);
//		num1 = num1 + 4; // accumulator
//		System.out.println("num1 is " + num1);
//		num1 = num1 + 1; // counter
//		System.out.println("num1 is " + num1);
//		num2 = 5 * 6 / 3 * 2;
//		System.out.println("num2 is " + num2);
//		num2 = (5 * 6) / (3 * 2);
//		System.out.println("num2 is " + num2);
		
//		int x;
//		x = 8;
//		System.out.println(x);
//		x = x + 1;
//		System.out.println(x);
//		x += 4;
//		System.out.println(x);
//		x += 1;
//		System.out.println(x);
//		x++;
//		System.out.println(x);
		
//		x--;
//		System.out.println(x);
//		--x;
//		System.out.println(x);
//		System.out.println(x--);
//		System.out.println(x);
//		System.out.println(--x);
		
//		int num1;
//		num1 = 18;
//		num1 += 6;
//		System.out.println(num1);
//		num1 -= 4;
//		System.out.println(num1);
//		num1 *= 3;
//		System.out.println(num1);
//		num1 /= 4;
//		System.out.println(num1);
		
//		int num1, num2;
//		System.out.println("The modulus operator");
//		// 17 / 12 remainder = 5
//		num1 = 17;
//		num2 = num1 % 3;
//		System.out.println(num2);
//		num1 = 19;
//		num2 = num1 % 2;
//		System.out.println("19 % 2 = " + num2);
//		num1 = 20;
//		num2 = num1 % 2;
//		System.out.println(num1 + " % 2 = " + num2);
		
//		int value1, value2;
//		value1 = 9;
//		value2 = 9;
//		if(value1 == value2) 
//		{
//			System.out.println(value1 + " == " + value2);
//		}
//		if(value1 != value2)
//		{
//			System.out.println(value1 + " != " + value2);
//		}
//		if(value1 < value2)
//		{
//			System.out.println(value1 + " < " + value2);
//		}
//		if(value1 <= value2)
//		{
//			System.out.println(value1 + " <= " + value2);
//		}
//		if(value1 > value2)
//		{
//			System.out.println(value1 + " > " + value2);
//		}
//		if(value1 >= value2)
//		{
//			System.out.println(value1 + " >= " + value2);
//		}
		
//		int cashOnHand = 2;
//		if (cashOnHand >= 5)
//		{
//			System.out.println("You can continue shopping");
//			System.out.println("Have fun");
//		}
//		else
//		{
//			System.out.println("You don't have enough cash");
//		}
		
		// Ternary Operator
		// PREDICATE ? (True, do this) : (False, do this)
//		String outcome;
//		int cashOnHand = 22;
//		outcome = (cashOnHand >= 5) ? "Go shop" : "Stay Home";
//		System.out.println(outcome);
		
//		String gradeLetter;
//		double grade = 50;
//		if(grade > 60)
//		{
//			gradeLetter = "D";
//		}
//		else
//		{
//			gradeLetter = "F";
//		}
//		System.out.println(gradeLetter);
		
//		if(grade >= 90)
//		{
//			gradeLetter = "A";
//		}
//		else if(grade >= 80)
//		{
//			gradeLetter = "B";
//		}
//		else if(grade >= 70)
//		{
//			gradeLetter = "C";
//		}
//		else if(grade >= 60)
//		{
//			gradeLetter = "D";
//		}
//		else
//		{
//			gradeLetter = "F";
//		}
//		System.out.println(gradeLetter);
		
		// Logical Operators / Logical Connectors
//		double a1, b1, c1, d1;
//		a1 = b1 = c1 = d1 = 10;
//		if(a1 <= b1 && c1 >= d1) // Logical AND -> &&
//		{
//			System.out.println("Yes! &&");
//		}
//		
//		if(b1 < c1 || a1 * 2 >= 10) // Logical OR -> ||
//		{
//			System.out.println("Yes! ||");
//		}
//		
//		// Logical NOT -> ! e.g. !=
//		if(!(b1 < c1 || a1 * 2 >= 10)) // Logical OR -> ||
//		{
//			System.out.println("Yes! ||");
//		}
//		else
//		{
//			System.out.println("No! ||");
//		}
//		
//		if((b1 >= c1 && a1 * 2 < 10)) // Logical OR -> ||
//		{
//			System.out.println("Yes! ||");
//		}
//		else
//		{
//			System.out.println("No! ||");
//		}
		
//		double outsideTemp = -2;
//		double objectTemp = 5;
//		double dewPoint = -1;
//		
//		if(dewPoint <= 0 && outsideTemp <= dewPoint && objectTemp < 2.2)
//		{
//			System.out.println("Frost will form.");
//		}
//		else
//		{
//			System.out.println("Frost will not form.");
//		}
		
//		int age = 10;
//		double height = 49;
//		boolean IsWithParent = false;
//		
//		if((age >= 12 || IsWithParent) && height >= 48)
//		{
//			System.out.println("Can ride. Have fun.");
//		}
//		else
//		{
//			System.out.println("Sorry, you can't go on the ride.");
//		}
		
		// Leap Year Checker
		int year;
		
		Scanner scanData = new Scanner(System.in);
		System.out.print("Enter a four digit year: ");
		year = scanData.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			System.out.println("The year " + year + " is a leap year.");
		}
		else
		{
			System.out.println("The year " + year + " is NOT a leap year.");
		}

	}

}
