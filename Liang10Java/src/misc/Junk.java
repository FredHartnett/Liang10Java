package Misc;

public class Junk {
	
	public static void main(String[] args) {
		/*
		StringBuilder stringBuilder1 = new StringBuilder();
		stringBuilder1.append("welcome");
		stringBuilder1.append(' ');
		stringBuilder1.append("to");
		stringBuilder1.append(' ');
		stringBuilder1.append("java");
		
		System.out.println("stringBuilder1 before creating stringBuilder2: " + stringBuilder1.toString());
		
		StringBuilder stringBuilder2 = stringBuilder1.reverse();
		
		System.out.println("stringBuilder2: " + stringBuilder2.toString());
		
		System.out.println("stringBuilder1 after creating stringBuilder2: " + stringBuilder1.toString());
		*/
		
		String[] fruits = new String[] {"Orange", "Apple", "Pear", "Strawberry", "Banana"};
		
		for(String stuff : fruits) {
			System.out.println(stuff);
		}
		
		
	}
}
