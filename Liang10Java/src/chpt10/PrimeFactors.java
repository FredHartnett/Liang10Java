package chpt10;
//exercise 10.5 Display the prime factors (does not do all that the exercise wants, but this works)
//Intro to Java Programming 10th ed. Y. Daniel Liang

public class PrimeFactors {	
	public 	int		value;
	
	PrimeFactors(int x) {
		this.value = x;
		System.out.println(value + " prime factorized is: " + primeFactoriziationFactory());
	}
	
	public boolean isPrime(int x) {
		double range = Math.sqrt(x);
        for(int i = 2; i <= range; i++) {
            if (x % i == 0) return false;
        }
        return true;
	}
	
	private String primeFactoriziationFactory() {
// dividend/divisor=quotient
		int dividend = value;
		int divisor = 0;
		boolean primeFound = false;
		String primes = "";
		
		while(!primeFound) {			
			if(isPrime(dividend)) {
				primeFound = true;
				primes = primes + Integer.toString(dividend);				
			} else {
				for(int i = 2; i <= Math.sqrt(dividend); i++) {
					divisor = i;
		            if(dividend % divisor == 0) {		            	
		            	if(isPrime(divisor)) {
		            		dividend = dividend/divisor;
			            	primes = primes + Integer.toString(divisor) + " * ";
		            	}		            		           
		            }
		        }
			}		
		}
	return primes;		
	}
}
