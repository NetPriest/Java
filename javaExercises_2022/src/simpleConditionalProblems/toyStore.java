package simpleConditionalProblems;

import java.util.Scanner;

/*8. Toy store

Petya has a toy store. She receives a large order that she must fulfill.
With the money he will earn he wants to go on a trip.
Write a program that calculates the profit from the order.

Toy prices:

 Puzzle - BGN 2.60.
 Talking doll - BGN 3
 Teddy bear - BGN 4.10
 Minion - BGN 8.20
 Truck - BGN 2

If the ordered toys are 50 or more, the store makes a 25% discount on the total price.
 Petya has to give 10% of the earned money for the rent of the store.
  To calculate whether the money will be enough for her to go on a trip.

Entrance

320
8
2
5
5
1

40.8
20
25
30
50
10

6 lines are read from the console:

1. Price of the trip - real number in the interval [1.00… 10000.00]
2. Number of puzzles - integer in the interval [0… 1000]
3. Number of talkingDolls - integer in the interval [0… 1000]
4. Number of teddyBears - integer in the range [0… 1000]
5. Number of minions - integer in the interval [0… 1000]
6. Number of trucks - integer in the range [0… 1000]

Exit

The following is printed on the console:

If the money is enough it is printed:
"Yes! {remaining money} lv left."
If the money is NOT enough it is printed:
"Not enough money! lv needed."

The result must be formatted to the second decimal place.*/

public class toyStore {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);

		double trip = keyScanner.nextDouble();
		int puzzles = keyScanner.nextInt();
		int talkingDolls = keyScanner.nextInt();
		int teddyBears = keyScanner.nextInt();
		int minions = keyScanner.nextInt();
		int trucks = keyScanner.nextInt();

		final double singlePuzzlePrice = 2.60;
		final double singleTalkingDollPrice = 3.00;
		final double singleTeddyBearPrice = 4.10;
		final double singleMinionPrice = 8.20;
		final double singleTruckPrice = 2.00;

		int toysNumber = puzzles + talkingDolls + teddyBears + minions + trucks;

		double priceSum = puzzles * singlePuzzlePrice + talkingDolls * singleTalkingDollPrice
				+ teddyBears * singleTeddyBearPrice + minions * singleMinionPrice + trucks * singleTruckPrice;

		if (toysNumber > 50) {
			// 25% off for more than 50 toys
			priceSum -= priceSum * 0.25;
			// for rent
			priceSum -= priceSum * 0.10;
			if (priceSum > trip) {
				priceSum -= trip;
				System.out.print("Yes! ");
				System.out.printf("%.2f", priceSum);
				System.out.print(" lv left.");
			} else {
				trip -= priceSum;
				System.out.print("Not enough money! ");
				System.out.printf("%.2f", trip);
				System.out.print(" lv needed.");
			}
		} else if (toysNumber < 50) {
			// for rent
			priceSum -= priceSum * 0.10;
			if (priceSum > trip) {
				priceSum -= trip;
				System.out.print("Yes! ");
				System.out.printf("%.2f", priceSum);
				System.out.print(" lv left.");
			} else {
				trip -= priceSum;
				System.out.print("Not enough money! ");
				System.out.printf("%.2f", trip);
				System.out.print(" lv needed.");
			}
		}
	}
}
