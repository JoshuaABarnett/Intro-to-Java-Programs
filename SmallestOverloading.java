import java.util.Scanner;

public class SmallestOverloading {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double i1, i2, i3;
		double smallest;

		System.out.print("Please enter first of 3 double numbers: ");
		i1 = input.nextDouble();

		System.out.print("Please enter second of 3 double numbers: ");
		i2 = input.nextDouble();

		System.out.print("Please enter third of 3 double numbers: ");
		i3 = input.nextDouble();

		smallest = smallest(i1, i2, i3);

		System.out.println("smallest number of " + i1 + ", " + i2 + ", " + i3 + " is " + smallest);

	}

	public static int smallest(int num1, int num2, int num3) {

		if (num1 < num2)
			return (num1 < num3) ? num1 : num3;
		else
			return (num2 < num3) ? num2 : num3;

	}

	
/* overloading method 
 
	public static double smallest(double num1, double num2, double num3) {

	
	}

*/

}