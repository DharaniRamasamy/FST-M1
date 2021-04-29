package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = { 8, 1, 7, 5, 2, 6 };
		System.out.println("Array Before sorting :" + Arrays.toString(numbers));
		insertionSort(numbers);
		System.out.println("Array After sorting :" + Arrays.toString(numbers));
	    }
	
	 static void insertionSort(int numbers[]) {
	        int size = numbers.length;
	        for (int i = 1; i < size; i++) 
	        {
	            int key = numbers[i];
	            int j = i - 1;
	             while (j >= 0 && key < numbers[j]) 
	             {
	                numbers[j + 1] = numbers[j];
	                --j;
	            }
	            numbers[j + 1] = key;
	        }
	    }
	}

