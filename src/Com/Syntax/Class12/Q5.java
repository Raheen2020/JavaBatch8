package Com.Syntax.Class12;

import Com.Syntax.class09.Arrays;

public class Q5 {

	public static void main(String[] args) {
		

		/*
		 * 
		 * Write a java program to find the second largest number in the array?
		 */
		
		int[] array = { 8, 4, 9, 2, 15, 20, 19, 3 };
		int max = array[0];
		int secMax = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		for (int j = 1; j < array.length; j++) {
			if (array[j] > secMax && array[j] < max) {
				secMax = array[j];
			}
		}
		System.out.println("Second largest number is :" + max);
		System.out.println("Second largest number is :" + secMax);
		
		
	}

}
