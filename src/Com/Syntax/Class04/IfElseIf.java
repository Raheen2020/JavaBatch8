package Com.Syntax.Class04;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*
	 * we need to compare 2 numbers:
	 * bigger,smaller or equal
	 *
	 */

		int num1=99;
		int num2=99;
		
		if(num1>num2) {
			
			System.out.println(num1+"is bigger then"+num2);
			
			
		}else if (num1<num2) {
			
			
			System.out.println(num1+"is smaller then"+2);
			
			
			
		} else {
			
			
			System.out.println(num1+"is equal to"+num2);
			
			/* based on the day of the week will print class schedule 
			 * 
			 */
			
			int day=11;
			
			if (day==1) {
				
				
				System.out.println("today is monday we have no class");
			}else if (day==2) {
				System.out.println("Today is Tuesday we have Manual class");
		
			}else if (day==3) {
				
				System.out.println("Today is wednesday and we have Manual class again");
			}else if (day==4) {
				
				System.out.println("Today is Thursday and we have Review Class");
				
			}else if (day==5) {
				
				System.out.println("Today is Friday but I have class tomorrow and i will prepare");
				
			}else if (day==6) {
				System.out.println("Today is saturday, i have missed java classes");
				
			}else if (day==7) {
				
				System.out.println("today is sunday i did a lot of coding");
				
			}else {
				
				System.out.println("This is invalid entry, please provide valid day from 1to 7");
				
				
				
				
				
				
			}
			
			
		}
			
			
			
		}
				
}
