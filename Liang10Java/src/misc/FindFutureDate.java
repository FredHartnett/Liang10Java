package Misc;
import java.util.Scanner;

//exercise 3.5 page 122

public class FindFutureDate {
	public static void main(String[] args){
		int dayOfWeek = 0;
		int futureDayOfWeek = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"Enter today's day...");
		
		dayOfWeek = input.nextInt();		
		
		System.out.print("The day of the week is ");
		
		switch(dayOfWeek){
			case 0: System.out.println("Sunday.");
					break;
			case 1: System.out.println("Monday.");
					break;
			case 2: System.out.println("Tuesday.");
					break;
			case 3: System.out.println("Wednesday.");
					break;
			case 4: System.out.println("Thursday.");
					break;			
			case 5: System.out.println("Friday.");
					break;			
			case 6: System.out.println("Saturday.");
					break;
			default: System.out.print("ERROR: invalid day of the week entered!!!");
					System.exit(1);			
		}
		
		System.out.print(
				"Enter number of days elapsed since today...");
		
		futureDayOfWeek = input.nextInt();
		
		System.out.print("The future day of the week is ");
		
		switch((dayOfWeek + futureDayOfWeek) % 7){
			case 0: System.out.println("Sunday.");
					break;
			case 1: System.out.println("Monday.");
					break;
			case 2: System.out.println("Tuesday.");
					break;
			case 3: System.out.println("Wednesday.");
					break;
			case 4: System.out.println("Thursday.");
					break;			
			case 5: System.out.println("Friday.");
					break;			
			case 6: System.out.println("Saturday.");
					break;					
		}		
	}
}
