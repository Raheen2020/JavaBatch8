package Com.Syntax.Class12;

public class Q6 {

	public static void main(String[] args) {
		

		
		/*
		 * create a 2D array to store number in 3 rows and 3 columns . print the sum of 
		 * All numbers.
		 * 
		 * 
		 */
		
		double [][] array= {
				{39.0, 78.0, 3.5},
				{10.0 , 57.5 , 80.0},
				{61.5, 33.5 , 90}};
		// create a variable sum and assign it 0, we'll use that to assign the sums.
		
		double sum=0;
			for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum+=array[i][j]; // summing the arrays with a loop
				System.out.println(array[i][j]+ " | ");
				
			}
		}
		
		
		System.out.print("\nThe sum of all values on the 2D array is: " + sum);
		// now the values are assigned. We can sum all the elements on the
		}		

	}

