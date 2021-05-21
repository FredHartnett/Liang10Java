package chpt9;

import java.util.Scanner;

//exercise 9.12 Anagrams
//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Exercise09_12 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String string1 = input.nextLine();
		
		System.out.print("Enter second string: ");
		String string2 = input.nextLine();
		System.out.println("");
		
		boolean anagram = isAnagram(string1, string2);		
		
		if(anagram) {
			System.out.println("These strings are anagrams");
		} else 
			System.out.println("These strings are not anagrams");		
	}
	
	public static boolean isAnagram(String s1, String s2) {		
		
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		
		for(int i = 0; i < s1.length(); i++) {
			if(Character.isLetter(s1.charAt(i)))
				count1[s1.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < s2.length(); i++) {
			if(Character.isLetter(s1.charAt(i)))
				count2[s2.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < count1.length; i++) {
			if(count1[i] != count2[i]) {
				return false;
			}
		}
		
		return true;
	}
}
