package chpt5;

//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Tuition {
	static final double BASE_TUITION = 10000.00;
	static final int STARTING_YEAR = 2020;
	private double annualTuition = 0.0;
	private int year;
	private static int greatestYear = 1900;

	public Tuition(int x) {
		
		this.year = STARTING_YEAR + x;
		this.annualTuition = BASE_TUITION;
		
		if(this.year > greatestYear)
			greatestYear = this.year;
		
		if(x > 0)
			calcTuition(x);		
	}

	private void calcTuition(int x) {
		
		for(int i = 0; i < x; i++)
			annualTuition += (annualTuition * 0.05);		
	}	
	
	public double getAnnualTuition() {
		return annualTuition;
	}

	public int getYear() {
		return year;
	}	

	public static int getGreatestYear() {
		return greatestYear;
	}	

	public static int getStartingYear() {
		return STARTING_YEAR;
	}

	@Override
	public String toString() {
		return "Tuition year: " + Integer.toString(year) + "\n" +
				"Tuition amount: " + String.format("%.2f", annualTuition);	
	}
	
}
