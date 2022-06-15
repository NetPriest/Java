package simpleConditionalProblems;

import java.util.Scanner;

/*2.Read from the keyboard 2 numbers and find the bigger use if-else*/

public class findBiggerNumber {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);

		int n1 = keyScanner.nextInt();
		int n2 = keyScanner.nextInt();

		if (n1 > n2) {
			System.out.println("The bigger number is: " + n1);
		} else {
			System.out.println("The bigger number is: " + n2);
		}

	}

}
