package simpleEasyProblems;

import java.util.Scanner;

/*1. Поздрав по име <C++ C# Java>

Напишете програма, която чете от конзолата име на човек и отпечатва
"Hello, <name>!", където <name> е въведеното име от конзолата.*/

public class greetPersonByName {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please, enter your name: ");
		String name = keyboard.nextLine();

		System.out.println("Hello, " + name + "!");
	}

}
