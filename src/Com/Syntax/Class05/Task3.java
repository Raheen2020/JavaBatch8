package Com.Syntax.Class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		
		/* Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”, 
		 * anyday from 6-7 → output “It is a weekend”, any other day → output 
		 * “Invalid day”
		 */
		
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("give a number between 1 to 7 for a week.");
		 int day=input.nextInt();
		
		 if(day==6 || day==7 ) {
			 System.out.println("It is a weekend");
		 }else if(day>=1 && day<=5) {
			 System.out.println("It is a weekday");
		 }else {
			 System.out.println("Invalid day.");
		 }
	
	}
}