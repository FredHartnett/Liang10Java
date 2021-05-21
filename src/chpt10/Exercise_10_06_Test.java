package chpt10;

//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Exercise_10_06_Test {
	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers(10);		
		
		for(int i = 2; i < 120; i++) {
			if(MyInteger.isPrime(i))
				stack.push(i);
		}
		
		while(!stack.empty())
			System.out.print(stack.pop() + " ");		
	}

}
