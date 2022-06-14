package simpleEasyProblems;

import java.util.Scanner;

/*9.	Конзолен конвертор: USD към BGN <C++ C# Java>
	Напишете програма за конвертиране на щатски долари (USD) в български лева (BGN).
	Форматирайте резултата до 2 цифри след десетичната запетая.
	Използвайте фиксиран курс между долар и лев: 1 USD = 1.79549 BGN.*/

public class converterUSD_BGN {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.println("FOR DECIMAL CURRENCY USE < , > NOT < . > ");
		System.out.print("Please, enter the number of USD to convert to BGN: ");
		double currencyUSD = keyScanner.nextDouble();
		final double singleUSD = 1.79549;
		double converted = currencyUSD * singleUSD;
		System.out.print(currencyUSD + " USD are ");
		System.out.printf("%.2f", converted);
		System.out.print(" BGN.");
	}

}
