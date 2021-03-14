package chpt5;

//Intro to Java Programming 10th ed. Y. Daniel Liang

public class BaseHelper {
	private int index;
	Tuition[] array;

	public void setIndex(int s, Tuition[] t) {
		int year = s;		
		array = t;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i].getYear() == year)
				index = i;
		}		
		//return index;
	}

	

	public double calcFourConsecutiveYearsOfTuition() {
		double fourYearsTuition = 0.0;
			for(int i = index; i <= index + 3; i++) {
				fourYearsTuition += array[i].getAnnualTuition();
			}
		return fourYearsTuition;		
	}

}
