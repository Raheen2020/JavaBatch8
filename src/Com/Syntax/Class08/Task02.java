package Com.Syntax.Class08;

public class Task02 {

	public static void main(String[] args) {
		
		
		for (int i= 1; i<100; i++) {
		    System.out.print(i + ", ");
		}
		for (int i = 100; i > 0; i--) {
		    System.out.print(i);
		}
		for (int i = 20; i > 0; i-=2) {
		    System.out.print(i);
		}
		for (int i = 20; i > 0; i--) {
		    if (i%2 == 0) {
		        System.out.print(i);
		    } 
		}
		for (int i = 19; i > 0; i-=2) {
		    System.out.print(i);
		}
		for (int i = 20; i > 0; i--) {
		    if (i%2 == 1) {
		        System.out.print(i);
		    }
		}
		
		
	}

}
