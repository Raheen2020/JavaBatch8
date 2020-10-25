package Com.Syntax.Class12;

public class Q3 {

	public static void main(String[] args) {
		
		
		/*
		 * Write a Java program to print the first 10 numbers of fibonacci series.
		 * 
		 * 
		 */
		
		int num1 = 0;
		int num2 = 1;
		int sum;
		for (int i = 1; i <= 10; i++) {
			System.out.print(num1);
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
			
		
	}

}
