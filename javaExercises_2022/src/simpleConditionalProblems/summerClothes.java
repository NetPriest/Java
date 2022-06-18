package simpleConditionalProblems;

import java.util.Scanner;

/*Summer clothes

Summer is very changeable and Victor needs your help.
Write a program that, depending on the time of day and the degrees,
can recommend Victor what clothes to wear. Your friend has different
plans for each stage of the day, which require a different look,
you can see them in the table.

Exactly two lines are read from the console:

· Degrees - an integer in the interval [10… 42]

· Text, time of day - with options - "Morning", "Afternoon", "Evening"

	Degrees				Morning 								Afternoon 								Evening

10 <= degrees <= 18 	Outfit = Sweatshirt Shoes = Sneakers 	Outfit = Shirt Shoes = Moccasins 		Outfit = Shirt Shoes = Moccasins

18 <degrees <= 24 		Outfit = Shirt Shoes = Moccasins 		Outfit = T-Shirt Shoes = Sandals 		Outfit = Shirt Shoes = Moccasins

degrees> = 25 			Outfit = T-Shirt Shoes = Sandals 		Outfit = Swim Suit Shoes = Barefoot 	Outfit = Shirt Shoes = Moccasins

*/

public class summerClothes {

	public static void main(String[] args) {
		
		Scanner keyScanner=new Scanner(System.in);
		
		int degrees=keyScanner.nextInt();
		String timeOfDayString=keyScanner.next();
		String outfit=null;
		String shoes=null;
		
		if((degrees>=10&&degrees<=18)&&(timeOfDayString.equals("Morning"))) 
		{
			outfit="Sweatshirt";
			shoes="Sneakers";
			System.out.println("It's "+degrees+" degrees, get your "+outfit+" and "+shoes+".");
		}else if((degrees>=10&&degrees<=18)&&(timeOfDayString.equals("Afternoon"))) 
		{
			outfit="Shirt";
			shoes="Moccasins";
			System.out.println("It's "+degrees+" degrees, get your "+outfit+" and "+shoes+".");
		}else if((degrees>=10&&degrees<=18)&&(timeOfDayString.equals("Evening")))
		{
			outfit="Shirt";
			shoes="Moccasins";
			System.out.println("It's "+degrees+" degrees, get your "+outfit+" and "+shoes+".");
		}
		
		if((degrees>=18&&degrees<=24)&&(timeOfDayString.equals("Morning"))) 
		{
			outfit="Shirt";
			shoes="Moccasins";
			System.out.println("It's "+degrees+" degrees, get your "+outfit+" and "+shoes+".");
		}else if((degrees>=18&&degrees<=24)&&(timeOfDayString.equals("Afternoon"))) 
		{
			outfit="T-Shirt";
			shoes="Sandals";
			System.out.println("It's "+degrees+" degrees, get your "+outfit+" and "+shoes+".");
		}else if((degrees>=18&&degrees<=24)&&(timeOfDayString.equals("Evening")))
		{
			outfit="Shirt";
			shoes="Moccasins";
			System.out.println("It's "+degrees+" degrees, get your "+outfit+" and "+shoes+".");
		}
		
		if((degrees>=25)&&(timeOfDayString.equals("Morning"))) 
		{
			outfit="T-Shirt";
			shoes="Sandals";
			System.out.println("It's "+degrees+" degrees, get your "+outfit+" and "+shoes+".");
		}else if((degrees>=25)&&(timeOfDayString.equals("Afternoon"))) 
		{
			outfit="Swim Suit";
			shoes="Barefoot";
			System.out.println("It's "+degrees+" degrees, get your "+outfit+" and "+shoes+".");
		}else if((degrees>=25)&&(timeOfDayString.equals("Evening")))
		{
			outfit="Shirt";
			shoes="Moccasins";
			System.out.println("It's "+degrees+" degrees, get your "+outfit+" and "+shoes+".");
		}
	}

}
