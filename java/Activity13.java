package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter the numbers to be added to the array and press any character once done");
		
		while(scan.hasNextInt())
		{
		int num1=scan.nextInt();
		list.add(num1);
		}
		
		Random indexGen=new Random();
		int randomgennum=indexGen.nextInt(list.size());
		System.out.println("The randomly generated number is " + randomgennum);
		System.out.println("value of the generated index: " + list.get(randomgennum));
		
		System.out.println("Printing values after converting the list to an array");
		Integer arr[]=list.toArray(new Integer[0]);
		System.out.println("value of the generated index - printing from array:" + arr[randomgennum]);
		scan.close();		

	}

}
