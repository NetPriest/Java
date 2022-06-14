package simpleEasyProblems;

import java.util.Scanner;

/*5. Изготвяне на проекти <C++ C# Java>

	Напишете програма, която изчислява колко часове ще са необходими на един архитект,
	 за да изготви проектите на няколко строителни обекта.
	Изготвянето на един проект отнема приблизително три часа.
	
	*Вход

	От конзолата се четат 2 реда:
	
	1. Името на архитекта - текст
	
	2. Брой на проектите - цяло число в интервала [0… 100]
	
	Изход
	
	На конзолата се отпечатва:
	
	· "The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."*/

public class calculateHoursNeededForProjects {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		System.out.print("Please, enter the name of the architect: ");
		String nameOfArchitect = keyScanner.next();
		System.out.print("Please, enter the number of the projects: ");
		int projects = keyScanner.nextInt();
		final int singlePtojectHrs = 3;
		System.out.println("Architect " + nameOfArchitect + " will need " + (projects * singlePtojectHrs)
				+ " hours to complete " + projects + " project/s");

	}

}
