package simpleConditionalProblems;

import java.util.Scanner;

/*1. Check for excellent grade
 * 
 * Make a console app that reads from keyboard decimal number given from user
 * and prints out "Excellent!", if the grade is 5.50 ot greater
 * */

public class checkForExcellentGrade {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);

		double grade = keyScanner.nextDouble();

		if (grade >= 5.50) {
			System.out.println("Excellent!");
		}

	}

}
