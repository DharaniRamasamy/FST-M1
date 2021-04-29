package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> colours = new HashMap<Integer,String>();
		colours.put(1,"Red");
		colours.put(2,"Blue");
		colours.put(3,"Green");
		colours.put(4,"Yellow");
		colours.put(5,"Orange");
		
		System.out.println("Printing the map colour :" + colours);
		System.out.println("removing the first entry in the map");
		colours.remove(1);
		System.out.println("Is the green colour exists in the colours ? " + colours.containsValue("Green"));
		
		System.out.println("Current size of the map is " + colours.size());
		
		System.out.println("Printing the updated map colour :" + colours);
				

	}

}
