package chpt9;
import java.util.Scanner;

//Exercise 9.5 "occurrences of each digit in a string"

public class Exercise09_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string with digits, letters and special characters: ");
		String mixedString = input.nextLine();
		
		int[] counts = count(mixedString);
		
		for(int i = 0; i < counts.length; i++) {
			System.out.println(i + " appears " + counts[i] + " times!!!");
		}
		
	}//end main
	
	
	public static int[] count(String s) {
		int[] result = new int[10];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = 0;
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				result[s.charAt(i) - '0']++;
			}
		}
		
		return result;		
	}//end count
}