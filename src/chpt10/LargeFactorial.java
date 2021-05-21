package chpt10;

import java.math.*;

//Intro to Java Programming 10th ed. Y. Daniel Liang

public class LargeFactorial {
	public static void main(String[] args) {
		System.out.println("10! is \n" + factorial(10));
	}

	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		for(int i = 1; i <= n; i++)
			result = result.multiply(new BigInteger(i + ""));
	
	return result;	
	}
}