/*
 * Joshua Barnett
 * Professor Chang
 * Comp 171
 * Lab Assignment 5
 */
import java.util.Scanner;

public class ProgrammingAssignment5Loans {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double loanAmount;
		int numberOfYears;
		double i;
		
		//Create Scanner
		Scanner myscan = new Scanner(System.in);
		
		//Prompt user to input Loan Amount
		System.out.print("Please enter loan amount ex: 10000 ");
		loanAmount = myscan.nextDouble();
		
		//Prompt user to input Number of Years
		System.out.print("Please enter number of years: ");
		numberOfYears = myscan.nextInt();
			
		// Enter annual interest start rate
		double annualInterestRate = 5.0;
		
		//Print table header
		System.out.printf("%-18s%-18s%-18s\n", "Interest Rate", "Monthly Payment", "Total Payment");
		
		while (annualInterestRate <= 8.0) {
		//Calculate monthly interest rate
		
		    double monthlyInterestRate = annualInterestRate / 1200;
		    
		    // Calculate payment
		    double monthlyPayment = loanAmount * monthlyInterestRate / (1
		      - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		    double totalPayment = monthlyPayment * numberOfYears * 12;

		    // Display results
		    System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInterestRate, monthlyPayment, totalPayment);
		    
		    annualInterestRate = annualInterestRate +1.0 / 8;
		  }
		
		}
}