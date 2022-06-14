package simpleEasyProblems;

import java.util.PrimitiveIterator.OfDouble;
import java.util.Scanner;

/*8. Аквариум <C++ C# Java>

	За рождения си ден Любомир получил аквариум с формата на паралелепипед.
	Първоначално прочитаме от конзолата на отделни редове размерите му – 
	дължина, широчина и височина в сантиметри. Трябва да се пресметне 
	колко литра вода ще събира аквариума, ако се знае, че определен 
	процент от вместимостта му е заета от пясък, растения, нагревател и помпа.
	Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
	Да се напише програма, която изчислява литрите вода, която са необходими за напълването на аквариума.
	Вход

	От конзолата се четат 4 реда:
	
	1. Дължина в см – цяло число в интервала [10 … 500]
	
	2. Широчина в см – цяло число в интервала [10 … 300]
	
	3. Височина в см – цяло число в интервала [10… 200]
	
	4. Процент – реално число в интервала [0.000 … 100.000]
	
	Изход
	
	Да се отпечата на конзолата едно число:
	
	· литрите вода, които ще събира аквариума, форматирани до третия знак след десетичната запетая.
		*/

public class aquarium {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.println("Please, enter the lenght, size, height and the persent of the objects:");
		int lenght = keyScanner.nextInt();
		int size = keyScanner.nextInt();
		int height = keyScanner.nextInt();
		double percentOfObjects = keyScanner.nextDouble() * 0.01;
		double volumeAquarium = lenght * size * height;
		final double literToDm3 = 0.001;
		double litersMax = volumeAquarium * literToDm3;
		double litersReal = litersMax * (1 - percentOfObjects);
		System.out.printf("%.3f", litersReal);

	}

}
