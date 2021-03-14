package chpt9;
import java.util.Scanner;

//Exercise 9.2 "Check Substrings"
//Is the "first" string a substring of the "second" string
//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Exercise09_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the first string: ");
		String first = input.nextLine();
		
		System.out.print("enter the second string: ");
		String second = input.nextLine();
		
		if (isSubstring(first, second)) {
		      System.out.println(first + " is a substring of " + second);
		 }
		    else {
		      System.out.println(first + " is not a substring of " + second);
		 }

	}//end main
	
	//check to see if the first string is a substring of the second string
	public static boolean isSubstring(String first, String second) {
		int remainingLength = second.length();
		int startingIndex = 0;
		
		toWhile:
		while (first.length() <= remainingLength) {
			for (int i = 0; i < first.length(); i++) {				
				if (first.charAt(i) != second.charAt(startingIndex + i)) {
					startingIndex++;
					remainingLength--;
					continue toWhile;
				}					
			}
			return true;
		}
		return false;		
	}//end isSubstring
}
