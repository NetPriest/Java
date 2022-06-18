package simpleConditionalProblems;

import java.util.Scanner;

/* 5. read from the keyboard any String and if it matches with "s3cr3t!P@ssw0rd" print Welcome! Else Wrong password!*/

public class guessThePassword {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);

		String pass = keyScanner.next();
		//had problems with pass=="s3cr3t!P@ssw0rd" and != but made up something that works now :D
		if (!pass.equals("s3cr3t!P@ssw0rd"))
		{ System.out.println("Wrong password!");}
			
		else System.out.println("Welcome!");

	}

}
