package activities;

import java.util.ArrayList;


public class Activity9 {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Dharani");
		myList.add("Vidhi");
		myList.add("Mani");
		myList.add("Ram");
		myList.add("Madhav");
		System.out.println("Printing all the name in myList :");
		for(int i=0; i<myList.size();i++)
		{
			System.out.println(myList.get(i));
		}
		// TODO Auto-generated method stub
	
		System.out.println("Retrieving 3rd name" + myList.get(2));
		
		if (myList.contains("Madhav"))
			System.out.println("The name is present");
		else
			System.out.println("The name is not present");
		
		System.out.println("The size of the array is " + myList.size());
		
		System.out.println("Removing a name from the list");
		myList.remove("Dharani");
		System.out.println("The current size of the array is " + myList.size());
		
		}
}
	 
