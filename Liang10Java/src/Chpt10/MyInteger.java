package Chpt10;
//exercise 10.3

public class MyInteger {
	private int value;
	
	public MyInteger(int x) {
		this.value = x;
	}
	
//	methods
	public int getValue() {
		return value;		
	}
	
	public boolean isEven() {
		boolean result;
		result = (value % 2 == 0) ? true : false;
		
		return result;
	}
	
	public boolean isOdd() {
		boolean result;
		result = (value % 2 == 0) ? false : true;
		
		return result;
	}
	
	public boolean isPrime() {
		double range = Math.sqrt(value);
        for(int i = 2; i <= range; i++) {
            if (value % i == 0) return false;
        }
        return true;
	}
	
	
//static methods	
	public static boolean isEven(int value) {
		boolean result;
		result = (value % 2 == 0) ? true : false;
		
		return result;
	}
	
	public static boolean isOdd(int value) {
		boolean result;
		result = (value % 2 == 0) ? false : true;
		
		return result;
	}
	
	public static boolean isPrime(int value) {
		double range = Math.sqrt(value);
        for(int i = 2; i <= range; i++) {
            if (value % i == 0) return false;
        }
        return true;
	}
	
	
//static method with object	
	public static boolean isEven(MyInteger myInteger) {
	    return myInteger.isEven();
	}

	public static boolean isOdd(MyInteger myInteger) {
	     return myInteger.isOdd();
	}

	public static boolean isPrime(MyInteger myInteger) {
	      return myInteger.isPrime();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
