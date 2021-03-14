package chpt9;
import java.util.Scanner;

//Exercise 9.1 "Check SSN"
//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Exercise09_01 {
	public static void main(String[] wow){
		boolean ssn = true;
		int place = 0;
		
		Scanner input = new Scanner(System.in);		
		System.out.print("Please enter SSN (xxx-xx-xxxx) ");		
		String s = input.nextLine();
		
/* using regex to do the checking		
		if(s.matches("\\d{3}-\\d{2}-\\d{4}")){
			System.out.println("VALID SSN FORMAT");
		} else{
			System.out.println("INVALID SSN FORMAT");
		}
*/
		
		for (int i = 0; i < s.length(); i++){
			if((i == 3 || i ==6) && s.charAt(i) == '-'){
				continue;
			}
				
			if(!Character.isDigit(s.charAt(i))){
				ssn = false;
				place = i;
				break;
			}			
		}
		
		
		if(ssn){
			System.out.println("valid ssn format");
		} else
			System.out.println("invalid ssn format " + place);
	}
}
