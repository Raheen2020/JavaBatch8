package Com.Syntax.Class10;

public class TaskHomeWork2 {

	public static void main(String[] args) {
		
		String[] animals = {"Donkey", "Monkey", "Turkey", "Mouse", "Dog", "Cat"};
		int animal = 0;
		while (animal < animals.length) {
		    System.out.println(animals[animal]);
		    animal++;
		}
		for (int i = 0; i < animals.length; i++) {
		    System.out.println(animals[i]);
		}
		for (String s : animals) {
		    System.out.println(s);
		}
			

	}

}
