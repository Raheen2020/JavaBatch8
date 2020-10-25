package Com.Syntax.Class12;

public class Q9 {

	public static void main(String[] args) {
		
		/*
		 *  Create an array of countries: 
		 *  north america countries, south america countries,
		 *  Europe countries, asian countries, african countries.
		 *  Then print all values from that array using 2 different loops and calculate
		 *  how many total countries been stored.
		 */
		
		int sum=0;
		String[][]country= {
				{"Mexico","America","Canada"},
				{"Brazil","Argentina","Peru","Chile"},
				{"Britain","France","Germany","Spain"},
				{"Chad","Nigeria","Egypt","South Africa"},
				{"India","Russia","China","Pakistan"}
		};
		
			for(int i=0; i<country.length; i++) {
				for(int j=0; j<country[i].length;j++) {
					System.out.print(country[i][j]+"   ");
					sum=country.length*country[j].length-1;
				}System.out.println();
			}
			System.out.println(sum);
			
	}	
		
	}


