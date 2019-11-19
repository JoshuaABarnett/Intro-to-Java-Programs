/*Joshua Barnett
 * Professor Chang
 * Comp 171
 * Lab Assignment 4
 * 
 */
import java.util.Scanner;
public class PhoneKeyPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//char letter;
// Create Scanner to ask user for letter
		Scanner myscan = new Scanner(System.in);
		System.out.print("Please enter a letter: ");
		char letter = myscan.next().charAt(0);
		int number;

		switch (Character.toUpperCase(letter)) {
		case 'A': case 'B': case 'C':
			System.out.print("The corresponding number is 2"); 
			break;
		case 'D': case 'E': case 'F':
			System.out.print("The corresponding number is 3");
			break;
		case 'G': case 'H': case 'I':
			System.out.print("The corresponding number is 4");
			break;
		case 'J': case 'K': case 'L':
			System.out.print("The corresponding number is 5");
			break;
		case 'M': case 'N': case 'O':
			System.out.print("The corresponding number is 6");
			break;
		case 'P': case 'Q': case 'R': case 'S':
			System.out.print("The corresponding number is 7");
			break;
		case 'T': case 'U': case 'V':
			System.out.print("The corresponding number is 8");
			break;
		case 'W': case 'X': case 'Y': case 'Z':
		System.out.print("The corresponding number is 9");
		break;
		default:System.out.println(letter + " is an invalid input!");
			}
	}

}
