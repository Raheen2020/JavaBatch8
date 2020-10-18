package Com.Syntax.Class07;

import java.util.Scanner;

public class TaskLuckyNumber {

	public static void main(String[] args) {
		
		
		

		
		// play a lottery where we need to enter number from 1 to 100
		//lucky number is 7
		// keep asking a user to enter a number until entered number is same as lucky number 
		
        Scanner scan;
        int numberFromUser;
        
        int luckyNumber=7;
        
        scan=new Scanner(System.in);
        
        do {
        	
        	
        	System.out.println("please enter any number from range 1 to 100");
        	numberFromUser=scan.nextInt();
        	
        
        
        }while (numberFromUser!=luckyNumber);
        System.out.println("you  guessed the number Right");
       
        
        
        
        
	}

}
