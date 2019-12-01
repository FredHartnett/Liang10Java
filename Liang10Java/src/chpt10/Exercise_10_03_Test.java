package chpt10;

//exercise 10.3 MyInteger class

public class Exercise_10_03_Test {
	public static void main(String[] args) {

//for the methods section
//		MyInteger num1 = new MyInteger(961748927);		
//		System.out.printf("Number 1 = %d isPrime: %b isOdd: %b isEven %b\n",
//                num1.getValue(), num1.isPrime(), num1.isOdd(), num1.isEven());

//for static methods section
//		int x = 37;
//		System.out.printf("isPrime: %b isOdd: %b isEven %b\n",
//				MyInteger.isPrime(x), MyInteger.isOdd(x), MyInteger.isEven(x));
		
//for the methods with object section
		MyInteger num1 = new MyInteger(961748927);		
		System.out.printf("isPrime: %b isOdd: %b isEven %b\n",
				MyInteger.isPrime(num1), MyInteger.isOdd(num1), MyInteger.isEven(num1));
		
		
	}

}
