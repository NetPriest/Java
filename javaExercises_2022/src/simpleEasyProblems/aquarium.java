package simpleEasyProblems;

import java.util.PrimitiveIterator.OfDouble;
import java.util.Scanner;

/*8. �������� <C++ C# Java>

	�� �������� �� ��� ������� ������� �������� � ������� �� �������������.
	������������ ��������� �� ��������� �� ������� ������ ��������� �� � 
	�������, �������� � �������� � ����������. ������ �� �� ��������� 
	����� ����� ���� �� ������ ���������, ��� �� ����, �� ��������� 
	������� �� ������������ �� � ����� �� �����, ��������, ���������� � �����.
	���� ����� ���� �� ������� �� ���� ������� ���������/ 1�=1 ��3/.
	�� �� ������ ��������, ����� ��������� ������� ����, ����� �� ���������� �� ����������� �� ���������.
	����

	�� ��������� �� ����� 4 ����:
	
	1. ������� � �� � ���� ����� � ��������� [10 � 500]
	
	2. �������� � �� � ���� ����� � ��������� [10 � 300]
	
	3. �������� � �� � ���� ����� � ��������� [10� 200]
	
	4. ������� � ������ ����� � ��������� [0.000 � 100.000]
	
	�����
	
	�� �� �������� �� ��������� ���� �����:
	
	� ������� ����, ����� �� ������ ���������, ����������� �� ������ ���� ���� ����������� �������.
		*/

public class aquarium {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.println("Please, enter the lenght, size, height and the persent of the objects:");
		int lenght = keyScanner.nextInt();
		int size = keyScanner.nextInt();
		int height = keyScanner.nextInt();
		double percentOfObjects = keyScanner.nextDouble() * 0.01;
		double volumeAquarium = lenght * size * height;
		final double literToDm3 = 0.001;
		double litersMax = volumeAquarium * literToDm3;
		double litersReal = litersMax * (1 - percentOfObjects);
		System.out.printf("%.3f", litersReal);

	}

}
