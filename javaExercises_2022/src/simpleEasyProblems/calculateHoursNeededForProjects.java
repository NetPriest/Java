package simpleEasyProblems;

import java.util.Scanner;

/*5. ��������� �� ������� <C++ C# Java>

	�������� ��������, ����� ��������� ����� ������ �� �� ���������� �� ���� ��������,
	 �� �� ������� ��������� �� ������� ���������� ������.
	����������� �� ���� ������ ������ ������������� ��� ����.
	
	*����

	�� ��������� �� ����� 2 ����:
	
	1. ����� �� ��������� - �����
	
	2. ���� �� ��������� - ���� ����� � ��������� [0� 100]
	
	�����
	
	�� ��������� �� ���������:
	
	� "The architect {����� �� ���������} will need {���������� ������} hours to complete {���� �� ���������} project/s."*/

public class calculateHoursNeededForProjects {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.print("Please, enter the name of the architect: ");
		String nameOfArchitect = keyScanner.next();
		System.out.print("Please, enter the number of the projects: ");
		int projects = keyScanner.nextInt();
		final int singlePtojectHrs = 3;
		System.out.println("Architect " + nameOfArchitect + " will need " + (projects * singlePtojectHrs)
				+ " hours to complete " + projects + " project/s");

	}

}
