package section04;

import javax.swing.JOptionPane;

public class vid19_challenge
{

	public static void main(String[] args)
	{
		String dogBreed, colour, dwarfName;
		int num1;
		
		dogBreed = JOptionPane.showInputDialog("Enter a breed of dog:");
		colour = JOptionPane.showInputDialog("Enter a colour:");
		dwarfName = JOptionPane.showInputDialog("Enter a dwarf name:");
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number greater than 1:"));
		
		System.out.println("Once upon a time there was a " + dogBreed + " who");
		System.out.println("had a " + dwarfName + " Owner.");
		System.out.println("He lived in a house with a " + colour + " cat who only");
		System.out.println("had " + num1 + " lives left, but really wanted");
		System.out.println((num1 + 1) + " lives...");
		
	}
}