package simpleConditionalProblems;

import java.util.Scanner;

/*Summation of seconds

Three athletes finish in a matter of seconds (between 1 and 50).
Write a program that reads the times of the competitors in
seconds entered by the user and calculates their total
time in the format "minutes: seconds".
Display the seconds with a leading zero

35 45 44

22 7 34

50  50 49

14 12 10
*
*/

public class sumOfSeconds {

	public static void main(String[] args) {
		Scanner keyScanner=new Scanner(System.in);
		int t1=keyScanner.nextInt();
		int t2=keyScanner.nextInt();
		int t3=keyScanner.nextInt();
		int totalTime=t1+t2+t3;
		
		int minutes=totalTime/60;
		int seconds=totalTime%60;
		
		if(seconds<10) 
		{
			System.out.println(minutes+":"+"0"+seconds);
		}else {
			System.out.println(minutes+":"+seconds);
		}

	}

}
