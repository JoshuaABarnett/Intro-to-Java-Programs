/*This program reads the subtotal and the gratuity rate, then computes the gratuity and total.
 */
import java.util.Scanner;
public class TipCalculator {

	public static void main(String[] args) {
		
		double subtotal;
		// Create a scanner to read in data
		Scanner myscan = new Scanner(System.in);
		
		// prompt user for subtotal
		System.out.print("Please enter subtotal :");
		subtotal = myscan.nextDouble();
		double gratuity;
		
		// prompt user for gratuity
		System.out.print("Please enter gratuity :");
		gratuity = myscan.nextDouble();
		
		double Tip = (subtotal * gratuity * .01);
		double Total = Tip + subtotal ;
		System.out.println("Tip is: " + Tip);
		System.out.println("Total is: " + Total);
	}

}