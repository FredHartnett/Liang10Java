package chpt5;

//Intro to Java Programming 10th ed. Y. Daniel Liang

public class CountNums {
	private int countOfPositiveInts = 0;
	private int countOfNegativeInts = 0;
	private int sumOfInts = 0;
	
	public void processNum(int num) {
		sumOfInts += num;
		
		if(num < 0)
			countOfNegativeInts++;
		else
			countOfPositiveInts++;		
	}
	
	public int getCountOfPositiveInts() {
		return countOfPositiveInts;
	}

	public int getCountOfNegativeInts() {
		return countOfNegativeInts;
	}

	public int getSumOfInts() {
		return sumOfInts;
	}
	
	public double getAverage() {
		return getSumOfInts() / (double)(getCountOfPositiveInts() + getCountOfNegativeInts());
	}
	
	public String output() {
		return 	"The number of positives is " + Integer.toString(getCountOfPositiveInts()) + "\n" +
				"The number of negatives is " + Integer.toString(getCountOfNegativeInts()) + "\n" +
				"The total is " + Integer.toString(getSumOfInts()) + "\n" +
				"The average is " + Double.toString(getAverage());		
	}
}
