package chpt5;

import java.util.Scanner;

//Exercise 5.7 p.193 (216)
//Class: Tuition, BaseHelper


/*
 (Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 
this year and increases 5% every year. In one year, the tuition will be $10,500. Write a program that 
computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year. 
 */

public class Exercise_05_07 {
	
	public static void main(String[] args) {
		Tuition[] t = new Tuition[50];
		boolean invalidInput = true;
		BaseHelper bh = new BaseHelper();		
		
		for(int i = 0; i< t.length; i++) {
			
			t[i] = new Tuition(i);
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Select the year you want to start school.");
		System.out.print("If you select 2031, you will see a total sum for ");
		System.out.println("2031, 2032, 2033 and 2034.");
		System.out.print("Enter a year that falls within this range 1: " + Integer.toString(Tuition.getStartingYear())+ 
						" - " + Integer.toString((Tuition.getGreatestYear() - 3)) + "...");
		
		while(invalidInput) {
			int s = input.nextInt();
			
			if((s < Tuition.getStartingYear()) || ((s+3) > Tuition.getGreatestYear())) {
			
				System.out.print("Please enter a year that falls within this range 2: " + Integer.toString(Tuition.getStartingYear())+ 
						" - " + Integer.toString((Tuition.getGreatestYear() - 3)) + "...");	
			} else {
				invalidInput = false;
				//index = bh.getIndex(s,t);
				bh.setIndex(s,t);
				System.out.println("If you started school in " + Integer.toString(s) + " four (4) consecutive years of tution would cost you...");
				System.out.println(String.format("$%.2f", bh.calcFourConsecutiveYearsOfTuition()).replace("$0.", "$."));
				//if i entered 2066 as my start year, the sum for tuition would be $406,628.32				
			}
		}		
	}
}
