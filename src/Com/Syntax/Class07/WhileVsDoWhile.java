package Com.Syntax.Class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		
		System.out.println("----------while loop--------------");
		
		int a=10;
		while (a<20) {
			
			System.out.println("Hello");
			
			a++;
		}
        System.out.println("-----------Do While loop-------------");
		
        int b=20;
		// first do something
		do {
			
			System.out.println("Hi");
			b++; 
		}while (b<15);//then check the condition 
		
	}

}
