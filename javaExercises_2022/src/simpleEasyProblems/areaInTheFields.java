package simpleEasyProblems;

import java.util.Scanner;

/*11. Лице на правоъгълник в равнината <C++ C# Java>
	Правоъгълник е зададен с координатите на два от своите срещуположни
	ъгъла (x1, y1) do (x2, y2). Да се пресметнат площта и периметъра му.
	Входът се чете от конзолата. Числата x1, y1, x2 и y2 са дадени по 
	едно наред. Изходът се извежда на конзолата и трябва да съдържа 
	два реда с по една число на всеки от тях – лицето и периметъра. 
	Резултатът да се форматира до 2 знака след запетаята.*/

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
