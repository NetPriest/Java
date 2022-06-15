package simpleEasyProblems;

import java.util.Scanner;

/*12. Шивашки цех <C++ C# Java>
	Шивашки цех приема поръчки за ушиване на покривки и карета за маси за заведения.
	Покривките са правоъгълни, каретата са квадратни, броят им винаги е еднакъв.
	Покривката трябва да виси с 30 см от всеки ръб на масата.
	Страната на каретата е половината от дължината на масите.
	Във всяка поръчка се включва информация за броя и размерите на масите.
	Напишете програма, която пресмята цената на поръчка в долари и в левове,
	като квадратен метър плат за правоъгълна покривка струва 7 долара, а за каре – 9 долара.
	Курсът на долара е 1.85 лева.  
	
	Вход

	Потребителят въвежда 3 числа, по едно на ред:
	
	· Брой правоъгълни маси – цяло число в интервала [0...500]
	
	· Дължина на правоъгълните маси в метри – реално число в интервала [0.00...3.00]
	
	· Широчина на правоъгълните маси в метри – реално число в интервала [0.00...3.00]
	
	Изход
	
	Да се отпечатат на конзолата две числа: цената на изделията в долари и в левове.
	
	o "{цена в долари} USD"
	
	o "{цена в левове} BGN"
	
	Резултатите да се форматира до два знака след десетичната запетая.
		*/

public class sewerPlace {

	public static void main(String[] args) {

		Scanner keyScanner = new Scanner(System.in);
		int countOfTables = keyScanner.nextInt();
		double lenght = keyScanner.nextDouble();
		double size = keyScanner.nextDouble();
		double priceOfSquare = countOfTables * (lenght + 2 * 0.30) * (size + 2 * 0.30);
		double priceKare = countOfTables * (lenght / 2) * (lenght / 2);
		final double usd = 1.85;
		double priceInUSD = priceOfSquare * 7 + priceKare * 9;
		double priceInBGN = priceInUSD * usd;
		System.out.printf("%.2f", priceInUSD);
		System.out.print(" USD");
		System.out.println("");
		System.out.printf("%.2f", priceInBGN);
		System.out.print(" BGN");

	}

}
