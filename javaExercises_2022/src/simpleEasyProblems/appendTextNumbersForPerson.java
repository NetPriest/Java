package simpleEasyProblems;

import java.util.Scanner;

/*2. ����������� �� ����� � ����� <C++ C# Java>

�������� ��������, ����� ������� �� ��������� ���, �������, ������� � ���� � ������ ��������� �� ������� ���:

"You are <firstName> <lastName>, a <age>-years old person from <town>."*/

public class appendTextNumbersForPerson {

	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.println("Please enter one by one first name, last name, age and city: ");
		String fname = keyboardScanner.next();
		String lname = keyboardScanner.next();
		int age = keyboardScanner.nextInt();
		String town = keyboardScanner.next();
		System.out.print("You are " + fname + " " + lname + ", a " + age + "-years old person from " + town + ".");

	}

}
