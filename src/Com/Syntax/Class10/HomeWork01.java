package Com.Syntax.Class10;

import java.util.stream.IntStream;

public class HomeWork01 {

	public static void main(String[] args) {
		
	    int[] numbers = {3, 4, 5, 6, 7};
	    int sum = IntStream.of(numbers).sum();
	    System.out.println(sum);
		
		
	}

}
