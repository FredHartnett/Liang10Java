package chpt9;
import java.util.Scanner;

//Exercise 9.3 "Check Password"

public class Exercise09_03 {
	public static void main(String[] blah) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String password = input.nextLine();
		
		boolean isValid = isValidPassword(password);
		
		if(isValid) {
			System.out.println("password is valid!");
		} else
			System.out.println("password is invalid!");
	}//end main
	
	public static boolean isValidPassword(String s) {		
		int numOfDigits = 0;
		
		if(s.length() < 8) {
			return false;
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				numOfDigits++;
			}
			
			if(i == (s.length()-1) && numOfDigits < 2) {
				return false;
			}
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(!Character.isLetterOrDigit(s.charAt(i))) {
				return false;
			}
		}
		
		return true;		
	}
}
