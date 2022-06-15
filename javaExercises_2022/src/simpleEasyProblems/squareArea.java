package simpleEasyProblems;

import java.util.Scanner;

/*3. Пресмятане на лице на квадрат <C++ C# Java>

	Да се напише конзолна програма, която въвежда цяло число 'a' и пресмята лицето на квадрат със страна 'a'.*/

public class squareArea {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.print("Please enter the lenght of the side of the square: ");
		int a = keyScanner.nextInt();
		int squarearea = a * a;
		System.out.println("The Area of the square is: " + squarearea);

	}

}
