package chpt5;

import java.util.Scanner;

//Exercise 5.1 p.192 (215)
//Class: CountNums


/*
 (Count positive and negative numbers and compute the average of numbers) Write a program that reads an unspecified number of integers, 
 determines how many positive and negative values have been read, and computes the total and average of the input values 
 (not counting zeros). Your program ends with the input 0. Display the average as a floating-point number. Here is a sample run:

Enter an integer, the input ends if it is 0: 1 2 -1 3 0
The number of positives is 3 The number of negatives is 1 The total is 5.0
The average is 1.25

Enter an integer, the input ends if it is 0: 0
No numbers are entered except 0 
 
 */

public class Exercise_05_01 {
	
	public static void main(String[] args) {
		boolean acceptInput = true;
		int num = 0;
		Scanner input = new Scanner(System.in);	
		
		CountNums cn = new CountNums();
		
		while(acceptInput) {
			System.out.print("Enter an integer, the input ends if it is 0... ");
			
			num = input.nextInt();
			
			if(num == 0) {
				acceptInput = false;
				break;
			}
			else
				cn.processNum(num);
		}
		
		
		
		System.out.println();
		System.out.println("******************************************************");
		System.out.println();
		System.out.println(cn.output());		
	}
}
