package Com.Syntax.Class11;

public class HW01 {

	public static void main(String[] args) {
		
		String [] animals= { "Lion", "Tiger", "Panther", "Gorilla", "Cheeta", "Liger"};
		
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i]+ " ");
				}
		System.out.println();
		
		
		System.out.println("-----------------------------------------------------");
		
		for (String anml_name : animals) {
			System.out.print(anml_name+ " ");
		}
		
	}

}
