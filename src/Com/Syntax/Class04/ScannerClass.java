package Com.Syntax.Class04;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String name;        
        int age;       
        Scanner scanner = new Scanner(System.in);       
        System.out.println("Please enter your Name");        
        name=scanner.nextLine();        
        System.out.println("Please enter your age");     
        age=scanner.nextInt();        
        System.out.println("Hi "+name+" you are "+age+" years old");
		
		
		
		
		
	}

}
