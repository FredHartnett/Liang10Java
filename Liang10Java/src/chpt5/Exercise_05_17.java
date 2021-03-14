package chpt5;

import java.util.Scanner;

//Intro to Java Programming 10th ed. Y. Daniel Liang
//Exercise 5.17 p.193 (216)
//Class:


/*
 Display a pyramid of numbers
 */

public class Exercise_05_17 {
	
	public static void main(String[] args) {		
		int numOfLines = 0;		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		numOfLines = input.nextInt();
		
		for(int i = 1; i <= numOfLines; i++) {
			
			//this prints the numbers descending with a space after
			for(int j = numOfLines; j >= 1; j--) {
				if(j <= i)
					//debug System.out.print("*" + j);
					System.out.print(j + " ");
				else
					System.out.print("  ");
			}
			
			//this prints the numbers ascending with a space after
			for(int x = 2; x <= i; x++) {
				if(x <= i)
					System.out.print(x + " ");
			}
			
			System.out.println();
		}
		
		
		
//		for(int i = 1; i <= numOfLines; i++) {
//			for(int j = numOfLines; j >= i; j--) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		/*
		sample output...
		Enter the number of lines: 7
		7 6 5 4 3 2 1 
		7 6 5 4 3 2 
		7 6 5 4 3 
		7 6 5 4 
		7 6 5 
		7 6 
		7 		
		*/		
	}
}
