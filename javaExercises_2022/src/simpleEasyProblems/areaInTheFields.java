package simpleEasyProblems;

import java.util.Scanner;

/*11. ���� �� ������������ � ��������� <C++ C# Java>
	������������ � ������� � ������������ �� ��� �� ������ ������������
	����� (x1, y1) do (x2, y2). �� �� ���������� ������ � ���������� ��.
	������ �� ���� �� ���������. ������� x1, y1, x2 � y2 �� ������ �� 
	���� �����. ������� �� ������� �� ��������� � ������ �� ������� 
	��� ���� � �� ���� ����� �� ����� �� ��� � ������ � ����������. 
	���������� �� �� ��������� �� 2 ����� ���� ���������.*/

public class areaInTheFields {

	public static void main(String[] args) {
		Scanner keyScanner=new Scanner(System.in);
		
		double x1=keyScanner.nextDouble();
		double y1=keyScanner.nextDouble();
		double x2=keyScanner.nextDouble();
		double y2=keyScanner.nextDouble();
		
		double lenght=Math.abs(x1-x2);
		double width=Math.abs(y1-y2);
		
		double area=lenght*width;
		double perimeter=2*(lenght+width);
		System.out.print("The area of the square: ");
		System.out.printf("%.2f",area);
		System.out.println(" ");
		System.out.print("The perimeter of the square: ");
		System.out.printf("%.2f",perimeter);

	}

}
