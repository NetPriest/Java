package simpleEasyProblems;

import java.util.Scanner;

public class degreesToRadians {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		double rad = keyScanner.nextDouble();
		double degree = (rad * 180) / Math.PI;
		System.out.println("The degrees are: " + Math.round(degree));

	}

}
