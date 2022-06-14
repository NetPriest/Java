package simpleEasyProblems;

import java.util.Scanner;

/*9.	USD to BGN converter 1 USD = 1.79549 BGN.*/

public class converterUSD_BGN {

	public static void main(String[] args) {
		
		Scanner keyScanner = new Scanner(System.in);
		System.out.print("Please, enter the number of USD to convert to BGN: ");
		//Read from keyboard
		double currencyUSD = keyScanner.nextDouble();
		
		//Calculate
		final double singleUSD = 1.79549;
		double converted = currencyUSD * singleUSD;
		System.out.print(currencyUSD + " USD are ");
		
		//Round till the second number after decimal .
		System.out.printf("%.2f", converted);
		System.out.print(" BGN.");
	}

}
