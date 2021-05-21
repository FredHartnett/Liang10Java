package chpt6;

import java.util.Arrays;

//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Exercise06_07 {

	public static void main(String[] args) {
		
		final int NUM_OF_NUMBERS = 10;
		int count = 0;
		
		int[] numbers = new int[NUM_OF_NUMBERS];
		
		while(count < NUM_OF_NUMBERS){
			int x = (int)(1 + Math.random() * 50);
			System.out.println(x);
			
			//numbers[x]++;
			
			count++;
		}
		
		//System.out.println(Arrays.toString(numbers));

	}

}
