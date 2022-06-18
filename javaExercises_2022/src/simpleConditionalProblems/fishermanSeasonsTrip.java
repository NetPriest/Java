package simpleConditionalProblems;

import java.util.Scanner;

/*Fishing boat

Tony and his friends loved to go fishing, they were so
passionate about fishing that they decided to go fishing by boat.
The price of renting a boat depends on the season and the number of fishermen.

The price depends on the season:

· The price for renting the ship in the spring is 3000 BGN.
· The price for renting the ship in summer and autumn is 4200 BGN.
· The price for renting the ship in winter is 2600 BGN.

Depending on its number, the group enjoys a discount:

· If the group is up to 6 people inclusive - 10% discount.
· If the group is from 7 to 11 people inclusive - 15% discount.
· If the group is from 12 upwards - 25% discount.

Fishermen enjoy an additional 5% discount if they are an even
number unless it is autumn - then they do not have an additional
discount, which is accrued after deducting the discount according
to the above criteria.

Write a program to calculate whether fishermen will raise enough money.

Entrance

Exactly three lines are read from the console.
· Group budget - integer in the range [1… 8000]
· Season - lyrics: "Spring", "Summer", "Autumn", "Winter"
· Number of fishermen - an integer in the range [4… 18*/

public class fishermanSeasonsTrip {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);

		double budget = keyScanner.nextDouble();
		String season = keyScanner.next();
		int fisherman = keyScanner.nextInt();

		double budgetSpring = 3000.00;
		double budgetSummerAutum = 4200.00;
		double budgetWinter = 2600.00;

		switch (season) {
		case "Spring": {
			if (fisherman <= 6) {
				budgetSpring -= budgetSpring * 0.10;
				if (fisherman % 2 == 0) {
					budgetSpring -= budgetSpring * 0.5;
					if (budget > budgetSpring) {
						budget -= budgetSpring;
						System.out.print("Yes! You have ");
						System.out.printf("%.2f", budget);
						System.out.print(" leva left.");
					} else if (budget < budgetSpring) {
						budgetSpring -= budget;
						System.out.print("Not enough money! You need ");
						System.out.printf("%.2f", budgetSpring);
						System.out.print(" leva.");
					}
				} else if (budget > budgetSpring) {
					budget -= budgetSpring;
					System.out.print("Yes! You have ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < budgetSpring) {
					budgetSpring -= budget;
					System.out.print("Not enough money! You need ");
					System.out.printf("%.2f", budgetSpring);
					System.out.print(" leva.");
				}
			} else if (fisherman >= 7 && fisherman <= 11) {
				budgetSpring -= budgetSpring * 0.15;
				if (fisherman % 2 == 0) {
					budgetSpring -= budgetSpring * 0.5;
					if (budget > budgetSpring) {
						budget -= budgetSpring;
						System.out.print("Yes! You have ");
						System.out.printf("%.2f", budget);
						System.out.print(" leva left.");
					} else if (budget < budgetSpring) {
						budgetSpring -= budget;
						System.out.print("Not enough money! You need ");
						System.out.printf("%.2f", budgetSpring);
						System.out.print(" leva.");
					}
				} else if (budget > budgetSpring) {
					budget -= budgetSpring;
					System.out.print("Yes! You have ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < budgetSpring) {
					budgetSpring -= budget;
					System.out.print("Not enough money! You need ");
					System.out.printf("%.2f", budgetSpring);
					System.out.print(" leva.");
				}
			} else if (fisherman > 12) {
				budgetSpring -= budgetSpring * 0.25;
				if (fisherman % 2 == 0) {
					budgetSpring -= budgetSpring * 0.5;
					if (budget > budgetSpring) {
						budget -= budgetSpring;
						System.out.print("Yes! You have ");
						System.out.printf("%.2f", budget);
						System.out.print(" leva left.");
					} else if (budget < budgetSpring) {
						budgetSpring -= budget;
						System.out.print("Not enough money! You need ");
						System.out.printf("%.2f", budgetSpring);
						System.out.print(" leva.");
					}
				} else if (budget > budgetSpring) {
					budget -= budgetSpring;
					System.out.print("Yes! You have ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < budgetSpring) {
					budgetSpring -= budget;
					System.out.print("Not enough money! You need ");
					System.out.printf("%.2f", budgetSpring);
					System.out.print(" leva.");
				}
			}
			break;
		}

		case "Summer": {
			if (fisherman <= 6) {
				budgetSummerAutum -= budgetSummerAutum * 0.10;
				if (fisherman % 2 == 0) {
					budgetSummerAutum -= budgetSummerAutum * 0.5;
					if (budget > budgetSummerAutum) {
						budget -= budgetSummerAutum;
						System.out.print("Yes! You have ");
						System.out.printf("%.2f", budget);
						System.out.print(" leva left.");
					} else if (budget < budgetSummerAutum) {
						budgetSummerAutum -= budget;
						System.out.print("Not enough money! You need ");
						System.out.printf("%.2f", budgetSummerAutum);
						System.out.print(" leva.");
					}
				} else if (budget > budgetSummerAutum) {
					budget -= budgetSummerAutum;
					System.out.print("Yes! You have ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < budgetSummerAutum) {
					budgetSummerAutum -= budget;
					System.out.print("Not enough money! You need ");
					System.out.printf("%.2f", budgetSummerAutum);
					System.out.print(" leva.");
				}
			} else if (fisherman >= 7 && fisherman <= 11) {
				budgetSummerAutum -= budgetSummerAutum * 0.15;
				if (fisherman % 2 == 0) {
					budgetSummerAutum -= budgetSummerAutum * 0.5;
					if (budget > budgetSummerAutum) {
						budget -= budgetSummerAutum;
						System.out.print("Yes! You have ");
						System.out.printf("%.2f", budget);
						System.out.print(" leva left.");
					} else if (budget < budgetSummerAutum) {
						budgetSummerAutum -= budget;
						System.out.print("Not enough money! You need ");
						System.out.printf("%.2f", budgetSummerAutum);
						System.out.print(" leva.");
					}
				} else if (budget > budgetSummerAutum) {
					budget -= budgetSummerAutum;
					System.out.print("Yes! You have ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < budgetSummerAutum) {
					budgetSummerAutum -= budget;
					System.out.print("Not enough money! You need ");
					System.out.printf("%.2f", budgetSummerAutum);
					System.out.print(" leva.");
				}
			} else if (fisherman > 12) {
				budgetSummerAutum -= budgetSummerAutum * 0.25;
				if (fisherman % 2 == 0) {
					budgetSummerAutum -= budgetSummerAutum * 0.5;
					if (budget > budgetSummerAutum) {
						budget -= budgetSummerAutum;
						System.out.print("Yes! You have ");
						System.out.printf("%.2f", budget);
						System.out.print(" leva left.");
					} else if (budget < budgetSummerAutum) {
						budgetSummerAutum -= budget;
						System.out.print("Not enough money! You need ");
						System.out.printf("%.2f", budgetSummerAutum);
						System.out.print(" leva.");
					}
				} else if (budget > budgetSummerAutum) {
					budget -= budgetSummerAutum;
					System.out.print("Yes! You have ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < budgetSummerAutum) {
					budgetSummerAutum -= budget;
					System.out.print("Not enough money! You need ");
					System.out.printf("%.2f", budgetSummerAutum);
					System.out.print(" leva.");
				}
			}
			break;
		}
		case "Autumn": {
			if (fisherman <= 6) {
				budgetSummerAutum -= budgetSummerAutum * 0.10;

			 if (budget > budgetSummerAutum) {
				budget -= budgetSummerAutum;
				System.out.print("Yes! You have ");
				System.out.printf("%.2f", budget);
				System.out.print(" leva left.");
			} else if (budget < budgetSummerAutum) {
				budgetSummerAutum -= budget;
				System.out.print("Not enough money! You need ");
				System.out.printf("%.2f", budgetSummerAutum);
				System.out.print(" leva.");
				}	
		} else if (fisherman >= 7 && fisherman <= 11) {
				budgetSummerAutum -= budgetSummerAutum * 0.15;

			 if (budget > budgetSummerAutum) {
				budget -= budgetSummerAutum;
				System.out.print("Yes! You have ");
				System.out.printf("%.2f", budget);
				System.out.print(" leva left.");
			} else if (budget < budgetSummerAutum) {
				budgetSummerAutum -= budget;
				System.out.print("Not enough money! You need ");
				System.out.printf("%.2f", budgetSummerAutum);
				System.out.print(" leva.");
			}	
		} else if (fisherman > 12) {
				budgetSummerAutum -= budgetSummerAutum * 0.25;

			 if (budget > budgetSummerAutum) {
				budget -= budgetSummerAutum;
				System.out.print("Yes! You have ");
				System.out.printf("%.2f", budget);
				System.out.print(" leva left.");
			} else if (budget < budgetSummerAutum) {
				budgetSummerAutum -= budget;
				System.out.print("Not enough money! You need ");
				System.out.printf("%.2f", budgetSummerAutum);
				System.out.print(" leva.");}
			}
			break;
		}

		case "Winter": {
			if (fisherman <= 6) {
				budgetWinter -= budgetWinter * 0.10;
				if (fisherman % 2 == 0) {
					budgetWinter -= budgetWinter * 0.5;
					if (budget > budgetWinter) {
						budget -= budgetWinter;
						System.out.print("Yes! You have ");
						System.out.printf("%.2f", budget);
						System.out.print(" leva left.");
					} else if (budget < budgetWinter) {
						budgetWinter -= budget;
						System.out.print("Not enough money! You need ");
						System.out.printf("%.2f", budgetWinter);
						System.out.print(" leva.");
					}
				} else if (budget > budgetWinter) {
					budget -= budgetWinter;
					System.out.print("Yes! You have ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < budgetWinter) {
					budgetWinter -= budget;
					System.out.print("Not enough money! You need ");
					System.out.printf("%.2f", budgetWinter);
					System.out.print(" leva.");
				}
			} else if (fisherman >= 7 && fisherman <= 11) {
				budgetWinter -= budgetWinter * 0.15;
				if (fisherman % 2 == 0) {
					budgetWinter -= budgetWinter * 0.5;
					if (budget > budgetWinter) {
						budget -= budgetWinter;
						System.out.print("Yes! You have ");
						System.out.printf("%.2f", budget);
						System.out.print(" leva left.");
					} else if (budget < budgetWinter) {
						budgetWinter -= budget;
						System.out.print("Not enough money! You need ");
						System.out.printf("%.2f", budgetWinter);
						System.out.print(" leva.");
					}
				} else if (budget > budgetWinter) {
					budget -= budgetWinter;
					System.out.print("Yes! You have ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < budgetWinter) {
					budgetWinter -= budget;
					System.out.print("Not enough money! You need ");
					System.out.printf("%.2f", budgetWinter);
					System.out.print(" leva.");
				}
			} else if (fisherman > 12) {
				budgetWinter -= budgetWinter * 0.25;
				if (fisherman % 2 == 0) {
					budgetWinter -= budgetWinter * 0.5;
					if (budget > budgetWinter) {
						budget -= budgetWinter;
						System.out.print("Yes! You have ");
						System.out.printf("%.2f", budget);
						System.out.print(" leva left.");
					} else if (budget < budgetWinter) {
						budgetWinter -= budget;
						System.out.print("Not enough money! You need ");
						System.out.printf("%.2f", budgetWinter);
						System.out.print(" leva.");
					}
				} else if (budget > budgetWinter) {
					budget -= budgetWinter;
					System.out.print("Yes! You have ");
					System.out.printf("%.2f", budget);
					System.out.print(" leva left.");
				} else if (budget < budgetWinter) {
					budgetWinter -= budget;
					System.out.print("Not enough money! You need ");
					System.out.printf("%.2f", budgetWinter);
					System.out.print(" leva.");
				}
			}
			break;
		}
		}
	}
}
