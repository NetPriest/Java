package simpleEasyProblems;

import java.util.Scanner;

public class dancingClub {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		double lenght = keyScanner.nextDouble();
		double width = keyScanner.nextDouble();
		double a = keyScanner.nextDouble();
		double clubSize = lenght * 100 * width * 100;
		double garderobsize = a * 100 * a * 100;
		double benchSize = clubSize / 10;
		double freespace = clubSize - garderobsize - benchSize;
		double dancers = freespace / (40 + 7000);
		System.out.println(Math.floor(dancers));
	}

}
