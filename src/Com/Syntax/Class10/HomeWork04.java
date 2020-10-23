package Com.Syntax.Class10;

public class HomeWork04 {

	public static void main(String[] args) {
		
		String[] countries = {"United States", "Russia", "Turkey"};
		String[] capitals = {"Washington DC", "Moscow", "Ankara"};
		int country = 0;
		int capital = 0;
		while (country < countries.length) {
		    while (capital < capitals.length) {
		        System.out.println("The " + countries[country] + " capital is " + capitals[capital]);
		        capital ++;
		    }
		    country++;
		}
		for (String s : countries) {
		    for (String value : capitals) {
		        System.out.println("The " + s + " capital is " + value);
		    }
		}
		
	}

}
