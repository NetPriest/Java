package simpleEasyProblems;

import java.util.Scanner;

/*3. ���������� �� ���� �� ������� <C++ C# Java>

	�� �� ������ �������� ��������, ����� ������� ���� ����� 'a' � �������� ������ �� ������� ��� ������ 'a'.*/

public class squareArea {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.print("Please enter the lenght of the side of the square: ");
		int a = keyScanner.nextInt();
		int squarearea = a * a;
		System.out.println("The Area of the square is: " + squarearea);

	}

}
