package simpleEasyProblems;

import java.util.Scanner;

/*4. �� ������ ��� ���������� <C++ C# Java>

	�� �� ������ ��������, ����� ���� �� ��������� ����� (�� ���������� ����) � ����������� ������� �� ������ � ����������.
	�� ����� �������� �������� �� 2.54 (������ 1 ��� = 2.54 ����������).*/

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
