package simpleEasyProblems;

import java.util.Scanner;

/*6. Зоомагазин

Напишете програма, която пресмята нужните разходи за закупуването на храна за кучета.
 Храната се пазарува основно за кучета, от зоомагазин, но понякога стопанинът им купува
  и за животните на съседа му. Една опаковка храна за кучета е на цена 2.50лв., а всяка останала,
   която не е за тях струва 4лв.

Вход

От конзолата се четат 2 реда:

1. Броят на кучетата – цяло число в интервала [0… 100]

2. Броят на останалите животни - цяло число в интервала [0… 100]

Изход

На конзолата се отпечатва:

"{крайната сума} lv."

Резултатът трябва да бъде форматиран до втората цифра след десетичния знак.*/

public class zooShopFood {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.print("Please enter the number of the dogs: ");
		int dogs = keyScanner.nextInt();
		System.out.print("Please enter the number of the other animals: ");
		int animals = keyScanner.nextInt();
		final double dogFoodPrice = 2.50;
		final double animalFoodPrice = 4.00;
		double sum = dogs * dogFoodPrice + animals * animalFoodPrice;
		System.out.printf("%.2f", sum);
		System.out.print(" lv.");

	}

}
