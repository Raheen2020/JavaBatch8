package Com.Syntax.Class05;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		
		
		
		String day="Saturday";
		
		if ( day.equals("Saturday")|| day.equals("sunday")) {
			
			System.out.println("Today I jave a Java class at Syntax");
			
		}
		
		System.out.println("The End");
		
		
		
		
		System.out.println("-----------more examples---------------");
		
		/*
		 * if day is 1 or 5 --> I am off from Syntax
		 * if day 2 or 3 ---> GIT classe
		 * if day is 4---> Review class
		 * if day 6 or 7 ----> Java class
		 * Everything else will be invalid day 
		 
		 */
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter todays day using numbers only");
		
		int today=scan.nextInt();
		if (today ==1|| today==5) {
			
			System.out.println("I am off from Syntax");
			
		}else if (today==2 || today==3) {
			
			System.out.println("Today is GIT class");
		}else if (today==4) {
			System.out.println("Today is Review Class");
		}else if (today ==6 || today ==7) {
			
			System.out.println("today is java class");
					
			}else {
				System.out.println("please enter a valid day from 1 to 7");
			}
		}
			
		
		
		
	}


