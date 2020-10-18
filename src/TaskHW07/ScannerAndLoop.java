package TaskHW07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
	
		
		
		
		Scanner Scan;
		
		String name;
		
		Scan=new Scanner(System.in);
		
		int number=1;
		
		while (number<=5) {
		System.out.println("please tell me your name");
		name=Scan.nextLine();
		System.out.println("Nice to meet you "+name);
		
		
		number++;
		}
		
		
		
	}

}
