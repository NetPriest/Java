package simpleConditionalProblems;

import java.util.Scanner;

/*New home

Marin and Nelly are buying a house not far from Sofia.
Nelly loves flowers so much that she convinces you to
write a program that will calculate how much it will
cost them, to plant a certain number of flowers and
whether the available budget will be enough.
Different flowers have different prices.

flower 		Rose 		Dahlia 		Tulip 	Narcissus 	Gladiolus

BGN 		5 			3.80 		2.80 		3 			2.50

There are the following discounts:

· If Nelly buys >80 Roses - 10% discount from the final price
· If Nelly buys >90 Dahlias - 15% discount from the final price
· If Nelly buys >80 Tulips - 15% discount from the final price
· If Nelly buys <120 Narcissus - the price increases by 15%
· If Nelly Buy 	<80 Gladiolus - the price increases by 20%

3 lines are read from the console:

· Type of flowers - text with options - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
· Number of flowers - integer in the interval [10… 1000]
· Budget - an integer in the range [50… 2500]

To print on the console in one line:
· If their budget is enough - "Hey, you have a great garden with {number of flowers} {type of flowers} and {remaining amount} leva left."
· If their budget is NOT enough - "Not enough money, you need {the amount needed} leva more."

The amount should be formatted to the second decimal place.*/

public class newHomeGardern {

	public static void main(String[] args) {

		Scanner keyScanner = new Scanner(System.in);
		String flowerType = keyScanner.next();
		int flowersNum = keyScanner.nextInt();
		double budget = keyScanner.nextInt();
		double finalPrice = 0.00;

		switch (flowerType) {
		case "Roses": {
			if (flowersNum > 80) {
				finalPrice = (flowersNum * 5)-(flowersNum * 5)* 0.10;
				if (budget > finalPrice) {
					budget -= finalPrice;
					System.out.print("Hey, you have a great garden with " + flowersNum + " " + flowerType + " and ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");

				} else if (budget < finalPrice) {
					finalPrice -= budget;
					System.out.print("Not enough money, you need ");
					System.out.printf("%.2f", finalPrice);
					System.out.print(" leva more.");
				}
			} else {
				finalPrice = (flowersNum * 5);
				if (budget > finalPrice) {
					budget -= finalPrice;
					System.out.print("Hey, you have a great garden with " + flowersNum + " " + flowerType + " and ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < finalPrice) {
					finalPrice -= budget;
					System.out.print("Not enough money, you need ");
					System.out.printf("%.2f", finalPrice);
					System.out.print(" leva more.");
				}
				break;
			}
		}
		case "Dahlias": {
			if (flowersNum > 90) {
				finalPrice = (flowersNum * 3.80)-(flowersNum * 3.80)* 0.15;;
				if (budget > finalPrice) {
					budget -= finalPrice;
					System.out.print("Hey, you have a great garden with " + flowersNum + " " + flowerType + " and ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");

				} else if (budget < finalPrice) {
					finalPrice -= budget;
					System.out.print("Not enough money, you need ");
					System.out.printf("%.2f", finalPrice);
					System.out.print(" leva more.");
				}
			} else {
				finalPrice = (flowersNum * 3.80);
				if (budget > finalPrice) {
					budget -= finalPrice;
					System.out.print("Hey, you have a great garden with " + flowersNum + " " + flowerType + " and ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < finalPrice) {
					finalPrice -= budget;
					System.out.print("Not enough money, you need ");
					System.out.printf("%.2f", finalPrice);
					System.out.print(" leva more.");
				}
				break;
			}
		}

			break;
		case "Tulips": {
			if (flowersNum > 80) {
				finalPrice = (flowersNum * 2.80)-(flowersNum * 2.80)* 0.15;
				if (budget > finalPrice) {
					budget -= finalPrice;
					System.out.print("Hey, you have a great garden with " + flowersNum + " " + flowerType + " and ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");

				} else if (budget < finalPrice) {
					finalPrice -= budget;
					System.out.print("Not enough money, you need ");
					System.out.printf("%.2f", finalPrice);
					System.out.print(" leva more.");
				}
			} else {
				finalPrice = (flowersNum * 2.80);
				if (budget > finalPrice) {
					budget -= finalPrice;
					System.out.print("Hey, you have a great garden with " + flowersNum + " " + flowerType + " and ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < finalPrice) {
					finalPrice -= budget;
					System.out.print("Not enough money, you need ");
					System.out.printf("%.2f", finalPrice);
					System.out.print(" leva more.");
				}
				break;
			}
		}

			break;
		case "Narcissus": {
			if (flowersNum < 120) {
				finalPrice = (flowersNum * 3)+(flowersNum*3)* 0.15;
				if (budget > finalPrice) {
					budget -= finalPrice;
					System.out.print("Hey, you have a great garden with " + flowersNum + " " + flowerType + " and ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");

				} else if (budget < finalPrice) {
					finalPrice -= budget;
					System.out.print("Not enough money, you need ");
					System.out.printf("%.2f", finalPrice);
					System.out.print(" leva more.");
				}
			} else {
				finalPrice = (flowersNum * 3);
				if (budget > finalPrice) {
					budget -= finalPrice;
					System.out.print("Hey, you have a great garden with " + flowersNum + " " + flowerType + " and ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < finalPrice) {
					finalPrice -= budget;
					System.out.print("Not enough money, you need ");
					System.out.printf("%.2f", finalPrice);
					System.out.print(" leva more.");
				}
				break;
			}
		}

			break;
		case "Gladiolus": {
			if (flowersNum < 80) {
				finalPrice = (flowersNum * 2.50)+(flowersNum*2.50) * 0.20;
				if (budget > finalPrice) {
					budget -= finalPrice;
					System.out.print("Hey, you have a great garden with " + flowersNum + " " + flowerType + " and ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");

				} else if (budget < finalPrice) {
					finalPrice -= budget;
					System.out.print("Not enough money, you need ");
					System.out.printf("%.2f", finalPrice);
					System.out.print(" leva more.");
				}
			} else {
				finalPrice = (flowersNum * 2.50);
				if (budget > finalPrice) {
					budget -= finalPrice;
					System.out.print("Hey, you have a great garden with " + flowersNum + " " + flowerType + " and ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < finalPrice) {
					finalPrice -= budget;
					System.out.print("Not enough money, you need ");
					System.out.printf("%.2f", finalPrice);
					System.out.print(" leva more.");
				}
				break;
			}
		}
		}

	}

}
