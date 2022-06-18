package simpleConditionalProblems;

import java.util.Scanner;

/*3. Make a program that reads numbers from 1 to 9 from the keyboard and match those numbers with words */

public class fromOnetoNineWithString {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);

		int n = keyScanner.nextInt();

		switch (n) {
		case 1: {
			System.out.println("One!");
			break;
		}
		case 2: {
			System.out.println("Two!");
			break;
		}
		case 3: {
			System.out.println("Three!");
			break;
		}
		case 4: {
			System.out.println("Four!");
			break;
		}
		case 5: {
			System.out.println("Five!");
			break;
		}
		case 6: {
			System.out.println("Six!");
			break;
		}
		case 7: {
			System.out.println("Seven!");
			break;
		}
		case 8: {
			System.out.println("Eight!");
			break;
		}
		case 9: {
			System.out.println("Nine!");
			break;
		}
		default:
			System.out.println("The number is not in the range 1 to 9!");
			break;
		}
	}
}
