package simpleEasyProblems;

/* Another simple problem

	Dancers decide to open a new dancing club and need to find how many dancers could fit in the room.
	You also have a Wardrobe and a bench and you need to calculate the area of the Wardrobe and the bench 
	
	One dancer takes 40 cm(Place to stand) + 7000cm(Place to dance)
	The bench is 1/10th from the clubSize;
	
	You should enter from the keyboard:
	The lenght of the room in meters;
	The width of the room in meters;
	The side of the Wardrobe(Square) in meters;
	Round the dancers to the nearest number.
*/

import java.util.Scanner;

public class dancingClub {

	public static void main(String[] args) {
		
		Scanner keyScanner = new Scanner(System.in);
		//Read from keyboard
		double lenght = keyScanner.nextDouble();
		double width = keyScanner.nextDouble();
		double a = keyScanner.nextDouble();
		//Calculate sizes from meters to centimeters
		double clubSize = lenght * 100 * width * 100;
		double wardrobeSize = a * 100 * a * 100;
		double benchSize = clubSize / 10;
		double freeSpace = clubSize - wardrobeSize - benchSize;
		double dancers = freeSpace / (40 + 7000);
		
		System.out.println(Math.floor(dancers));
	}

}
