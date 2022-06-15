package simpleConditionalProblems;

import java.util.Scanner;

/*7. Faces of figures
	
	Write a program in which the user enters the type and dimensions of a geometric
	figure and calculates its face. The figures are of four types: square, square,
	rectangle, circle and triangle. The first line of the entrance reads the shape
	of the figure (square, rectangle, circle or triangle). If the figure is a square,
	the next line reads a number - the length of its side. If the figure is a rectangle
	the next two lines read two numbers - the lengths of its sides. If the figure is a circle,
	the next line reads a number - the radius of the circle. If the figure is a triangle,
	the next two lines read two numbers - the length of its side and the length of the height
	to it. Round the result to 3 digits after the decimal point.*/

public class faceOfFigures {

	public static void main(String[] args) {

		Scanner keyScanner = new Scanner(System.in);

		String figure = keyScanner.next();
		double n1 = keyScanner.nextDouble();
		double area;
		
		if (figure.equals("square")) {
			area = n1 * n1;
			System.out.printf("%.3f", area);
		}else if (figure.equals("rectangle")) {
			double n2 = keyScanner.nextDouble();
			area = n1 * n2;
			System.out.printf("%.3f", area);
		}else if (figure.equals("circle")) {
			area = Math.PI*(n1 * n1);
			System.out.printf("%.3f", area);
		}else {double n2 = keyScanner.nextDouble();
			area=(n1*n2)/2;
			System.out.printf("%.3f", area);
		}
	}

}
