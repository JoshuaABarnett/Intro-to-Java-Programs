/* A program to convert a teperature input from Celcius to Fahrenheit.
*/

import java.util.Scanner;
public class TemperatureConversion {

	public static void main (String[] args) {

		double celsius;
		// Create a Scanner to read in data
		Scanner myscan = new Scanner(System.in);

		// prompt user for temperature in Celsius
		System.out.print("Please enter temperature in Celsius :");
		celsius = myscan.nextDouble();

		double Fahrenheit = (9.0/5.0) * celsius + 32;
		System.out.println( "Temperature in Fahrenheit is : " + Fahrenheit);
	}
}
