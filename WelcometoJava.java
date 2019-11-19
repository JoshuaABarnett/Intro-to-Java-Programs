/* 
Name: Vincent Chang
Course: COMP171
Program: Test program #1
This is my first Java program to print out a welcome message 
*/

//package comp171;

import java.util.Scanner;

public class WelcometoJava {

    public static void main (String[] args) {
        String name;

        // Create a Scanner to read in data
		Scanner myscan = new Scanner(System.in);
		
		// prompt user for their name
		System.out.print("What is your name: ");
		name = myscan.next();

        System.out.println ("Hello " +name + ", welcome to Programming I !"); 
    }

} 