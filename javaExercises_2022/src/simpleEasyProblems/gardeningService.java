package simpleEasyProblems;

import java.util.Scanner;

/*7. ����������� �� ������� <C++ C# Java>

	�������� ��������� � ������� ���� �� ������������ � ����� �� ������� ��������� �� ����� �� ���,
	���� �� ���� ����� ������� ����� ���������� � ������� �� ������� ��, ���� �� ����� � ����� �����.

	�������� ��������, ����� ��������� ������������ ��������, ����� �������� �� ������ �� ������� �� 
	������� ���������� �� �������. ������ �� ���� ��. �. � 7.61�� ��� ���. ��� ���� ������� ���� � 
	����� �����, ������� ���������� �������� 18% �������� �� �������� ����.*/

public class gardeningService {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.print("Please, enter the size of your garden/yard in sq meters: ");
		double area = keyScanner.nextDouble();
		final double singleSqMeter = 7.61;
		double price = area * singleSqMeter;
		double discount = price * 0.18;
		double finalprice = price - discount;
		System.out.print("The final price is: ");
		System.out.printf("%.2f", finalprice);
		System.out.print(" lv.");
		System.out.println("");
		System.out.print("The discount is: ");
		System.out.printf("%.2f", discount);
		System.out.print(" lv.");

	}

}
