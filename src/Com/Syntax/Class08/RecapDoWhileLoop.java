package Com.Syntax.Class08;

import java.util.Scanner;

public class RecapDoWhileLoop {

	public static void main(String[] args) {
		
		 Scanner input;
			int money;
	        int waterprice=5;
	        
	        input=new Scanner(System.in);
	        System.out.println("please pay for your water ");
             money=input.nextInt();
             
             
	   do {
	  
		   money=input.nextInt();
       	if (money>waterprice) {
       		
       		System.out.println("this is too much , you need to enter less money");
       		
       	}else if (money<waterprice) {
       	
       		System.out.println("water is Expensive please intert money");
       	}
		         
		   
	   }while (money!=waterprice);
	   
	  System.out.println("Enjoy your water");
	        
	        
	}

}
