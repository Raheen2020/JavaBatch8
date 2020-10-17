package Com.Syntax.Class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		
		
		/*
		 * Prompt the user to enter person heights in inches. P
		  * person should be classified as one of the following:
		  * short (under 60 inch)
		  * medium(between 60 -72 inch)
		  *  tall (over 72 inch)
		*/

		
		
		   Scanner scanner=new Scanner(System.in);
		    System.out.println("Please enter you height:");
		    double height = scanner.nextDouble();
		    if (height < 60) {
		        System.out.println("Short");
		    } else if (height > 60 && height < 72) {
		        System.out.println("Medium");
		    } else {
		        System.out.println("Tall");
		    }
		}	
		
		
	}


