package simpleEasyProblems;

import java.util.Scanner;

/*12. ������� ��� <C++ C# Java>
	������� ��� ������ ������� �� ������� �� �������� � ������ �� ���� �� ���������.
	���������� �� �����������, �������� �� ���������, ����� �� ������ � �������.
	���������� ������ �� ���� � 30 �� �� ����� ��� �� ������.
	�������� �� �������� � ���������� �� ��������� �� ������.
	��� ����� ������� �� ������� ���������� �� ���� � ��������� �� ������.
	�������� ��������, ����� �������� ������ �� ������� � ������ � � ������,
	���� ��������� ����� ���� �� ����������� �������� ������ 7 ������, � �� ���� � 9 ������.
	������ �� ������ � 1.85 ����.  
	
	����

	������������ ������� 3 �����, �� ���� �� ���:
	
	� ���� ����������� ���� � ���� ����� � ��������� [0...500]
	
	� ������� �� ������������� ���� � ����� � ������ ����� � ��������� [0.00...3.00]
	
	� �������� �� ������������� ���� � ����� � ������ ����� � ��������� [0.00...3.00]
	
	�����
	
	�� �� ��������� �� ��������� ��� �����: ������ �� ��������� � ������ � � ������.
	
	o "{���� � ������} USD"
	
	o "{���� � ������} BGN"
	
	����������� �� �� ��������� �� ��� ����� ���� ����������� �������.
		*/

public class sewerPlace {

	public static void main(String[] args) {

		Scanner keyScanner = new Scanner(System.in);
		int countOfTables = keyScanner.nextInt();
		double lenght = keyScanner.nextDouble();
		double size = keyScanner.nextDouble();
		double priceOfSquare = countOfTables * (lenght + 2 * 0.30) * (size + 2 * 0.30);
		double priceKare = countOfTables * (lenght / 2) * (lenght / 2);
		final double usd = 1.85;
		double priceInUSD = priceOfSquare * 7 + priceKare * 9;
		double priceInBGN = priceInUSD * usd;
		System.out.printf("%.2f", priceInUSD);
		System.out.print(" USD");
		System.out.println("");
		System.out.printf("%.2f", priceInBGN);
		System.out.print(" BGN");

	}

}
