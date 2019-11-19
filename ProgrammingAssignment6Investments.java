/*
 * Joshua Barnett
 * Professor Chang
 * Comp 171
 * Lab Assignment 6
 */
import java.util.Scanner;

public class ProgrammingAssignment6Investments {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double investmentAmount;
		double yearlyInterestRate;
		
		// Create a Scanner to read in data
		Scanner input = new Scanner(System.in);
		
		// prompt user for investment amount
		System.out.print("Please enter investment amount: ");
		investmentAmount = input.nextDouble();
		// prompt user for annual interest rate
		System.out.print("Please enter annual interest rate in percentage: ");
		yearlyInterestRate = input.nextDouble();
		
		// Obtain monthly interest rate
		double monthlyInterestRate = yearlyInterestRate / 1200;
		
		// Print table that displays future value years 1 to 30
		System.out.println("Years     Future Value");
		for (int years = 1; years <= 30; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
		}
	}
	// Method to compute future investment value
		public static double futureInvestmentValue(
		double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	
		}
		}
