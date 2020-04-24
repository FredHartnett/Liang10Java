package chpt11;

/*
(Remove duplicates) Write a method that removes the duplicate elements from
an array list of integers using the following header:

public static void removeDuplicate(ArrayList<Integer> list)

Write a test program that prompts the user to enter 10 integers to a list and displays
the distinct integers separated by exactly one space.
 */

//Exercise 11.13 p.447 (470)
//Class: Exercise_11_13

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_13 {
	
	static ArrayList<Integer> unfilteredList = new ArrayList<Integer>();
	static ArrayList<Integer> filteredList = new ArrayList<Integer>();
	
    public static void main(String[] args) {    	
    	//add values
    	unfilteredList.add(34);
    	unfilteredList.add(5);
    	unfilteredList.add(3);
    	unfilteredList.add(5);
    	unfilteredList.add(6);
    	unfilteredList.add(4);
    	unfilteredList.add(33);
    	unfilteredList.add(2);
    	unfilteredList.add(2);
    	unfilteredList.add(4);    	
    	
    	
    	System.out.println("The unfiltered list of integers contains: ");       
        
        for(int value : unfilteredList) {
        	System.out.print(value + " ");
        }
        System.out.println("");
        System.out.println("************************************************"); 
        System.out.println("************************************************"); 
        
        removeTheDuplicates(unfilteredList);
        
        System.out.println("The filtered list of integers contains:");
        
    	for(int value : filteredList) {
        	System.out.print(value + " ");
        } 
    	
    	//the filtered (dupes removed) listing should be...
    	// -> 34 5 3 6 4 33 2
    }    
    
    public static void removeTheDuplicates(ArrayList<Integer> tempList) {
    	filteredList = tempList;    	
    	
    	for(int x = 0; x < filteredList.size()-1; x++) {
    		for(int y = x+1; y < filteredList.size(); y++) {    			
    			if(filteredList.get(x) == filteredList.get(y)) {
    				filteredList.remove(x);
    				y -= 1;
    			}
    		}    		
    	}    	 			
    }
} 
