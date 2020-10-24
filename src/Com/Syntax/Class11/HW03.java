package Com.Syntax.Class11;

public class HW03 {

	public static void main(String[] args) {
		
		/*Create an array of countries.
		 *  While retrieving all values
		 *   from an array print
	     *  Capital for each country.
		 *   (use 2 different loops).
		 */
		String[] countries = { "USA", "Ukraine", "Canada" };
		String[] capitals = { "DC", "Kyiv", "Ottawa" };
		for (int v = 0; v < countries.length; v++) {
			System.out.println("The capital of " + countries[v] + " is " + capitals[v]);
		}
		}
		
	}


