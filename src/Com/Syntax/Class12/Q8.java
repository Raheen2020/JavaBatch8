package Com.Syntax.Class12;

public class Q8 {

	public static void main(String[] args) {
		
		/*
		 * Create a 2 D array to store numbers and calculate sum of all odd numbers.
		 * 
		 */
		

		int [] [] number= {
				{67, 98, 81, 64},
				{75, 23, 34, 23},
				{54, 22, 56, 43}
				
		};
		int sum=0;
		for(int i=0; i<number.length; i++) {
			for (int j=0; j<number[i].length; j++) {
				if (!(i==0 || j==0)) {
					sum=sum+number[i][j];
					
				}
				
			}
			
		}
		  System.out.print(sum);	

	}

}
