package Com.Syntax.Class06;

import java.util.Scanner;

public class NotOperatorTask {

	public static void main(String[] args) {
		/*
		 * first we check if store has sale:
		 * 	if no sale --> no shopping
		 * 	if sale --> we go for shopping
		 * 			ask for the price:
		 * 
		 * 			if price from 10 to 50 --> we give 10% discount
		 * 			if price is between 50 - 100 --> 20% discount
		 * 			if price is between 100 - 500 --> 40% discount
		 * 			if price is more than 500 --> 50% discount
		 * 
		 * your program should calculate final price that you will have after discount!
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Is there a sale?");
		String sale = scan.next();
		double disc, finPrice;
		if(sale.equalsIgnoreCase("yes")) {
			System.out.println("What is the price?");
			double price = scan.nextDouble();
			if (price>=10 && price<50) {
				disc=10;
			}else if (price>=50 && price<100) {
				disc=20;
			}else if (price>=100 && price<500) {
				disc=40;
			}else {
				disc=50;
			}
			finPrice=price-price/100*disc;
			System.out.println("Your final price is "+finPrice);
		}else {
			System.out.println("No shopping today");
		}	
	}

}
