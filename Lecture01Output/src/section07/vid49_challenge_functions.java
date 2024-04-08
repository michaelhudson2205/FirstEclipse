package section07;

public class vid49_challenge_functions
{

	public static void main(String[] args)
	{
		double fTemperature = 75;
		System.out.printf("F " + fTemperature + " is %.2f Celsius.\n", F2C(fTemperature));

		double cTemperature = 37.78;
		System.out.printf("Celsius " + cTemperature + " is %.2f F.\n", C2F(cTemperature));
		
		double someNum = 81;
		System.out.printf("The fourth root of " + someNum + " is %.4f, to four decimal places.", FourthRoot(someNum));

	} // >>>>> end of psvm
	
	static double F2C(double F)
	{
		double celsiusResult = (5.0 / 9) * (F - 32);
		return celsiusResult;
	} // >>>>> end of F2C

	static double C2F(double C)
	{
		double fahrenheitResult = (9.0 / 5 * C) + 32;
		return fahrenheitResult;
	} // >>>>> end of C2F
	
	static double FourthRoot(double num)
	{
		double fRoot = Math.sqrt(Math.sqrt(num));
		return fRoot;
	} // >>>>> end of FourthRoot

} // >>>>> end of class
