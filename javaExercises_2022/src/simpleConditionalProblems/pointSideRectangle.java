package simpleConditionalProblems;

import java.util.Scanner;

/*Point on the side of the rectangle

Write a program that checks if the point {x, y} is on one of the
sides of the rectangle {x1, y1} - {x2, y2}. The input data is 
read from the console and consists of 6 lines entered by the user:
the decimal numbers x1, y1, x2, y2, x and y (ensuring that x1 <x2 and y1 <y2).
Print "Border" (the point lies on one of the sides) or "Inside / Outside" (otherwise).

2 -3 12 3 8 -1

2 -3 12 3 12 -1
*/

public class pointSideRectangle {

	public static void main(String[] args) {
		Scanner keyScanner=new Scanner(System.in);
		
		int x1=keyScanner.nextInt();
		int y1=keyScanner.nextInt();
		int x2=keyScanner.nextInt();
		int y2=keyScanner.nextInt();
		int x=keyScanner.nextInt();
		int y=keyScanner.nextInt();
		
		boolean con1;
		boolean con2;
		
		if((x==x1||x==x2)&&(y>=y1&&y<=y2)) 
		{
			con1=true;
		}else con1=false;
		
		if((y==y1||y==y2)&&(x>=x1&&x<=x2))
		{
			con2=true;
		}else con2=false;
		
		if(con1||con2) 
		{
			System.out.println("Border");
		}else System.out.println("Inside/Outside");

	}

}
