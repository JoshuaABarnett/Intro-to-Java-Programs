/* Program calculates and displays future investment value based on user provided investment amount, annual interest rate, and number of years.
 */
import java.util.Scanner;
public class FutureInvestmentValue {

	public static void main(String[] args) {
		
		double investmentAmount;
		// Create a Scanner to read in data
		Scanner myscan = new Scanner(System.in);
		
		// prompt user for investment amount
		System.out.print("Please enter investment amount: ");
		investmentAmount = myscan.nextDouble();
		
		double yearlyInterestRate;
		// prompt user for annual interest rate
		System.out.print("Please enter annual interest rate in percentage: ");
		yearlyInterestRate = myscan.nextDouble();
		
		double numberOfYears;
		// prompt user for number of years of investment
		System.out.print("Please enter number of years of investment: ");
		numberOfYears = myscan.nextDouble();
		double futureInvestmentValue = investmentAmount * Math.pow(1 + yearlyInterestRate / 100,numberOfYears);
	System.out.println( "Future investment value is $" + futureInvestmentValue);
	}

}
