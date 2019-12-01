package chpt9;
import java.util.Scanner;

public class Exercise09_06 {
	public static void main(String[] xyz) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter a string: ");
		String string = input.nextLine();
		
		int[] counts = countLetters(string);
		int totalLetters = 0;
		
		for(int i = 0; i < counts.length; i++) {
			totalLetters = totalLetters + counts[i];
		}
		
		System.out.print("The string entered is: ");
		for(int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i));
		}
		System.out.println("");
		System.out.println("Total number of letters: " + totalLetters);
		
		String letters = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 0; i < counts.length; i++) {
			System.out.println(letters.charAt(i) + " appears " + counts[i] + " time/s");
		}
		
	} //end of main

	public static int[] countLetters(String s) {
		int[] result = new int[26];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = 0;
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				result[s.charAt(i) - 'a']++;
			}
		}
		return result;
	} // end method
} // end of class