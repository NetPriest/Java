package simpleEasyProblems;

import java.util.Scanner;

/*7. Озеленяване на дворове <C++ C# Java>

	Божидара разполага с няколко къщи на Черноморието и желае да озелени дворовете на някои от тях,
	като по този начин създаде уютна обстановка и комфорт на гостите си, като за целта е наела фирма.

	Напишете програма, която изчислява необходимите средства, които Божидара ще трябва да заплати на 
	фирмата изпълнител на проекта. Цената на един кв. м. е 7.61лв със ДДС. Тъй като нейният двор е 
	доста голям, фирмата изпълнител предлага 18% отстъпка от крайната цена.*/

public class gardeningService {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.print("Please, enter the size of your garden/yard in sq meters: ");
		double area = keyScanner.nextDouble();
		final double singleSqMeter = 7.61;
		double price = area * singleSqMeter;
		double discount = price * 0.18;
		double finalprice = price - discount;
		System.out.print("The final price is: ");
		System.out.printf("%.2f", finalprice);
		System.out.print(" lv.");
		System.out.println("");
		System.out.print("The discount is: ");
		System.out.printf("%.2f", discount);
		System.out.print(" lv.");

	}

}
