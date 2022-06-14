package simpleEasyProblems;

/*Radians to degrees
The user must enter radians which is real number and shoud convert to degrees...

*/

import java.util.Scanner;

public class degreesToRadians {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		double rad = keyScanner.nextDouble();
		double degree = (rad * 180) / Math.PI;
		System.out.println("The degrees are: " + Math.round(degree));

	}

}
