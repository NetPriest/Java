package simpleEasyProblems;

import java.util.Scanner;

/*1. ������� �� ��� <C++ C# Java>

�������� ��������, ����� ���� �� ��������� ��� �� ����� � ���������
"Hello, <name>!", ������ <name> � ���������� ��� �� ���������.*/

public class greetPersonByName {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please, enter your name: ");
		String name = keyboard.nextLine();

		System.out.println("Hello, " + name + "!");
	}

}
