package Com.Syntax.Class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		
		
		/*
		 * 
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
           Example: if user is born in June, July or August → season =”Summer”.
           At the end of the program we should see output as “You were born ______”.
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your birth month");
		int month = scan.nextInt();
		if(month>=3 && month<=5) {
			System.out.println("Spring");
		}else if(month>=6 && month<=8) {
			System.out.println("Summer");
		}else if (month>=9 && month<=11) {
			System.out.println("Autumn");
		}else if (month==12 || month==1 || month==2) {
			System.out.println("Winter");
		}else {
			System.out.println("Invalid entry");
		}
		
		
		
		
		
	}

}
