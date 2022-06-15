package simpleConditionalProblems;

import java.util.Scanner;

/*In a movie theater, the chairs are arranged in a rectangular shape in r rows and c columns.
 *  There are three types of screenings with tickets at different prices:

· Premiere - premiere screening, at a price of BGN 12.00.

· Normal - standard screening, at a price of BGN 7.50.

· Discount - screening for children, pupils and students at a reduced price of BGN 5.00.

Write a program that reads the type of projection (string), number of rows and number of columns
in the hall (integers) entered by the user, and calculates the total ticket revenue for a full hall.
 Print the result in the format as in the examples below, 2 characters after the decimal point.*/

public class cinema {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);

		String screeningType = keyScanner.next();
		int r = keyScanner.nextInt();
		int c = keyScanner.nextInt();

		double screeningPrice = 0;
		double revenue = 0;

		if (screeningType.equals("Premiere")) {
			screeningPrice = 12.00;
			revenue = r * c * screeningPrice;
			System.out.printf("%.2f", revenue);
			System.out.println(" leva");
		} else if (screeningType.equals("Normal")) {
			screeningPrice = 7.50;
			revenue = r * c * screeningPrice;
			System.out.printf("%.2f", revenue);
			System.out.println(" leva");
		} else if (screeningType.equals("Discount")) {
			screeningPrice = 5.00;
			revenue = r * c * screeningPrice;
			System.out.printf("%.2f", revenue);
			System.out.println(" leva");

		}
	}

}
