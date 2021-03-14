package chpt9;

import java.util.Scanner;

//exercise 9.11 Sort characters in a string
//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Exercise09_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.nextLine();		
		
		System.out.println("Sorted: " + sort(string));		
	}
	
	
	public static String sort(String s) {
		char[] array = s.toCharArray();
		selectionSort(array);
		s = String.valueOf(array);
		return s;
	}
	
	public static void selectionSort(char[] list) {
		  for (int i = 0; i < list.length - 1; i++) {		   
		   char currentMin = list[i];
		   int currentMinIndex = i;
		 
		   	for (int j = i + 1; j < list.length; j++) {
		   		if (currentMin > list[j]) {
		   			currentMin = list[j];
		   			currentMinIndex = j;
		   		}
		   	}
		 
		   // Swap list[i] with list[currentMinIndex] if necessary
		   if (currentMinIndex != i) {
		    list[currentMinIndex] = list[i];
		    list[i] = currentMin;
		   	}
		  }
	}
}
