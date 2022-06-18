package simpleConditionalProblems;

import java.util.Scanner;

/*4. Make a program that reads from keyboar number
 * 
 * if the number is <100 print Less than 100
 * if the number is >100&&<200 print Between 100 and 200
 * if the number is >200 print Grater than 200
 * */

public class numberFrom100to200orGreater {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);

		int n = keyScanner.nextInt();

		if (n < 100) {
			System.out.println("Less than 100!");
		} else if (n > 100 && n < 200) {
			System.out.println("Between 100 and 200!");

		} else {
			System.out.println("Greater than 200!");
		}

	}

}
