package Com.Syntax.Class04;

import java.util.Scanner;

public class HomeWorkTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		System.out.println("what amount of loan is needed");
		
		
		int loan=input.nextInt();
	
		if (loan<=200000){
			System.out.println("congratulation! you get the loan");
		}else {
			System.out.println("sorry.You loan cannot be approved");
			
		}
	}

}
