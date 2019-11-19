/*
* Course name: COMP171 Programming 1
* Program: Determine whether it is leap year 
*   Leap year = year can be divided by 4 and 400 but not 100
*/

import java.util.Scanner;

public class LeapYear { 
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);
        System.out.print("Determine leap year.. \n Please enter year: ");
    
        int year = input.nextInt();

        boolean isLeapYear;

        // divisible by 4 and not 100 unless divisible by 400
        isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        System.out.println("Is " + year + " a leap year ?  " + isLeapYear);
    }
}