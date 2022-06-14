package simpleEasyProblems;

import java.util.Scanner;

/*4. От инчове към сантиметри <C++ C# Java>

	Да се напише програма, която чете от конзолата число (не непременно цяло) и преобразува числото от инчове в сантиметри.
	За целта умножава инчовете по 2.54 (защото 1 инч = 2.54 сантиметра).*/

public class from_Inch_to_Cm {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.print("Please, enter Inches to convert to Cm: ");
		double inches = keyScanner.nextDouble();
		final double inchToCm = 2.54;
		double centimetres = inches * inchToCm;
		System.out.println(inches + " Inches are: " + centimetres + " Centimetres.");

	}

}
