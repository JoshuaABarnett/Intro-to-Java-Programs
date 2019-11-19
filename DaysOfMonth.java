
import java.util.Scanner;

public class DaysOfMonth {

	public static void main(String[] strings) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input a month number: ");
		int month = input.nextInt();

		System.out.print("Input a year: ");
		int year = input.nextInt();
		

		int numOfDays = 0;

		switch (month) {
		case 1:
			numOfDays = 31;
			break;
		case 2:
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				numOfDays = 29;
			} else {
				numOfDays = 28;
			}
			break;
		case 3:
			numOfDays = 31;
			break;
		case 4:
			numOfDays = 30;
			break;
		case 5:
			numOfDays = 31;
			break;
		case 6:
			numOfDays = 30;
			break;
		case 7:
			numOfDays = 31;
			break;
		case 8:
			numOfDays = 31;
			break;
		case 9:
			numOfDays = 30;
			break;
		case 10:
			numOfDays = 31;
			break;
		case 11:
			numOfDays = 30;
			break;
		case 12:
			numOfDays = 31;
		}
		
		System.out.println("year " + year +" month "+month +" has "+ numOfDays+ " days");

	}

}
