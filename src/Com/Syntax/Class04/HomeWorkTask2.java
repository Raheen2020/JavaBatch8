package Com.Syntax.Class04;

import java.util.Scanner;

public class HomeWorkTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		System.out.println("How old are you");
		
		int age=input.nextInt();
		
		if (age>=18) {
			System.out.println("Congratulations! you will get a driver's license");
			
			
		}else {
			System.out.println("sorry, you are not eligible to get a driver's license");
		}
		

		
	}

}
