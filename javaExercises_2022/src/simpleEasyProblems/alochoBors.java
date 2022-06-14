package simpleEasyProblems;

import java.util.Scanner;

/*Ivan wants to make a party and goes to the alchohol shop. He buys Beer, Wine, Rakiya and Wiskey
 * 
 * You must enter from the console the price of the wiskey for 1 liter
 * and the quantity of liters of the Beer,Wine,Rakiya and Wiskey.
 * 
 * The price of the rakiya for liter is half of the price of the wiskey.
 * The price of the wine is 40% of the price of the rakiya.
 * the price of the beer is 80% of the price of the rakiya.
 *Make a program that calculate the money Ivan needs to pay. Round till second number after decimal .
 * */

public class alochoBors {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);

		double wikeyPrce = keyScanner.nextDouble();
		double beerLiters = keyScanner.nextDouble();
		double wineLiters = keyScanner.nextDouble();
		double rakiyaLiters = keyScanner.nextDouble();
		double wiskeyLiters = keyScanner.nextDouble();

		double rakiyaPrcie = wikeyPrce / 2;
		double winePrice = rakiyaPrcie - (0.4 * rakiyaPrcie);
		double beerPrcie = rakiyaPrcie - (0.8 * rakiyaPrcie);

		double finalBeerPrice = beerPrcie * beerLiters;
		double finalWinePrice = winePrice * wineLiters;
		double finalRakiyaPrice = rakiyaPrcie * rakiyaLiters;
		double finalWiskeyPrice = wikeyPrce * wiskeyLiters;
		double finalSum = finalBeerPrice + finalRakiyaPrice + finalWinePrice + finalWiskeyPrice;
		System.out.printf("%.2f", finalSum);

	}

}
