package Com.Syntax.Class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * variable for allergy -yes or no 
		 * 
		 * if allergy is yes -->
		 *           we will check if pet allergy 
		 *                         if peanut allergy 
		 *                         if pollen allergy
		 * if no allergy you are lucky !!!                        
		 */
		
		boolean  allergy=true;
		boolean  petAllergy=false;
		boolean  peanutAllergy=true;
		boolean  pollenAllergy=false;
		
		if (allergy) {
			System.out.println("Lets do further check");
			
			if (petAllergy) {
				System.out.println("please no cats or dogs on the house");
			}else {
				System.out.println("That is good you dont have pet Allergy");
			}
			
			
		}else {
			System.out.println("you are lucky");
		}
		
		
		
		
		System.out.println("---------------Example2---------------");
		
		
		/*
		 * if today is friday we will watch movie but would like to check the date 
		 * 
		 *                if date is 13----. watch scary movie 
		 *                and if it is not ------. i will watch comedy, action
		 *                
		 * if no Friday ----. i am studying                
		 */
		
		
		boolean isFriday=true;
		int date=4;
		boolean monday=true;
		
		if (isFriday) {
			
		if (date==13) {
			System.out.println("i will watch scary movie");
		}else {
			System.out.println("I will watch PK movie with Amir khan");
		}
			
			
		}else {
			System.out.println("Today is not Friday, I am studying");
			
			if (monday) {
				System.out.println("I am not sudying , I am working ");
				
			}else {
				System.out.println(" I Have class at Syntax");
			}
		}
		

		System.out.println("---------------Example 3 -------------");
		
		/*
		 * check if assignment is completed if assignment is completed: if score >90 --
		 * great job if score >80 -- good job if score >70 -- study more
		 *
		 */
		boolean assignment = true;
		byte score = 100;
		if (assignment) {
			
		
			if (score > 90) {
				System.out.println("Great job");
			} else if (score > 80) {
				System.out.println("Good job");
			} else if (score > 70) {
				System.out.println("Study more");
			} else {
				System.out.println("You are failing");
			}
			} else {
				System.out.println("Nothing submitted");
			}
	}
		}
