package chpt8;

import java.util.Random;

//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Exercise08_04 {

	public static void main(String[] args) {
		Random rand = new Random(1000);
		
		for(int i = 0; i < 50; i++){
			System.out.println((i + 1) + ". " + rand.nextInt(100));
		}
	}
}
