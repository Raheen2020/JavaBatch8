package Com.Syntax.Class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		/*
		   *  Write a program that will read three inputs of scores 
		   *  (quiz, mid term, and final scores) and determine the grade based on the following rules: 
           *  if the average score >=90 → grade=A
           * if the average score >= 70 and <90 → grade=B
           * if the average score>=50 and <70 → grade=C
           * if the average score<50 → grade=F
		  
		 */


	    Scanner scan;
        int quiz, mid, finalScore, avg;
        
        scan = new Scanner(System.in);
        
        System.out.println("Please enter your quiz score");
        quiz = scan.nextInt();
        
        System.out.println("Please enter your mid term score");
        mid = scan.nextInt();
        
        System.out.println("Please enter your final score");
        finalScore = scan.nextInt();
        
        avg = (quiz + mid + finalScore)/3;
        System.out.println(avg);
        
        char grade;
        
        if(avg>=90) {
            grade='A';
        }else if(avg>=70 && avg<90) {
            grade='B';
        }else if (avg>=50 && avg <70) {
            grade='C';
        }else if (avg>=40 && avg<50) {
            grade='D';
        }else {
            grade='F';
        }
        System.out.println("Grade is = "+grade);
        
        if(grade=='A' || grade =='B') {
            System.out.println("You are good student");
        }else {
            System.out.println("Please study more");
        }
    }


	
		
	}
 


		
		



