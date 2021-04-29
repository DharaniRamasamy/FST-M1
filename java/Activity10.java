package activities;

import java.util.HashSet;

public class Activity10 {
	

	public static void main(String[] args) {
		
	HashSet<String> hs=new HashSet<String>();
	hs.add("Jan");
	hs.add("Feb");
	hs.add("Mar");
	hs.add("Apr");
	hs.add("May");
	hs.add("June");
	
	System.out.println("Original hashset is " + hs);
	System.out.println("Size of the HashSet is " + hs.size());

	System.out.println("Removing Feb from the Hashset" + hs.remove("Feb"));
	if (hs.remove(10))
		System.out.println("10 is removed");
	else
		System.out.println("10 is not removed");
	
	System.out.println("Is the string Apr present in the HashSet ? " + hs.contains("Apr"));
	
	System.out.println("Printing the updated Hashset" + hs);
	
	
	}
}
