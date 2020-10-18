package Com.Syntax.Class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		
		
		    Scanner input;
			int money;
	        int waterprice=5;
	        
	        input=new Scanner(System.in);
	        System.out.println("please pay for your water ");
	        money=input.nextInt();
	        
	        while (money!=waterprice) {
	        	
	        	if (money>waterprice) {
	        		
	        		System.out.println("this is too much , you need to enter less money");
	        		money=input.nextInt();
	        			
	     }else {
	    	 
	    	 System.out.println("water is expensive,please insert money");
	    	 money=input.nextInt();
	    	 
	    	 
	     }
	        }
		
		
		System.out.println("Enjoy your water ");
		

	}

}
