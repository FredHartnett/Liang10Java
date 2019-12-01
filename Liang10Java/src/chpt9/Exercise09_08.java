package chpt9;
import java.util.Scanner;

//exercise 9.8 Binary to decimal

public class Exercise09_08 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary string...    ");
		String binaryString = input.nextLine();
		
		System.out.print("The binary string entered was ");
		for(int i = 0; i < binaryString.length(); i++) {
			System.out.print(binaryString.charAt(i));
		}
		System.out.println("");
		System.out.println(binaryString.length());
		System.out.println("The decimal value is:   " + binaryToDecimal(binaryString));
	}	
	
	public static int binaryToDecimal(String binaryString) {
		/* my code (works!!!)
		int exponent = binaryString.length() - 1;
		int myInteger = 0;
		int myMultiplier = 0;		
		
		for(int k = 0; k < binaryString.length(); k++) {
			for(int z = 1; z <= exponent; z++) {
				if(z == 1) {
					myMultiplier = 2;
				} else {
					myMultiplier = myMultiplier * 2;
				}
			}
			
			if(exponent > 0) {
				myInteger = myInteger + Character.getNumericValue(binaryString.charAt(k)) * myMultiplier;
			} else {
				myInteger = myInteger + Character.getNumericValue(binaryString.charAt(k));
			}			
			myMultiplier = 0;
			exponent--;
		}	
		
		return myInteger; */
		//code from the text
		int value = binaryString.charAt(0) - '0';
	    for (int i = 1; i < binaryString.length(); i++) {
	      value = value * 2 + binaryString.charAt(i) - '0';
	    }

	    return value;
	  }
	}