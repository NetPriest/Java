package simpleEasyProblems;

import java.util.Scanner;

/*9.	 1 USD = 1.79549 BGN.*/

public class converterUSD_BGN {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.print("Please, enter the number of USD to convert to BGN: ");
		double currencyUSD = keyScanner.nextDouble();
		final double singleUSD = 1.79549;
		double converted = currencyUSD * singleUSD;
		System.out.print(currencyUSD + " USD are ");
		System.out.printf("%.2f", converted);
		System.out.print(" BGN.");
	}

}
