package simpleEasyProblems;

import java.util.Scanner;

/*6. ����������

�������� ��������, ����� �������� ������� ������� �� ������������ �� ����� �� ������.
 ������� �� �������� ������� �� ������, �� ����������, �� �������� ���������� �� ������
  � �� ��������� �� ������ ��. ���� �������� ����� �� ������ � �� ���� 2.50��., � ����� ��������,
   ����� �� � �� ��� ������ 4��.

����

�� ��������� �� ����� 2 ����:

1. ����� �� �������� � ���� ����� � ��������� [0� 100]

2. ����� �� ���������� ������� - ���� ����� � ��������� [0� 100]

�����

�� ��������� �� ���������:

"{�������� ����} lv."

���������� ������ �� ���� ���������� �� ������� ����� ���� ���������� ����.*/

public class zooShopFood {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.print("Please enter the number of the dogs: ");
		int dogs = keyScanner.nextInt();
		System.out.print("Please enter the number of the other animals: ");
		int animals = keyScanner.nextInt();
		final double dogFoodPrice = 2.50;
		final double animalFoodPrice = 4.00;
		double sum = dogs * dogFoodPrice + animals * animalFoodPrice;
		System.out.printf("%.2f", sum);
		System.out.print(" lv.");

	}

}
