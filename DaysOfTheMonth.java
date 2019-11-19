/*Joshua Barnett
 * Professor Chang
 * Comp 171
 * Lab Assignment 3
 * 
 */
import java.util.Scanner;
public class DaysOfTheMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int month;
//Create Scanner to ask user for month
		Scanner myscan = new Scanner(System.in);
		System.out.print("Please enter month as a number (ex: March, input 3) : ");
		month = myscan.nextInt();
int year;
// Ask user for year
	System.out.print("Please enter year as a number (ex: 1999) : ");
	year = myscan.nextInt();
	
int daysInMonth;
boolean isleapYear;
isleapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

if (month == 4 || month == 6 || month == 9 || month == 11)
	daysInMonth = 30;
else if (month == 2)
	daysInMonth = (isleapYear) ? 29 : 28;
else daysInMonth = 31;

switch (month) {
case 1: System.out.println("January " + year + " had " + daysInMonth + " days.");
		break;
case 2: System.out.println("February " + year + " had " + daysInMonth + " days.");
		break;
case 3: System.out.println("March " + year + " had " + daysInMonth + " days.");
		break;
case 4: System.out.println("April " + year + " had " + daysInMonth + " days.");
		break;
case 5: System.out.println("May " + year + " had " + daysInMonth + " days.");
		break;
case 6: System.out.println("June " + year + " had " + daysInMonth + " days.");
		break;
case 7: System.out.println("July " + year + " had " + daysInMonth + " days.");
		break;
case 8: System.out.println("August " + year + " had " + daysInMonth + " days.");
		break;
case 9: System.out.println("September " + year + " had " + daysInMonth + " days.");
		break;
case 10: System.out.println("October " + year + " had " + daysInMonth + " days.");
		break;
case 11: System.out.println("November " + year + " had " + daysInMonth + " days.");
	break;
case 12: System.out.println("December " + year + " had " + daysInMonth + " days.");
		break;
default:System.out.println("invalid selection!");
	}
	}
}
