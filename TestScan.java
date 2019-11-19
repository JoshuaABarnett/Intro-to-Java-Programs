/*
A program to try some methods from the Scanner class
The program can read text and numbers from the screen.

*/

import java.util.Scanner;

public class TestScan
{
	public static void main (String args[])
	{
		String yourname;
		int yourage;
		// Create a Scanner to read in data
		Scanner myscan = new Scanner(System.in);
		
		// prompt user for their name
		System.out.print("Enter your name ");
		yourname = myscan.next();

		// Now prompt for age
		System.out.print("enter your age ");
		yourage = myscan.nextInt(); // convert the String to a number
		System.out.println(" ");

		// Show the results by formatting the output
		System.out.printf( "%s you are %d years old \n", yourname, yourage);

		
	}
}