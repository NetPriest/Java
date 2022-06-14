package simpleEasyProblems;

import java.util.Scanner;

public class charity {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		int days = keyScanner.nextInt();
		int sweetMakers = keyScanner.nextInt();
		int cake = keyScanner.nextInt();
		int waffle = keyScanner.nextInt();
		int pancake = keyScanner.nextInt();
		final double cakeprice = 45;
		final double waffleprice = 5.80;
		final double pancakeprice = 3.20;
		double sum = (cake * cakeprice + waffle * waffleprice + pancake * pancakeprice) * sweetMakers * days;
		double sumfinal = sum - sum / 8;
		System.out.printf("%.2f", sumfinal);
	}

}
